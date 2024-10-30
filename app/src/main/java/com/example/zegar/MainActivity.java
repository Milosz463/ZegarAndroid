package com.example.zegar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttongracz1;
    Button buttongracz2;
    Gracz gracz1;
    Gracz gracz2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttongracz1=findViewById(R.id.button);
        buttongracz2=findViewById(R.id.button2);
        gracz1=new Gracz(true,buttongracz1);
        gracz2=new Gracz(false,buttongracz2);
        buttongracz1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(gracz1.czyDziala){
                            gracz1.stopTimer();
                            gracz2.startTimer();
                        }
                    }
                }
        );
        buttongracz2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(gracz2.czyDziala){
                            gracz2.stopTimer();
                            gracz1.startTimer();
                        }
                    }
                }
        );
    }
}