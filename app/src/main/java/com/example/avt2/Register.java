package com.example.avt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class Register extends AppCompatActivity {
    EditText edNama, edAlamat, edEmail, edPassword, edtrepass;

    FloatingActionButton fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        edNama = findViewById(R.id.edNama);
        edAlamat = findViewById(R.id.edAlamat);
        edEmail = findViewById(R.id.edEmail);
        edPassword = findViewById(R.id.edPass);
        edtrepass = findViewById(R.id.edrepass);
        fab = findViewById(R.id.fabSimpan);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edNama.getText().toString().isEmpty() ||
                edAlamat.getText().toString().isEmpty() ||
                edEmail.getText().toString().isEmpty() ||
                edPassword.getText().toString().isEmpty() ||
                edtrepass.getText().toString().isEmpty())
                {
                    Snackbar.make(view, "wajib isi", Snackbar.LENGTH_LONG).show();
                }
                else
                {
                    Snackbar.make(view,"password dan repass harus sama", Snackbar.LENGTH_LONG).show();
                }
            }
        });
    }
}