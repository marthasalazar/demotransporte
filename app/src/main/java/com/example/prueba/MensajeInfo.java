package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MensajeInfo extends AppCompatActivity implements View.OnClickListener {

    ImageView imgResultado;
    TextView tvResultado;
    Button btnAceptar;

    public static String SUCCESS_VALUE = "success";
    public static String ERROR_VALUE = "error";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensajesinfo);

        imgResultado = (ImageView) findViewById(R.id.imgResultado);
        tvResultado = (TextView) findViewById(R.id.tvMensaje);
        btnAceptar = (Button) findViewById(R.id.btnAceptar);

        Intent resultado = getIntent();
        String tipo = resultado.getStringExtra("tipo");

        btnAceptar.setOnClickListener(this);
        tvResultado.setText(resultado.getStringExtra("mensaje"));
        imgResultado.setImageDrawable(tipo.equals(ERROR_VALUE)
                                        ? getDrawable(R.drawable.error)
                                        : getDrawable(R.drawable.check));

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, ListadoSolicitudes.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}
