package com.example.avt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {
    TextView tv_nama,tv_password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        tv_nama=findViewById(R.id.tv_nama);
        tv_password=findViewById(R.id.tv_pass);

        Bundle c = getIntent().getExtras();

        String nama=c.getString("a");
        String pass=c.getString("b");

        tv_nama.setText(nama);
        tv_password.setText(pass);
    }
}