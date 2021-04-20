package proyectos.create.miprimeraappucv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btncalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Castear la vairable con el objeto
        btncalcular = findViewById(R.id.btncalcular);

        //Crear el Evento (CLICK) al botón btncalcular
        btncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calcular();
            }
        });

    }

    public void Calcular()
    {
        Toast.makeText(getApplicationContext(), "Has presionado este botón", Toast.LENGTH_LONG).show();
    }

}