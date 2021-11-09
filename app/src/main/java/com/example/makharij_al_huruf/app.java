package com.example.makharij_al_huruf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class app extends AppCompatActivity {
    private Button quiz;
    private Button practice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);
        quiz=findViewById(R.id.quiz);
        practice=findViewById(R.id.practice);
        practice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newintent= new Intent(app.this,MainActivity.class);
                startActivity(newintent);
            }
        });

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newintent= new Intent(app.this,quiz.class);
                startActivity(newintent);
            }
        });
    }
}