package com.example.adaptivemaket;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        EditText etEmail = findViewById(R.id.etEmail);
        EditText etPassword = findViewById(R.id.etPassword);

        Button btn = findViewById(R.id.btnLogin);

        etEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable editable) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!etEmail.getText().toString().equals("") &&
                        !etPassword.getText().toString().equals("")) {
                    btn.setBackground(LogIn.this.getDrawable(R.drawable.button_background_action));
                }
                else
                {
                    btn.setBackground(LogIn.this.getDrawable(R.drawable.button_background));
                }
            }
        });

        etPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable editable) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!etEmail.getText().toString().equals("") &&
                        !etPassword.getText().toString().equals("")) {
                    btn.setBackground(LogIn.this.getDrawable(R.drawable.button_background_action));
                }
                else
                {
                    btn.setBackground(LogIn.this.getDrawable(R.drawable.button_background));
                }
            }
        });
    }
}