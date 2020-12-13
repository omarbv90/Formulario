package com.omarb.formulario;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextInputLayout textInputLayout = (TextInputLayout) findViewById(R.id.textInputLayout);
        final TextInputLayout textInputLayout2 = (TextInputLayout) findViewById(R.id.textInputLayout4);
        final TextInputLayout textInputLayout3 = (TextInputLayout) findViewById(R.id.textInputLayout5);
        final TextInputLayout textInputLayout4 = (TextInputLayout) findViewById(R.id.textInputLayout6);

        final Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                String nombre = String.valueOf(textInputLayout.getEditText().getText());
                String telefono = String.valueOf(textInputLayout2.getEditText().getText());
                String mail = String.valueOf(textInputLayout3.getEditText().getText());
                String descp = String.valueOf(textInputLayout4.getEditText().getText());
                DatePicker datePicker = (DatePicker) findViewById(R.id.datePicker3);
                int m = datePicker.getMonth()+1;
                final String fecha = String.valueOf(datePicker.getDayOfMonth()+"/"+m+"/"+datePicker.getYear());

                Intent intent = new Intent(MainActivity.this,ConfirmDat.class);
                intent.putExtra("Nombre",nombre);
                intent.putExtra("Telefono",telefono);
                intent.putExtra("Mail",mail);
                intent.putExtra("Descripcion",descp);
                intent.putExtra("Fecha",fecha);
                startActivity(intent);
                finish();
            }
        });

        Bundle prin = getIntent().getExtras();
        String nombre = prin.getString("N");
        String telefono = prin.getString("T");
        String mail = prin.getString("E");
        String descp = prin.getString("D");

        textInputLayout.getEditText().setText(nombre);
        textInputLayout2.getEditText().setText(telefono);
        textInputLayout3.getEditText().setText(mail);
        textInputLayout4.getEditText().setText(descp);
    }


}
