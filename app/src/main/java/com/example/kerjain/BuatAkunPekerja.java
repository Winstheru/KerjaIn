package com.example.kerjain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;

import android.text.Spanned;
import android.widget.RadioButton;


public class BuatAkunPekerja extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buat_akun_pekerja);

    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_pria:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.radio_wanita:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }


}

