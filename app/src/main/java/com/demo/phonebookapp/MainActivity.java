package com.demo.phonebookapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    public static String name = "NA";
    public static String contact = "Num";
    public static String address = "NA";

    TextView eischied;
    TextView gonzaga;
    TextView arcenal;
    TextView francis;
    TextView ngannou;
    TextView dana;
    TextView white;
    TextView daniel;
    TextView cormier;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eischied = (TextView)findViewById(R.id.eischied);
        gonzaga = (TextView)findViewById(R.id.gonzaga);
        arcenal = (TextView)findViewById(R.id.arcenal);
        francis = (TextView)findViewById(R.id.francis);
        ngannou = (TextView)findViewById(R.id.ngannou);
        dana = (TextView)findViewById(R.id.dana);
        white = (TextView)findViewById(R.id.white);
        daniel = (TextView)findViewById(R.id.daniel);
        cormier = (TextView)findViewById(R.id.cormier);


        eischied.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = "Eischeid";
                contact = "092345678910";
                address = "Edi sa puso mo";

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("Name", name);
                intent.putExtra("Number", contact);
                intent.putExtra("Address", address);
                startActivity(intent);
            }
        });


        gonzaga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = "Gonzaga";
                contact = "092345678911";
                address = "Awstrawnesia";

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("Name", name);
                intent.putExtra("Number", contact);
                intent.putExtra("Address", address);
                startActivity(intent);
            }
        });


        arcenal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = "Arcenal";
                contact = "092345678912";
                address = "Brazil";

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("Name", name);
                intent.putExtra("Number", contact);
                intent.putExtra("Address", address);
                startActivity(intent);
            }
        });

        francis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = "Francis";
                contact = "092345678923";
                address = "Feilipins";

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("Name", name);
                intent.putExtra("Number", contact);
                intent.putExtra("Address", address);
                startActivity(intent);
            }
        });

        ngannou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = "Ngannou";
                contact = "+639185457125";
                address = "Brgy. Handumanan";

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("Name", name);
                intent.putExtra("Number", contact);
                intent.putExtra("Address", address);
                startActivity(intent);
            }
        });

        dana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = "Dana";
                contact = "092345678933";
                address = "France";

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("Name", name);
                intent.putExtra("Number", contact);
                intent.putExtra("Address", address);
                startActivity(intent);
            }
        });

        white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = "White";
                contact = "092345678456";
                address = "White Country";

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("Name", name);
                intent.putExtra("Number", contact);
                intent.putExtra("Address", address);
                startActivity(intent);
            }
        });

        daniel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = "Daniel";
                contact = "092345678945";
                address = "Amewica";

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("Name", name);
                intent.putExtra("Number", contact);
                intent.putExtra("Address", address);
                startActivity(intent);
            }
        });

        cormier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = "Cormier";
                contact = "092345678916";
                address = "Tiewon";

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("Name", name);
                intent.putExtra("Number", contact);
                intent.putExtra("Address", address);
                startActivity(intent);
            }
        });










    }

        }



