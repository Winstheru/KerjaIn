package com.example.kerjain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void openActivity2(View view){
        Intent intent = new Intent(this, BottomNavigationView.class);
        startActivity(intent);
    }

    public void daftarSebagai(View view){
        Intent intent = new Intent(this, DaftarSebagai.class);
        startActivity(intent);
    }
}
