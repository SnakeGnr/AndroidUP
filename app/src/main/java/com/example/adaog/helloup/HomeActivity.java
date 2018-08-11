package com.example.adaog.helloup;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("MENU PRINCIPAL");
        actionBar.setDisplayHomeAsUpEnabled(true);

        String nome = getIntent().
                getStringExtra("nome");
        TextView t = findViewById(R.id.textView);

        t.setText("Seja Bem vindo: " + nome);

    }
}
