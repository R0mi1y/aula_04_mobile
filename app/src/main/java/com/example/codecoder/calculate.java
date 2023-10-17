package com.example.codecoder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class calculate extends AppCompatActivity {

    private AppCompatButton submit;
    private TextView resultado, sinal;
    private EditText place1, place2;
    private ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        submit = findViewById(R.id.calcular);
        resultado = findViewById(R.id.resultado);
        place1 = findViewById(R.id.place1);
        place2 = findViewById(R.id.place2);
        sinal = findViewById(R.id.operacao);
        backButton = findViewById(R.id.backButton);

        Intent intent = getIntent();
        String sinalstr = intent.getStringExtra("operacao"); // Primeiro, obtenha o valor da operação

        sinal.setText(sinalstr);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(place1.getText().toString());
                float num2 = Float.parseFloat(place2.getText().toString());
                float res = 0;

                if (sinalstr.equals("+")) res = num1 + num2;
                else if (sinalstr.equals("-")) res = num1 - num2;
                else if (sinalstr.equals("*")) res = num1 * num2;
                else if (sinalstr.equals("/")) res = num1 / num2;

                resultado.setText(Float.toString(res));
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(calculate.this, buttons_action.class);
                startActivity(back);
            }
        });
    }
}