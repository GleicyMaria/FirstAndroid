package com.example.dado;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void rolarDado(View view){
        int valor = radom();
        ImageView img = findViewById(R.id.imageView4);
        Log.d("valor", " " + valor);
        switch (valor){

            case 0:
                rolarDado(view);
                break;
            case 1 :
                img.setImageResource(R.drawable.dice1);
                break;
            case 2 :
                img.setImageResource(R.drawable.dice2);
                break;
            case 3:
                img.setImageResource(R.drawable.dice3);
               break;
            case 4 :
                img.setImageResource(R.drawable.dice4);
                break;
            case 5 :
                img.setImageResource(R.drawable.dice5);
                break;
            case 6 :
                img.setImageResource(R.drawable.dice6);
                break;
        }

    }

    public  int radom (){
        Random rand = new Random();
        return  rand.nextInt(6)+1;
    }


}
