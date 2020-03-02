package com.example.ex1matala2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button b;
    ImageView[] i = new ImageView[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.b);
        i[0] = (ImageView) findViewById(R.id.t);
        i[1] = (ImageView) findViewById(R.id.t1);
        i[2] = (ImageView) findViewById(R.id.t2);
    }

    public void eg(View view) {
        int x = (int) (Math.random() * 3 + 1);
        b.setText(x + "number");
        if (x == 1) {
            i[0].setVisibility(view.VISIBLE);
            i[1].setVisibility(view.INVISIBLE);
            i[2].setVisibility(view.INVISIBLE);

            i[0].setImageResource(R.drawable.ca);
        }
        if (x == 2) {
            i[1].setVisibility(view.VISIBLE);
            i[0].setVisibility(view.INVISIBLE);
            i[2].setVisibility(view.INVISIBLE);

            i[1].setImageResource(R.drawable.dog);
        }
        if (x == 3) {
            i[2].setVisibility(view.VISIBLE);
            i[1].setVisibility(view.INVISIBLE);
            i[0].setVisibility(view.INVISIBLE);

            i[2].setImageResource(R.drawable.ko);
        }
        }
    }