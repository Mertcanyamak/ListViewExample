package com.example.listviewexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button customAdapterButton;
    Button arrayAdapterButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayAdapterButton = findViewById(R.id.arrayadapter);
        customAdapterButton = findViewById(R.id.customadapter);

      //  View.OnClickListener listener = new AdapterButtonListener(); also correct
        AdapterButtonListener  listener = new AdapterButtonListener();

        arrayAdapterButton.setOnClickListener(listener);



        View.OnClickListener listener2 = new View.OnClickListener(){ //2.listener ıcın class yaratmana gerek yok.
            @Override
            public void onClick(View v) {
                Log.d("AdapterButtonListener","Clicked");
                Intent intent = new Intent(MainActivity.this,ArrayAdapterActivity.class);
                startActivity(intent);
            }
        };


        customAdapterButton.setOnClickListener(listener);

        View.OnClickListener listener3 = new View.OnClickListener(){ //2.listener ıcın class yaratmana gerek yok.
            @Override
            public void onClick(View v) {
                Log.d("CustomButtonListener","Clicked");
                Intent intent = new Intent(MainActivity.this,CustomAdapterActivity.class);
                startActivity(intent);
            }
        };




    }
    private class AdapterButtonListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Log.d("AdapterButtonListener","Clicked");
            Intent intent = new Intent(MainActivity.this,ArrayAdapterActivity.class);
            startActivity(intent);
        }
    }
}
