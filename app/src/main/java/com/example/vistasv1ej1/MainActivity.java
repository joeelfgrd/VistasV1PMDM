package com.example.vistasv1ej1;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvRespuesta;
    Button btnClick;
    Button btnFinalizar;
    Button btnReiniciar;
    int contador = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvRespuesta = findViewById(R.id.tvRespuesta);
        btnClick = findViewById(R.id.btnClick);
        btnFinalizar = findViewById(R.id.btnFinalizar);
        btnReiniciar = findViewById(R.id.btnReiniciar);

        btnClick.setOnClickListener(this);
        btnFinalizar.setOnClickListener(escuchadorFinalizar);
        btnReiniciar.setOnClickListener(escuchadorReiniciar);
    }

    @Override
    public void onClick(View view) {
        contador++;
    }

    private View.OnClickListener escuchadorFinalizar = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            tvRespuesta.setText(getResources().getString(R.string.has_pulsado) + contador + getResources().getString(R.string.veces));
        }
    };
    private View.OnClickListener escuchadorReiniciar = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            contador = 0;
        }
    };



}