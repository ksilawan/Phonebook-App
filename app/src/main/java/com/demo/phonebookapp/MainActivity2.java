package com.demo.phonebookapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        back = (Button) findViewById(R.id.button);

    }

    public void movebacktoact1(View view){
        Intent previouspage = new Intent(MainActivity2.this, Activity.class);
        startActivity(previouspage);
    }
}