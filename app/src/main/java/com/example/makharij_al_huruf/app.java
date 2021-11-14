package com.example.makharij_al_huruf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class app extends AppCompatActivity implements
        View.OnClickListener {
    private Button quiz;
    private Button practice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);
        quiz=findViewById(R.id.quiz);
        practice=findViewById(R.id.practice);
        practice.setOnClickListener(this);
//        practice.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent newintent= new Intent(app.this,MainActivity.class);
//                startActivity(newintent);
//            }
//        });
        quiz.setOnClickListener(this);
//        quiz.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent newintent= new Intent(app.this,quiz.class);
//                startActivity(newintent);
//            }
//        });
    }

    @Override

    public void onClick(View v) {

        switch (v.getId( )) {

            case R.id.practice:

                Intent newintent= new Intent(app.this,MainActivity.class);
                startActivity(newintent);

                break;

            case R.id.quiz:

                Intent newintent1= new Intent(app.this,quiz.class);
                startActivity(newintent1);

                break;



        }

    }
}