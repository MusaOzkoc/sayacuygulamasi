package com.onbirbe.sayac;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView_sure);
        new CountDownTimer(11000,1000){


            @Override
            public void onTick(long l) {
                textView.setText("Süre:"+l/1000);

            }

            @Override
            public void onFinish() {
                Toast.makeText(getApplicationContext(),"Süre Bitti",Toast.LENGTH_LONG).show();

            }
        }
        .start();
    }
}