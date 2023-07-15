package com.example.all_in_one.fooddata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.all_in_one.R;

public class fdata extends AppCompatActivity {
    Button food , data ,buttonp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fdata);
        food = findViewById(R.id.food);
        data = findViewById(R.id.data);

        pass(new food() , 1);




        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pass(new food() , 1);

//                Toast.makeText(fdata.this, "click", Toast.LENGTH_SHORT).show();
            }
        });

        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
 pass(new datapass(), 1);
//                Toast.makeText(fdata.this, "click", Toast.LENGTH_SHORT).show();

            }
        });



    }


    public  void pass(Fragment fragment , int num){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();




                if(num == 1){
                    fragmentTransaction.replace(R.id.fdatacontaner , fragment);
//                    Toast.makeText(fdata.this, "click", Toast.LENGTH_SHORT).show();

                }else {
                    fragmentTransaction.add(R.id.fdatacontaner , fragment);
//                    Toast.makeText(fdata.this, "add", Toast.LENGTH_SHORT).show();

                }

        fragmentTransaction.commit();






    }
}