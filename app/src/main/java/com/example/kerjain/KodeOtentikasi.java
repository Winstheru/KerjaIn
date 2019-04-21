package com.example.kerjain;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class KodeOtentikasi extends AppCompatActivity {

    //private static final long START_TIME = 200000;
    private static final long START_TIME = 5000;
    private TextView mTextViewCountDown;
    private Button mButtonStart;
    private CountDownTimer mCountDownTimer;
    private boolean mTimerRunning; //utk cek apakah timer sedang berjalan
    private long mTimeLeft = START_TIME;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kode_otentikasi);

        mTextViewCountDown = findViewById(R.id.timer);
        mButtonStart = findViewById(R.id.submit);

        //to define what button will do when we click them
        mButtonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mTimerRunning == false){
                    startTimer();
                }
            }
        });
    }

    private void startTimer(){
        //syntax CountDownTimer(long milisecInFuture, longCountDownInterval) dimana millisecInFuture is the time you set in millisecond when you want CountDownTimer to stop and countDownInterval is the interval time in millisecond you set after which number will increment in CountDownTimer.
        mCountDownTimer = new CountDownTimer(mTimeLeft, 1000) { //countDownInterval itu fungsinya utk: tiap brp milisecondkah, method onTick akan dijalankan
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeft = millisUntilFinished; // utk save nilainya jd kita bs continue dari waktu yg sblmnya
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                //this code will run when time is up
                mTimerRunning = false;
                waktuHabis();
            }
        }.start();

        mTimerRunning = true;
    }

    private void updateCountDownText(){
        int minutes = (int) (mTimeLeft / 1000) / 60; //di-cast ke int karna type_defaultnya long, dibagi seribu biar dari miliseconds jd seconds, dibagi 60 biar jd menit
        int seconds = (int) (mTimeLeft / 1000) % 60; //modulus is to return what is left after calculating the minutes

        //format this value to be like clock
        String timeLeftFormat = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
        mTextViewCountDown.setText(timeLeftFormat);
    }

    public void waktuHabis(){
        Intent intent = new Intent(this, DaftarSebagai.class);
        startActivity(intent);
    }
}
