package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;

import java.util.Scanner;

public class MyService extends Service {


    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        int i;
        int fact = 1;
        int in = 0;
        int input = intent.getIntExtra("number",in);
        for(i=1;i<=input;i++)
            fact=fact*i;
        Toast.makeText(this,"The Factorial of number "+input+ " is "+fact,Toast.LENGTH_LONG).show();
        return START_STICKY;

    }
}