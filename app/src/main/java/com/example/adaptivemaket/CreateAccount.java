package com.example.adaptivemaket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class CreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        Button btn = findViewById(R.id.btnStart);
        btn.setOnClickListener(v -> startActivity(new Intent(CreateAccount.this,
                MainActivity.class)));
    }
}