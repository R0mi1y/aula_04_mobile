package com.example.codecoder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class buttons_action extends AppCompatActivity {
    private AppCompatButton soma, subtracao, multiplicacao, divisao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons_action);

        soma = findViewById(R.id.button_mais);
        subtracao = findViewById(R.id.button_menos);
        multiplicacao = findViewById(R.id.button_multiplicacao);
        divisao = findViewById(R.id.button_divisao);

        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buttons_action.this, calculate.class);
                intent.putExtra("operacao", "+");
                startActivity(intent);
            }
        });

        subtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buttons_action.this, calculate.class);
                intent.putExtra("operacao", "-");
                startActivity(intent);
            }
        });

        divisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buttons_action.this, calculate.class);
                intent.putExtra("operacao", "/");
                startActivity(intent);
            }
        });

        multiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buttons_action.this, calculate.class);
                intent.putExtra("operacao", "*");
                startActivity(intent);
            }
        });
    }
}