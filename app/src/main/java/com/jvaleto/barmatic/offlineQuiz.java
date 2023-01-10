package com.jvaleto.barmatic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class offlineQuiz extends AppCompatActivity {

    private String selectedTopicName ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offline_quiz);

        final LinearLayout QuizRazonamientoLog = findViewById(R.id.QuizRazonaLog);
        final LinearLayout QuizPensAleat = findViewById(R.id.QuizPensAleat);
        final LinearLayout QuizEduFinan = findViewById(R.id.QuizEduFinan);
        final LinearLayout QuizPensNumVaria = findViewById(R.id.QuizPensNumVaria);
        final LinearLayout QuizPensMetyGeo = findViewById(R.id.QuizPensMetyGeo);


        final Button startBtn = findViewById(R.id.startQuizBtn);


        QuizRazonamientoLog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                selectedTopicName = "Razonamiento Lógico";
                QuizRazonamientoLog.setBackgroundResource(R.drawable.round_back_white_stroke10);

                QuizPensAleat.setBackgroundResource(R.drawable.round_back_white10);
                QuizEduFinan.setBackgroundResource(R.drawable.round_back_white10);
                QuizPensNumVaria.setBackgroundResource(R.drawable.round_back_white10);
                QuizPensMetyGeo.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        QuizPensAleat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                selectedTopicName = "Pensamiento Aleatorio";
                QuizPensAleat.setBackgroundResource(R.drawable.round_back_white_stroke10);

                QuizRazonamientoLog.setBackgroundResource(R.drawable.round_back_white10);
                QuizEduFinan.setBackgroundResource(R.drawable.round_back_white10);
                QuizPensNumVaria.setBackgroundResource(R.drawable.round_back_white10);
                QuizPensMetyGeo.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        QuizEduFinan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                selectedTopicName = "Educación Financiera";
                QuizEduFinan.setBackgroundResource(R.drawable.round_back_white_stroke10);

                QuizRazonamientoLog.setBackgroundResource(R.drawable.round_back_white10);
                QuizPensNumVaria.setBackgroundResource(R.drawable.round_back_white10);
                QuizPensAleat.setBackgroundResource(R.drawable.round_back_white10);
                QuizPensMetyGeo.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        QuizPensNumVaria.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                selectedTopicName = "Pens. Numérico y Variacional";
                QuizPensNumVaria.setBackgroundResource(R.drawable.round_back_white_stroke10);

                QuizRazonamientoLog.setBackgroundResource(R.drawable.round_back_white10);
                QuizEduFinan.setBackgroundResource(R.drawable.round_back_white10);
                QuizPensAleat.setBackgroundResource(R.drawable.round_back_white10);
                QuizPensMetyGeo.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        QuizPensMetyGeo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                selectedTopicName = "Pens. Métrico y Geométrico";
                QuizPensMetyGeo.setBackgroundResource(R.drawable.round_back_white_stroke10);

                QuizRazonamientoLog.setBackgroundResource(R.drawable.round_back_white10);
                QuizPensNumVaria.setBackgroundResource(R.drawable.round_back_white10);
                QuizPensAleat.setBackgroundResource(R.drawable.round_back_white10);
                QuizEduFinan.setBackgroundResource(R.drawable.round_back_white10);
            }
        });


        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedTopicName.isEmpty()){
                    Toast.makeText(offlineQuiz.this, "Selecciona una opción", Toast.LENGTH_SHORT).show();
                } else {
                    Intent i = new Intent(offlineQuiz.this, quizActivity.class);
                    i.putExtra("SelectedTopic", selectedTopicName);
                    startActivity(i);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(offlineQuiz.this, MainActivity.class);
        startActivity(i);
    }
}