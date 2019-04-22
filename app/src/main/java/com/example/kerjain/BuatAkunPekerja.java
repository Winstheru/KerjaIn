package com.example.kerjain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;


public class BuatAkunPekerja extends AppCompatActivity {
    private EditText namaPekerja, emailPekerja, noKtp, nomorTelepon, alamatLengkap;
    private RadioButton radioPria, radioWanita;
    private RadioGroup rgGender;
    private Spinner provinsi, kotaKabupaten, kecamatan;
    private Button register;
    private String gender, mobile, name, ktp, email, alamat, provinsi1, kotaKabupaten1, kecamatan1, func;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buat_akun_pekerja);

        namaPekerja = findViewById(R.id.namapekerja);
        noKtp = findViewById(R.id.nomorktp);
        emailPekerja = findViewById(R.id.emailpekerja);
        nomorTelepon = findViewById(R.id.nomortelpon);
        alamatLengkap = findViewById(R.id.alamatlengkap);
        register = findViewById(R.id.register);
        rgGender = findViewById(R.id.rgGender);
        radioPria = findViewById(R.id.radio_pria);
        radioWanita = findViewById(R.id.radio_wanita);



        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputData();
                submitData();
            }
        });
    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_pria:
                if (checked)
                    gender="Pria";
                break;
            case R.id.radio_wanita:
                if (checked)
                    gender="Wanita";
                break;
        }
    }
    public void inputData(){
        mobile = nomorTelepon.getText().toString().trim();
        name = namaPekerja.getText().toString().trim();
        ktp = noKtp.getText().toString().trim();
        email = emailPekerja.getText().toString().trim();
        alamat = alamatLengkap.getText().toString().trim();
        provinsi1 = provinsi.getSelectedItem().toString().trim();
        kotaKabupaten1 = kotaKabupaten.getSelectedItem().toString().trim();
        kecamatan1 = kecamatan.getSelectedItem().toString().trim();
    }
    public void submitData(){
        Intent intent = new Intent(BuatAkunPekerja.this, KodeOtentikasi.class);
        intent.putExtra("mobile", mobile);
        intent.putExtra("name",name);
        intent.putExtra("alamat", alamat);
        intent.putExtra("provinsi", provinsi1);
        intent.putExtra("kotakabupaten", kotaKabupaten1);
        intent.putExtra("kecamatan", kecamatan1);
        intent.putExtra("ktp", ktp);
        intent.putExtra("email", email);
        intent.putExtra("func", "registerPk");
        startActivity(intent);
    }
}

