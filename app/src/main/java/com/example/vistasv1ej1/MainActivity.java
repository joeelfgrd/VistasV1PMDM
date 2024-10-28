package com.example.vistasv1ej1;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    TextView tvRespuesta;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvRespuesta = findViewById(R.id.tvRespuesta);
        tvRespuesta.setOnClickListener(escuchadorRespuesta);
    }


    private View.OnClickListener escuchadorRespuesta = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            tvRespuesta.setRotation(45);
            tvRespuesta.setText("HOLAAAAAAAAAA!!!");
            tvRespuesta.setBackgroundColor(getResources().getColor(R.color.green));
        }
    };



}