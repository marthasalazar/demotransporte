package com.example.prueba;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class DetalleSolicitud extends AppCompatActivity {

    Button btnDenegar, btnValidar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_solicitud);

        btnDenegar = (Button) findViewById(R.id.btnDenegar);
        btnDenegar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetalleSolicitud.this, MensajeInfo.class);
                intent.putExtra("mensaje", "Solicitud denegada.");
                intent.putExtra("tipo", MensajeInfo.ERROR_VALUE);
                startActivity(intent);
            }
        });

        btnValidar = (Button) findViewById(R.id.btnValidar);
        btnValidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetalleSolicitud.this, MensajeInfo.class);
                intent.putExtra("mensaje", "Ingresado con éxito.");
                intent.putExtra("tipo", MensajeInfo.SUCCESS_VALUE);
                startActivity(intent);
            }
        });
    }
}
