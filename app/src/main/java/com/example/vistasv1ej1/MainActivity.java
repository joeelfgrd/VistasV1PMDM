package com.example.vistasv1ej1;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{

    RadioButton rbTexto;
    RadioButton rbImagen;
    Button btnAceptar;
    TextView tvSalidaPantalla;
    float rotacion = 0;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbTexto = findViewById(R.id.rbTexto);
        rbImagen = findViewById(R.id.rbImagen);
        btnAceptar = findViewById(R.id.btAceptar);
        tvSalidaPantalla = findViewById(R.id.tvSalidaPantalla);
        btnAceptar.setOnClickListener(escuchadorAceptar);




    }




    private View.OnClickListener escuchadorAceptar = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if (rbTexto.isChecked()) {
                setContentView(R.layout.ventana_saludo);
                TextView tvSaludo = findViewById(R.id.tvSalidaPantalla);
                if (tvSaludo != null) {
                    rotacion += 45;
                    tvSaludo.setRotation(rotacion);
                }
            }
        }
    };
}
