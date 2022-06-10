package com.example.myapplication;

import static android.app.Service.START_STICKY;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void startService(View view){
        EditText et;
        et = findViewById(R.id.n1);
        int input = Integer.parseInt(et.getText().toString());


        Intent intent = new Intent(this, MyService.class);
        intent.putExtra("number", input);
        MainActivity context;
        startService(intent);
    }


}


