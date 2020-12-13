package com.omarb.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmDat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_dat);

        Bundle info = getIntent().getExtras();
        String nomb =info.getString("Nombre");
        String tel =info.getString("Telefono");
        String em =info.getString("Mail");
        String dcp =info.getString("Descripcion");
        String fch =info.getString("Fecha");

        final TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        final TextView textView4 = (TextView) findViewById(R.id.textView4);
        final TextView textView5 = (TextView) findViewById(R.id.textView5);
        final TextView textView6 = (TextView) findViewById(R.id.textView6);

        textView2.setText(nomb);
        textView3.setText(fch);
        textView4.setText(tel);
        textView5.setText(em);
        textView6.setText(dcp);

        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent intent = new Intent(ConfirmDat.this,MainActivity.class);

                intent.putExtra("N",textView2.getText());
                intent.putExtra("T",textView4.getText());
                intent.putExtra("E",textView5.getText());
                intent.putExtra("D",textView6.getText());
                startActivity(intent);
            }
        });


    }
}
