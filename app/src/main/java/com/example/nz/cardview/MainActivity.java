package com.example.nz.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView one,two,three,four;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

       // getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

      //  getSupportActionBar().hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        one = (CardView) findViewById(R.id.cardOne);
        two = (CardView) findViewById(R.id.cardTwo);
        three = (CardView) findViewById(R.id.cardThree);
        four = (CardView) findViewById(R.id.cardFour);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.cardOne){


            Toast.makeText(MainActivity.this,"You press One",Toast.LENGTH_SHORT).show();

        }  if(v.getId() == R.id.cardTwo){
            Toast.makeText(MainActivity.this,"You press Two",Toast.LENGTH_SHORT).show();
        }  if(v.getId() == R.id.cardThree){
            Toast.makeText(MainActivity.this,"You press Three",Toast.LENGTH_SHORT).show();
        }  if(v.getId() == R.id.cardFour){
            Toast.makeText(MainActivity.this,"You press Four",Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
