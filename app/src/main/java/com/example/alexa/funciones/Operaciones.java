package com.example.alexa.funciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import quinto.alexander.funciones.Funciones;

public class Operaciones extends AppCompatActivity {
TextView tvTitulo;
EditText txtValor,txtExponente;
private int tipo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);
        tvTitulo=findViewById(R.id.tv_titulo);
        tvTitulo.setText(getIntent().getStringExtra("titulo"));
        tipo=getIntent().getIntExtra("tipo",0);
        txtExponente=findViewById(R.id.et_exponente);
        txtValor=findViewById(R.id.et_valor);
        if(tipo>0){
            txtExponente.setVisibility(View.INVISIBLE);
        }
    }
    public void calcular(View view){
        int valor=Integer.parseInt(txtValor.getText().toString());
        Funciones fun = new Funciones(valor);
        int exponente;
        switch (tipo) {
            case 0:
                exponente=Integer.parseInt(txtExponente.getText().toString());
                fun.setExponente(exponente);
                fun.exponente();
                break;
            case 1:
                fun.factorial();
                break;
            case 2:
                fun.primo();
                break;
        }
        Toast.makeText(this,fun.toString(),Toast.LENGTH_LONG).show();
    }

    public void salir(View view) {
        finish();
    }
}
