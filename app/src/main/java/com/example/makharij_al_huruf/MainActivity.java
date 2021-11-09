package com.example.makharij_al_huruf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;




public class MainActivity extends AppCompatActivity {
    private Button Halqiyah;
    private Button Lahatiyah;
    private Button Shajariyah;
    private Button Tarfiyah;
    private Button Niteeyah;
    private Button Lisaveyah;
    private ImageView imageView;
    private Button Ghunna;
    private Button quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        Halqiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newintent= new Intent(MainActivity.this,practice.class);
                newintent.putExtra("button", "Halqiyah");
                startActivity(newintent);
            }
        });
        Lahatiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newintent= new Intent(MainActivity.this,practice.class);
                newintent.putExtra("button", "Lahatiyah");
                startActivity(newintent);
            }
        });
        Shajariyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newintent= new Intent(MainActivity.this,practice.class);
                newintent.putExtra("button", "Shajariyah");
                startActivity(newintent);
            }
        });

        Tarfiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newintent= new Intent(MainActivity.this,practice.class);
                newintent.putExtra("button", "Tarfiyah");
                startActivity(newintent);
            }
        });
        Niteeyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newintent= new Intent(MainActivity.this,practice.class);
                newintent.putExtra("button", "Niteeyah");
                startActivity(newintent);
            }
        });
        Lisaveyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newintent= new Intent(MainActivity.this,practice.class);
                newintent.putExtra("button", "Lisaveyah");
                startActivity(newintent);
            }
        });
        Ghunna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newintent= new Intent(MainActivity.this,practice.class);
                newintent.putExtra("button", "Ghunna");
                startActivity(newintent);
            }
        });
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newintent= new Intent(MainActivity.this,quiz.class);
                startActivity(newintent);
            }
        });





    }
    private void initialize(){
        Halqiyah = findViewById(R.id.Halqiyah);
        Lahatiyah = findViewById(R.id.Lahatiyah);
        Shajariyah = findViewById(R.id.Shajariyah);
        Tarfiyah = findViewById(R.id.Tarfiyah);
        Niteeyah = findViewById(R.id.Niteeyah);
        Lisaveyah = findViewById(R.id.Lisaveyah);
        Ghunna = findViewById(R.id.Ghunna);
        imageView = findViewById(R.id.imageView);
        quiz=findViewById(R.id.quiz);

    }
}