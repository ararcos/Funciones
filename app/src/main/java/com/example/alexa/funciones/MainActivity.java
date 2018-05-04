package com.example.alexa.funciones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void exponente(View view) {
        Intent intPag=new Intent(this,Operaciones.class);
        intPag.putExtra("titulo","CALCULAR EXPONENTE");
        intPag.putExtra("tipo",0);
        MainActivity.this.startActivity(intPag);
    }
    public void factorial(View view) {
        Intent intPag=new Intent(this,Operaciones.class);
        intPag.putExtra("titulo","CALCULAR FACTORIAL");
        intPag.putExtra("tipo",1);
        MainActivity.this.startActivity(intPag);
    }
    public void primo(View view) {
        Intent intPag=new Intent(this,Operaciones.class);
        intPag.putExtra("titulo","CALCULAR PRIMO");
        intPag.putExtra("tipo",2);
        MainActivity.this.startActivity(intPag);
    }
}
