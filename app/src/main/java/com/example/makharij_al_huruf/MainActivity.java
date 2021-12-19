package com.example.makharij_al_huruf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;




public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {
    private Button Halqiyah;
    private Button Lahatiyah;
    private Button Shajariyah;
    private Button Tarfiyah;
    private Button Niteeyah;
    private Button Lisaveyah;
    private ImageView imageView;
    private Button Ghunna;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        Halqiyah.setOnClickListener(this);
//        Halqiyah.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent newintent= new Intent(MainActivity.this,practice.class);
//                newintent.putExtra("button", "Halqiyah");
//                startActivity(newintent);
//            }
//        });
        Lahatiyah.setOnClickListener(this);
//        Lahatiyah.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent newintent= new Intent(MainActivity.this,practice.class);
//                newintent.putExtra("button", "Lahatiyah");
//                startActivity(newintent);
//            }
//        });
        Shajariyah.setOnClickListener(this);
//        Shajariyah.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent newintent= new Intent(MainActivity.this,practice.class);
//                newintent.putExtra("button", "Shajariyah");
//                startActivity(newintent);
//            }
//        });
        Tarfiyah.setOnClickListener(this);
//        Tarfiyah.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent newintent= new Intent(MainActivity.this,practice.class);
//                newintent.putExtra("button", "Tarfiyah");
//                startActivity(newintent);
//            }
//        });
        Niteeyah.setOnClickListener(this);
//        Niteeyah.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent newintent= new Intent(MainActivity.this,practice.class);
//                newintent.putExtra("button", "Niteeyah");
//                startActivity(newintent);
//            }
//        });
        Lisaveyah.setOnClickListener(this);
//        Lisaveyah.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent newintent= new Intent(MainActivity.this,practice.class);
//                newintent.putExtra("button", "Lisaveyah");
//                startActivity(newintent);
//            }
//        });
        Ghunna.setOnClickListener(this);
//        Ghunna.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent newintent= new Intent(MainActivity.this,practice.class);
//                newintent.putExtra("button", "Ghunna");
//                startActivity(newintent);
//            }
//        });

    }
    @Override

    public void onClick(View v) {

        switch (v.getId( )) {

            case R.id.Halqiyah:

                Intent newintent= new Intent(MainActivity.this,practice.class);
                newintent.putExtra("button", "Halqiyah");
                startActivity(newintent);

                break;

            case R.id.Lahatiyah:

                Intent newintent1= new Intent(MainActivity.this,practice.class);
                newintent1.putExtra("button", "Lahatiyah");
                startActivity(newintent1);


                break;

            case R.id.Shajariyah:

                Intent newintent2= new Intent(MainActivity.this,practice.class);
                newintent2.putExtra("button", "Shajariyah");
                startActivity(newintent2);


                break;
            case R.id.Tarfiyah:

                Intent newintent3= new Intent(MainActivity.this,practice.class);
                newintent3.putExtra("button", "Tarfiyah");
                startActivity(newintent3);


                break;
            case R.id.Niteeyah:

                Intent newintent4= new Intent(MainActivity.this,practice.class);
                newintent4.putExtra("button", "Niteeyah");
                startActivity(newintent4);


                break;
            case R.id.Lisaveyah:

                Intent newintent5= new Intent(MainActivity.this,practice.class);
                newintent5.putExtra("button", "Lisaveyah");
                startActivity(newintent5);


                break;
            case R.id.Ghunna:

                Intent newintent6= new Intent(MainActivity.this,practice.class);
                newintent6.putExtra("button", "Ghunna");
                startActivity(newintent6);


                break;



        }

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

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_halqiyah:

                Intent newintent = new Intent(MainActivity.this, practice.class);
                newintent.putExtra("button", "Halqiyah");
                startActivity(newintent);
                return true;



            case R.id.action_lahatiyah:

                Intent newintent1 = new Intent(MainActivity.this, practice.class);
                newintent1.putExtra("button", "Lahatiyah");
                startActivity(newintent1);
                return true;



            case R.id.action_shajariyah:

                Intent newintent2 = new Intent(MainActivity.this, practice.class);
                newintent2.putExtra("button", "Shajariyah");
                startActivity(newintent2);
                return true;



            case R.id.action_tarfiyah:

                Intent newintent3 = new Intent(MainActivity.this, practice.class);
                newintent3.putExtra("button", "Tarfiyah");
                startActivity(newintent3);
                return true;



            case R.id.action_nitEeyah:

                Intent newintent4 = new Intent(MainActivity.this, practice.class);
                newintent4.putExtra("button", "Niteeyah");
                startActivity(newintent4);
                return true;



            case R.id.action_lisaveyah:

                Intent newintent5 = new Intent(MainActivity.this, practice.class);
                newintent5.putExtra("button", "Lisaveyah");
                startActivity(newintent5);
                return true;



            case R.id.action_ghunna:

                Intent newintent6 = new Intent(MainActivity.this, practice.class);
                newintent6.putExtra("button", "Ghunna");
                startActivity(newintent6);
                return true;





            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }
}