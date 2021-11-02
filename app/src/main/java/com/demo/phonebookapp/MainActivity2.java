package com.demo.phonebookapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView nameDetails = (TextView) findViewById(R.id.namebox);
        TextView numberDetails = (TextView) findViewById(R.id.numberbox);
        TextView addressDetails = (TextView) findViewById(R.id.addbox);

        nameDetails.setText(getIntent().getStringExtra("Name"));
        numberDetails.setText(getIntent().getStringExtra("Number"));
        addressDetails.setText(getIntent().getStringExtra("Address"));
        back = (Button) findViewById(R.id.button);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent previouspage = new Intent(MainActivity2.this, Activity.class);
                startActivity(previouspage);
            }
        });
    }

    public void movebacktoact1(View view){
        Intent previouspage = new Intent(MainActivity2.this, Activity.class);
        startActivity(previouspage);
    }
}