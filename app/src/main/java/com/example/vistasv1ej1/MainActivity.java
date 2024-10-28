package com.example.vistasv1ej1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvRespuesta;
    Button btnClick;
    int contador = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvRespuesta = findViewById(R.id.tvRespuesta);
        btnClick = findViewById(R.id.btnClick);
        btnClick.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        contador++;
        tvRespuesta.setText("Has pulsado el botón " + contador + " veces");
    }


}