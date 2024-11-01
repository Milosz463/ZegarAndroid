package com.example.zegar;

import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.TextView;

public class Gracz {
    int pozostaleSekundy;
    boolean czyDziala;

    Button buttonGracza;
    CountDownTimer countDownTimer;

    public Gracz(boolean czyDziala, Button buttonGracza) {
        this.czyDziala = czyDziala;
        this.buttonGracza = buttonGracza;
        pozostaleSekundy = 3*60;
    }

    public void stopTimer(){
        czyDziala=false;
        countDownTimer.cancel();
    }

    public void startTimer(){
        czyDziala=true;
        countDownTimer = new CountDownTimer(1000*pozostaleSekundy,1000) {
            @Override
            public void onTick(long l) {
                pozostaleSekundy = (int)l/1000;
                buttonGracza.setText(String.valueOf(pozostaleSekundy));
                //TODO: poprawic wyswietlanie
            }

            @Override
            public void onFinish() {
              buttonGracza.setText("KONIEC");
            }
        };
        countDownTimer.start();
    }

}
