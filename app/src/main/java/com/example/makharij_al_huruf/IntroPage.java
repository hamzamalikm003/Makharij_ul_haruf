package com.example.makharij_al_huruf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntroPage extends AppCompatActivity implements
        View.OnClickListener{
    private Button repo;
    private Button app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_page);
        repo=findViewById(R.id.repo);
        app=findViewById(R.id.app);

        repo.setOnClickListener(this);
//        repo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Uri uri = Uri.parse("https://github.com/hamzamalikm003/Makharij_ul_haruf");
//                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                startActivity(intent);
//            }
//        });
        app.setOnClickListener(this);
//        app.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent newintent= new Intent(IntroPage.this,app.class);
//                startActivity(newintent);
//            }
//        });

    }
    @Override

    public void onClick(View v) {

        switch (v.getId( )) {

            case R.id.repo:

                Uri uri = Uri.parse("https://github.com/hamzamalikm003/Makharij_ul_haruf");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

                break;

            case R.id.app:

                Intent newintent= new Intent(IntroPage.this,app.class);
                startActivity(newintent);


                break;



        }

    }
}