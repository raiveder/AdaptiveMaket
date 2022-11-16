package com.example.adaptivemaket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText etFullName = findViewById(R.id.etFullName);
        EditText etEmail = findViewById(R.id.etEmail);
        EditText etPassword = findViewById(R.id.etPassword);
        EditText etConfirmPassword = findViewById(R.id.etConfirmPassword);
        Button btn = findViewById(R.id.btnRegister);
        TextView textView = findViewById(R.id.tvReg);

        etFullName.addTextChangedListener(getTextWatcher(etFullName, etEmail,
                etPassword, etConfirmPassword, btn));

        etEmail.addTextChangedListener(getTextWatcher(etFullName, etEmail,
                etPassword, etConfirmPassword, btn));

        etPassword.addTextChangedListener(getTextWatcher(etFullName, etEmail,
                etPassword, etConfirmPassword, btn));

        etConfirmPassword.addTextChangedListener(getTextWatcher(etFullName, etEmail,
                etPassword, etConfirmPassword, btn));

        textView.setOnClickListener(v -> startActivity(new Intent(RegisterActivity.this,
                LogIn.class)));

        textView.setOnClickListener(v -> startActivity(new Intent(RegisterActivity.this,
                CreateAccount.class)));
    }

    private TextWatcher getTextWatcher(EditText fullName, EditText email, EditText password,
                                       EditText confirmPassword, Button btn) {
        return new TextWatcher() {
            @Override
            public void afterTextChanged(Editable editable) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                setButtonBackground(fullName, email, password, confirmPassword, btn);
            }
        };
    }

    private void setButtonBackground(EditText fullName, EditText email, EditText password,
                                     EditText confirmPassword, Button btn) {

        if (!fullName.getText().toString().equals("") &&
                !email.getText().toString().equals("") &&
                !password.getText().toString().equals("") &&
                !confirmPassword.getText().toString().equals("")) {

            btn.setBackground(RegisterActivity.this.getDrawable(R.drawable.button_background_action));

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                btn.setTextColor(RegisterActivity.this.getColor(R.color.papayaWhip75));
            }
        } else {

            btn.setBackground(RegisterActivity.this.getDrawable(R.drawable.button_background));

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                btn.setTextColor(RegisterActivity.this.getColor(R.color.papayaWhip));
            }
        }
    }
}