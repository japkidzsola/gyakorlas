package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

public class Beginner extends AppCompatActivity {

    public Button first, second,third, fourth;
    public ImageView beginnerimg;
    public TextView beginnertv;

    List<String> randomHiragana, voltmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner);
        init();
        randomHiragana.add("a");
        randomHiragana.add("i");
        randomHiragana.add("u");

        String stringgealakitva = Integer.toString(randomgenerator());
        String megoldas = general(stringgealakitva);

        first.setText(megoldas);
    }

    public String general(String stringgealakit)
    {
        String megoldas = null;
        for (String s:randomHiragana) {
            if(s.equals(stringgealakit))
            {
                if(stringgealakit.equals(0))
                {
                    beginnerimg.setImageResource(R.drawable.a);
                    megoldas = "a";
                } else if(stringgealakit.equals(1))
                {
                    beginnerimg.setImageResource(R.drawable.i);
                    megoldas = "i";
                } else if(stringgealakit.equals(2))
                {
                    beginnerimg.setImageResource(R.drawable.u);
                    megoldas = "u";
                }
            }
        }
        return megoldas;
    }

    public int randomplace()
    {
        int min=0;
        int max=3;

        Random random=new Random();
        int randomnumber=random.nextInt(max-min)+min;
        return randomnumber;
    }

    public int randomgenerator()
    {
        int min=0;
        int max=2;

        Random random=new Random();
        int randomnumber=random.nextInt(max-min)+min;
        String rand = Integer.toString(randomnumber);
        return randomnumber;
    }

    public void init()
    {
        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        third = findViewById(R.id.third);
        fourth = findViewById(R.id.fourth);
        beginnerimg = findViewById(R.id.begginerimg);
        beginnertv = findViewById(R.id.beginnertv);
    }
}
