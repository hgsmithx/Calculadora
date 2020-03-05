package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnSuma;
    private Button btnResta;
    private Button btnMultiplicacion;
    private Button btnDivision;
    private EditText numero1;
    private EditText numero2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);

        btnSuma = findViewById(R.id.btnSumarID);
        btnResta = findViewById(R.id.btnRestarID);
        btnMultiplicacion = findViewById(R.id.btnMulID);
        btnDivision = findViewById(R.id.btnDivID);

        numero1 = findViewById(R.id.numero1ID);
        numero2 = findViewById(R.id.numero2ID);

        resultado = findViewById(R.id.respuesta);

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               resultado.setText( Suma(Integer.parseInt(numero1.getText().toString()),Integer.parseInt(numero2.getText().toString()))+"" );

            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(Resta(Integer.parseInt(numero1.getText().toString()),Integer.parseInt(numero2.getText().toString()))+"");
            }
        });
        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(Mul(Integer.parseInt(numero1.getText().toString()),Integer.parseInt(numero2.getText().toString()))+"");
            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(Div(Integer.parseInt(numero1.getText().toString()),Integer.parseInt(numero2.getText().toString()))+"");
            }
        });
    }

    public float Suma(int x, int y){
        return x+y;
    }
    public float Resta(int x, int y){
        return x-y;
    }
    public float Mul(int x, int y){
        return x*y;
    }
    public float Div(int x, int y){
        return x/y;
    }
}
