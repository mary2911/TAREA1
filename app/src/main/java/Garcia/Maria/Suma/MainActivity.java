package Garcia.Maria.Suma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText editTextNum1,editTextNum2;
Button buttonCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //match con los widgets
        editTextNum1 = findViewById(R.id.Num1);
        editTextNum2 = findViewById(R.id.Num2);
        buttonCalcular = findViewById(R.id.res);
        buttonCalcular.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (editTextNum1.getText().toString().equals("") && editTextNum2.getText().toString().equals("") ){

                    Toast.makeText(getApplicationContext(),"Ingresa los 2 numeros", Toast.LENGTH_SHORT).show();



                }else{
                    int Num1 = Integer.parseInt(editTextNum1.getText().toString());
                    int Num2 = Integer.parseInt(editTextNum2.getText().toString());

                    int suma = Num1+Num2;

                    Toast.makeText(getApplicationContext(),
                            "Resultado "+suma, Toast.LENGTH_SHORT).show();


                }


            }
        });
    }

}