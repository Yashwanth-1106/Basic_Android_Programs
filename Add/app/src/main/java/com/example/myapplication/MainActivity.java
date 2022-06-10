package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText ed1, ed2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.editTextn1);
        ed2 = findViewById(R.id.editTextn2);
        result = findViewById(R.id.editTextn3);


    }

    public void Add(View view) {
        int input = Integer.parseInt(ed1.getText().toString());
        int input2 = Integer.parseInt(ed2.getText().toString());
        int add = input + input2;
        String output = new Integer(add).toString();
        result.setText(output);


    }
}
