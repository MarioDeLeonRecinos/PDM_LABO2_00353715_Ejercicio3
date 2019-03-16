package com.example.ejercicio3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private View zonaRoja, zonaVerde, zonaAzul;
    private Random ran = new Random();
    private ArrayList<Integer> Reds =new ArrayList<>();
    private ArrayList<Integer> Greens =new ArrayList<>();
    private ArrayList<Integer> Blues =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zonaRoja =findViewById(R.id.zona_roja);
        zonaVerde =findViewById(R.id.zona_verde);
        zonaAzul =findViewById(R.id.zona_azul);

        Reds.add(R.color.rojo1);
        Reds.add(R.color.rojo2);
        Reds.add(R.color.rojo3);
        Reds.add(R.color.rojo4);
        Reds.add(R.color.rojo5);
        Reds.add(R.color.rojo6);

        Greens.add(R.color.verde1);
        Greens.add(R.color.verde2);
        Greens.add(R.color.verde3);
        Greens.add(R.color.verde4);
        Greens.add(R.color.verde5);
        Greens.add(R.color.verde6);

        Blues.add(R.color.azul1);
        Blues.add(R.color.azul2);
        Blues.add(R.color.azul3);
        Blues.add(R.color.azul4);
        Blues.add(R.color.azul5);
        Blues.add(R.color.azul6);

        zonaRoja.setOnClickListener(this);
        zonaVerde.setOnClickListener(this);
        zonaAzul.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        View object = findViewById(v.getId());
        int num= ran.nextInt(6);
        switch (v.getId()){
            case R.id.zona_roja:
                object.setBackgroundColor(getResources().getColor(Reds.get(num)));
                break;
            case R.id.zona_verde:
                object.setBackgroundColor(getResources().getColor(Greens.get(num)));
                break;
            case R.id.zona_azul:
                object.setBackgroundColor(getResources().getColor(Blues.get(num)));
                break;
        }


    }
}
