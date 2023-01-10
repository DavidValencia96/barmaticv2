package com.jvaleto.barmatic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class onlineQuizResult extends AppCompatActivity {

    private List<OnlineQuestionsList> questionsLists = new ArrayList<>();

    // url team WP
    String _url_wp = "https://chat.whatsapp.com/D7oiGfS9ZCtAe9euBhwZRP";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_quiz_result);

        final TextView scoreTV = findViewById(R.id.scroreTv);
        final TextView totalScoreTv = findViewById(R.id.totalScoreTV);
        final TextView correctTV = findViewById(R.id.correctTv);
        final TextView incorrectTV = findViewById(R.id.incorrectTv);

        final AppCompatButton shareBtn = findViewById(R.id.shareBtn);
        final AppCompatButton reTakeBtn = findViewById(R.id.reTakeQuiz);
        final AppCompatButton wpTeamBtn = findViewById(R.id.url_wp_Btn);


        // getting questions list from onlineQuizQuestion --> LINE 101
        questionsLists = (List<OnlineQuestionsList>) getIntent().getSerializableExtra("questions");

        totalScoreTv.setText("/"+questionsLists.size());
        scoreTV.setText(getCorrectAnswers()+"");
        correctTV.setText(getCorrectAnswers() + "");
        incorrectTV.setText(String.valueOf(questionsLists.size() - getCorrectAnswers()));


        shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "BarMaTic");
                    String shareMessage= "\nMi score: "+ getCorrectAnswers() + " respuesta(s) correcta(s) de "+ questionsLists.size() +" en el Quiz online.\n";
                    shareMessage = shareMessage + "Recuerda ingresar al grupo de whatsapp: https://chat.whatsapp.com/D7oiGfS9ZCtAe9euBhwZRP" ;
//                    shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID +"\n\n";

                    shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                    startActivity(Intent.createChooser(shareIntent, "Compartir en"));
                    Toast.makeText(onlineQuizResult.this, "Redireccionando, por favor espere ...", Toast.LENGTH_SHORT).show();

                } catch(Exception e) {
                    Toast.makeText(onlineQuizResult.this, "Error:'SH100', Error al compartir, intente nuevamente", Toast.LENGTH_SHORT).show();
                }
            }
        });

        reTakeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(onlineQuizResult.this, onlineQuiz.class);
                startActivity(i);
            }
        });

        wpTeamBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    Uri _url = Uri.parse(_url_wp);
                    Intent i = new Intent(Intent.ACTION_VIEW, _url);
                    startActivity(i);
                    Toast.makeText(onlineQuizResult.this, "Redireccionando, por favor espere ...", Toast.LENGTH_SHORT).show();

                } catch(Exception e) {
                    Toast.makeText(onlineQuizResult.this, "Error:'RD100', Error al redireccionar", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private int getCorrectAnswers(){
        int correctAnswer = 0;

        for(int i = 0; i < questionsLists.size(); i++){

            // get user selected option
            int getUserSelectedOption = questionsLists.get(i).getUserSelectedAnswer();

            // get correct answer fir the questions
            int getQuestionsAnswer = questionsLists.get(i).getAnswer();

            // check of user selected answer matches with correct answer
            if(getQuestionsAnswer == getUserSelectedOption){
                correctAnswer++; // increase correct answer
            }
        }
        return correctAnswer;
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(onlineQuizResult.this, onlineQuiz.class);
        startActivity(i);
    }
}