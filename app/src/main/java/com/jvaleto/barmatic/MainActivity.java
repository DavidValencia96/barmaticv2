package com.jvaleto.barmatic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irQuizOnline(View view){
        Intent i = new Intent(MainActivity.this, onlineQuiz.class);
        startActivity(i);
    }

    public void irQuizOffline(View view){
        Intent i = new Intent(MainActivity.this, offlineQuiz.class);
        startActivity(i);
    }

    public void irSobreApp(View view){
        Intent i = new Intent(MainActivity.this, sobreApp.class);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {

        finish();
    }
}
