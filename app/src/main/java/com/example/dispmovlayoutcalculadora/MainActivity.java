package com.example.dispmovlayoutcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView pantalla;
    private Button boton_1;
    private Button boton_2;
    private Button boton_3;
    private Button boton_mas;
    //private Button boton_igual;
    private String numero_pantalla="";
    private double operador;
    private double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pantalla = (TextView) findViewById(R.id.txtPantalla);
        boton_1 = (Button) findViewById(R.id.btn1);
        boton_2 = (Button) findViewById(R.id.btn2);
        boton_3 = (Button) findViewById(R.id.btn3);
        boton_mas = (Button) findViewById(R.id.btn_mas);
        //boton_igual = (Button) findViewById(R.id.btn_igual);

        pantalla.setText("0");

        //Log.i("FLAG(dentro de listener)","Si estoy dentro"); // Ayuda para visualizar mensaje en LoCat

        boton_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Método donde se implementan las acciones que deben ser realizadas al oprimir un boton
                pantalla.setText(numero_pantalla+"1");
                numero_pantalla = pantalla.getText().toString();
            }
        });

        boton_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pantalla.setText(numero_pantalla+"2");
                numero_pantalla = pantalla.getText().toString();
            }
        });

        boton_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pantalla.setText(numero_pantalla+"3");
                numero_pantalla = pantalla.getText().toString();
            }
        });

        boton_mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = Double.parseDouble(numero_pantalla);
                resultado = resultado + operador;
                pantalla.setText("0");
                numero_pantalla = "";
                Log.i("FLAG(dentro)","" + resultado);
            }
        });

        /*boton_igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //operador = Double.parseDouble(numero_pantalla);
                numero_pantalla = String.valueOf(resultado);
                pantalla.setText(numero_pantalla);
                resultado = 0;
                operador = 0;
                numero_pantalla = "";
            }
        });*/
    }
}