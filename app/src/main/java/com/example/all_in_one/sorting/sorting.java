package com.example.all_in_one.sorting;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.all_in_one.R;

public class sorting extends AppCompatActivity {
    Button bubblel, selection, insertion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorting);
        bubblel = findViewById(R.id.bubblel);
        selection = findViewById(R.id.selection);
        insertion = findViewById(R.id.insertion);
        openfragment(new Bubble(), 0);
       selection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfragment(new selection(), 1);

            }
        });
        bubblel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfragment(new Bubble(), 1);

            }
        });
        insertion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfragment(new insertinon(), 1);

            }
        });

    }

    private void openfragment(Fragment fragment, int num) {
        FragmentManager fg = getSupportFragmentManager();
        FragmentTransaction ft = fg.beginTransaction();

        if(num==0){
            ft.add(R.id.sorting,fragment);
        }else {

            ft.replace(R.id.sorting,fragment);


        }
        ft.commit();

    }
}