package id.uchidd.aplikasiiseng;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etPertama, etKedua;
    Button btnMenghitung;
    String valuePertama, valueKedua;
    int bilanganPertama, bilanganKedua, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPertama = (EditText)findViewById(R.id.etKolomPertama);
        etKedua = (EditText)findViewById(R.id.etKolomKedua);
        btnMenghitung = (Button)findViewById(R.id.btnPertambahan);

        btnMenghitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valuePertama = etPertama.getText().toString();
                valueKedua = etKedua.getText().toString();
                bilanganPertama = Integer.parseInt(valuePertama);
                bilanganKedua = Integer.parseInt(valueKedua);
                hasil = bilanganPertama + bilanganKedua;

                Toast.makeText(MainActivity.this, "" + hasil, Toast.LENGTH_LONG).show();
            }
        });

    }
}