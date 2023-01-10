package com.jvaleto.barmatic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class onlineQuizQuestions extends AppCompatActivity {

    private TextView quizTimer;

    private RelativeLayout option1Layout, option2Layout, option3Layout, option4Layout;
    private TextView option1TV, option2TV, option3TV, option4TV;
    private ImageView option1Icon, option2Icon, option3Icon, option4Icon;

    private TextView questionTV;
    private TextView totalQuestionTV;
    private TextView currentQuestion;

    private final List<OnlineQuestionsList> questionsLists = new ArrayList<>();

    // url database
    // creating database reference from firebase
    private final DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://appbarmatic-default-rtdb.firebaseio.com/");

    // countDown timer for quiz
    private CountDownTimer countDownTimer;

    // current questions position by default 0 (first questions)
    private int currentQuestionPosition = 0;

    // select option number . value must be between 1 -4  (we hace for option) . 0 means no option is selected
    private int selectedOption = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_quiz_questions);

        quizTimer = findViewById(R.id.quiztimer);

        option1Layout = findViewById(R.id.option1Layout);
        option2Layout = findViewById(R.id.option2Layout);
        option3Layout = findViewById(R.id.option3Layout);
        option4Layout = findViewById(R.id.option4Layout);

        option1TV = findViewById(R.id.option1TV);
        option2TV = findViewById(R.id.option2TV);
        option3TV = findViewById(R.id.option3TV);
        option4TV = findViewById(R.id.option4TV);

        option1Icon = findViewById(R.id.option1Icon);
        option2Icon = findViewById(R.id.option2Icon);
        option3Icon = findViewById(R.id.option3Icon);
        option4Icon = findViewById(R.id.option4Icon);

        questionTV = findViewById(R.id.questionTV);

        totalQuestionTV = findViewById(R.id.totalQuestionTV);
        currentQuestion = findViewById(R.id.currentQuestionTV);

        final AppCompatButton nextBtn = findViewById(R.id.nextQuestionBtn);

        // show instructions dialog
        InstructionDialog instructionDialog = new InstructionDialog(onlineQuizQuestions.this);
        instructionDialog.setCancelable(false);
        instructionDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        instructionDialog.show();


        // getting data(question) from firebase
        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                // variable "time " in db
                final int getQuizTime =  Integer.parseInt(snapshot.child("time").getValue(String.class));

                // variable "questions" for db
                for (DataSnapshot questions : snapshot.child("questions").getChildren()){

                    String getQuestion =  questions.child("question").getValue(String.class);
                    String getOption1 =  questions.child("option1").getValue(String.class);
                    String getOption2 =  questions.child("option2").getValue(String.class);
                    String getOption3 =  questions.child("option3").getValue(String.class);
                    String getOption4 =  questions.child("option4").getValue(String.class);

                    // im using string here to database value must be in string form
                    int getAnswer =  Integer.parseInt(questions.child("answer").getValue(String.class));

                    //creating questions list online object and add detail
                    OnlineQuestionsList questionsList = new OnlineQuestionsList(getQuestion, getOption1, getOption2,getOption3,getOption4,getAnswer);

                    // adding questionslistOnline object into the list
                    questionsLists.add(questionsList);
                }
                // setting total questions  to textView
                totalQuestionTV.setText("/"+(questionsLists.size()));

                // start quiz timer and pass max time in seconds
                startQuizTimer(getQuizTime);

                //select firs questions  by default
                selectQuestion(currentQuestionPosition);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // error en conexion con firebase
                Toast.makeText(onlineQuizQuestions.this, "Error:'ETH001', Verifique su conexión a internet", Toast.LENGTH_SHORT).show();
            }
        });

        option1Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // assign 1 as first option is selected
                selectedOption = 1;

                //select option
                selectOption(option1Layout, option1Icon);
            }
        });
        option2Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // assign 2 as seconds option is selected
                selectedOption = 2;

                //select option
                selectOption(option2Layout, option2Icon);
            }
        });
        option3Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // assign 3 as third option is selected
                selectedOption = 3;

                //select option
                selectOption(option3Layout, option3Icon);
            }
        });
        option4Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // assign 4 as fourth option is selected
                selectedOption = 4;

                //select option
                selectOption(option4Layout, option4Icon);
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // check f user has select  an option or not
                if(selectedOption != 0){

                    // set user select  answer
                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOption);

                    //reset select option to default value(0)
                    selectedOption = 0;

                    // increase current question value to getting next questions
                    currentQuestionPosition++;

                    // check if list has more questions
                    if(currentQuestionPosition < questionsLists.size()){
                        selectQuestion(currentQuestionPosition); // select questions / next question
                    }
                    else {
                        // list has no questions left so finish the quiz
                        countDownTimer.cancel(); // stop countdown timer
                        finishQuiz();
                    }
                }
                else{
                    Toast.makeText(onlineQuizQuestions.this, "Debes seleccionar una opción", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void finishQuiz(){
        // creating intent to open quizResult activity
        Intent i = new Intent(onlineQuizQuestions.this, onlineQuizResult.class);

        //creating bundle to pass quizQuestionLists
        Bundle bundle = new Bundle();
        bundle.putSerializable("questions", (Serializable) questionsLists);

        // add bundle to intent
        i.putExtras(bundle);
        startActivity(i);

        //destroy
        finish();
    }

    private void startQuizTimer(int maxTimeInSeconds){

        countDownTimer = new CountDownTimer(maxTimeInSeconds * 1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                long getHour = TimeUnit.MILLISECONDS.toHours(millisUntilFinished);
                long getMinute = TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished);
                long getSecond = TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished);

                String generateTime = String.format(Locale.getDefault(), "%02d:%02d:%02d", getHour,
                        getMinute - TimeUnit.HOURS.toMinutes(getHour),
                        getSecond - TimeUnit.MINUTES.toSeconds(getMinute));

                quizTimer.setText(generateTime);
            }

            @Override
            public void onFinish() {

                // finish quiz when time i finished
                Toast.makeText(onlineQuizQuestions.this, "Tiempo agotado", Toast.LENGTH_SHORT).show();
                finishQuiz();
            }
        };
        // start timer
        countDownTimer.start();
    }

    private void selectQuestion(int questionListPosition){
        // reset option for new question
        resetOptions();

        // getting question details and set to textViews
        questionTV.setText(questionsLists.get(questionListPosition).getQuestion());
        option1TV.setText(questionsLists.get(questionListPosition).getOption1());
        option2TV.setText(questionsLists.get(questionListPosition).getOption2());
        option3TV.setText(questionsLists.get(questionListPosition).getOption3());
        option4TV.setText(questionsLists.get(questionListPosition).getOption4());

        // setting current questions number to textView
        currentQuestion.setText("Pregunta "+(questionListPosition+1));
    }

    private void resetOptions(){
        option1Layout.setBackgroundResource(R.drawable.round_back_white50_10);
        option2Layout.setBackgroundResource(R.drawable.round_back_white50_10);
        option3Layout.setBackgroundResource(R.drawable.round_back_white50_10);
        option4Layout.setBackgroundResource(R.drawable.round_back_white50_10);

        option1Icon.setImageResource(R.drawable.round_back_white50_100);
        option2Icon.setImageResource(R.drawable.round_back_white50_100);
        option3Icon.setImageResource(R.drawable.round_back_white50_100);
        option4Icon.setImageResource(R.drawable.round_back_white50_100);

    }

    private void selectOption(RelativeLayout selectedOptionLayout, ImageView selectedOptionIcon){

        // reset option to select new option
        resetOptions();

        selectedOptionIcon.setImageResource(R.drawable.check_black);
        selectedOptionLayout.setBackgroundResource(R.drawable.round_back_green10);
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(onlineQuizQuestions.this, onlineQuiz.class);
        startActivity(i);
    }
}