package com.example.kerjain;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class KodeOtentikasi extends AppCompatActivity {

    private static final long START_TIME = 200000;

    private TextView mTextViewCountDown;
    private Button mButtonStart;
    private CountDownTimer mCountDownTimer;
    private boolean mTimerRunning; //utk cek apakah timer sedang berjalan
    private long mTimeLeft = START_TIME;
    public int counter = 7;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kode_otentikasi);

        textView = findViewById(R.id.timer);
        button = findViewById(R.id.submit);

        //to define what button will do when we click them
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CountDownTimer(7000,1000){
                    @Override
                    public void onTick(long millisUntilFinished) {
                        textView.setText(String.valueOf(counter));
                        counter--;

                    }

                    @Override
                    public void onFinish() {
                        mTimerRunning = false;
                    }
                }.start();
                mTimerRunning = true;
            }
        });

        
    }
}
