package com.example.vistasv1ej1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioButton rbTexto;
    RadioButton rbImagen;
    Button btnAceptar;
    TextView tvSalidaPantalla;
    ImageView ivImagen;
    float rotacion = 45;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbTexto = findViewById(R.id.rbTexto);
        rbImagen = findViewById(R.id.rbImagen);
        btnAceptar = findViewById(R.id.btAceptar);
        ivImagen = findViewById(R.id.ivImagen);
        tvSalidaPantalla = findViewById(R.id.tvSalidaPantalla);

        btnAceptar.setOnClickListener(escuchadorAceptar);
    }

    private View.OnClickListener escuchadorAceptar = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (rbTexto.isChecked()) {
                setContentView(R.layout.ventana_saludo);
                tvSalidaPantalla = findViewById(R.id.tvSalidaPantalla);
                rotacion = 45;
                tvSalidaPantalla.setRotation(rotacion);
                tvSalidaPantalla.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvSalidaPantalla.setRotation(rotacion);
                        if (rotacion == 360){
                            rotacion = 45;
                        }
                        rotacion += 45;

                    }
                });
            } else if (rbImagen.isChecked()) {
                setContentView(R.layout.ventana_imagen);
                ivImagen = findViewById(R.id.ivImagen);
                rotacion = 45;
                ivImagen.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ivImagen.setRotation(rotacion);
                        if (rotacion == 360){
                            rotacion = 45;
                        }
                        rotacion += 45;

                    }
                });
            }
        }
    };
}