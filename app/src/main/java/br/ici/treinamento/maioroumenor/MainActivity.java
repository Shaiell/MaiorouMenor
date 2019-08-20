package br.ici.treinamento.maioroumenor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int aleatorio;

    public void NumeroAleatorio(){
        Random rand = new Random();

        aleatorio = rand.nextInt(10)+1;
    }

    public void menssagen(String menssagem){
        Toast.makeText(MainActivity.this, menssagem, Toast.LENGTH_SHORT).show();
    }

    public void adivinhar (View view){


        EditText editTextAdivinhar = (EditText) findViewById(R.id.editTextAdivinhar);
        int advinharNumero = Integer.parseInt(editTextAdivinhar.getText().toString());

        if(advinharNumero > aleatorio){
            menssagen("O numero gerado é menor!");
        }else if (advinharNumero < aleatorio){
            menssagen("O numero gerado é Maior!");
        }else {
            menssagen("Acertou! Tente Novamente!");
            NumeroAleatorio();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumeroAleatorio();
    }
}
