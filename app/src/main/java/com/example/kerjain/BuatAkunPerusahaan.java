package com.example.kerjain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BuatAkunPerusahaan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buat_akun_perusahaan);
    }

    public void submitPerusahaan(View view){
        Intent perusahaan= new Intent(this, BottomNavigationView.class);
        startActivity(perusahaan);
    }

}
