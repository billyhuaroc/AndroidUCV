package proyectos.create.segundaapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Crear las variables
    EditText txt_numero_1, txt_numero_2;
    Button btn_calcular;
    TextView tvt_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Casteamos las variables
        txt_numero_1  = findViewById(R.id.txt_numero_1);
        txt_numero_2  = findViewById(R.id.txt_numero_2);
        tvt_resultado = findViewById(R.id.tvt_resultado);
        btn_calcular  = findViewById(R.id.btn_calcular);

        //Evento de CLICK al botón (btn_calcular)
        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Lo que pongamos en esta sección se va ejecutar cuando el usuario le de click al botón

                /* --------------------------------------------------Realizar la operación SUMA------------------------------------------------------------*/

                //Creamos la variable (valor1) , y lo que ingrese el usuario en el campo txt_numero_1 automaticamente lo transforme a un entero (a un número)
                int valor1 = Integer.parseInt(txt_numero_1.getText().toString());
                //Creamos la variable (valor2) , y lo que ingrese el usuario en el campo txt_numero_2 automaticamente lo transforme a un entero (a un número)
                int valor2 = Integer.parseInt(txt_numero_2.getText().toString());
                // Realizamos la suma
                int resultado = valor1 + valor2;
                //Mostramos el resultado de la operación suma en el textView (tvt_resultado)
                tvt_resultado.setText(Integer.toString(resultado));

                txt_numero_1.setText("");
                txt_numero_2.setText("");
                txt_numero_1.requestFocus();
            }
        });

    }
}