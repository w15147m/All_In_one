package com.example.all_in_one;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Toolbar toolbar;
    CardView cardView1 , cardView2 , cardView3 , cardView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        Hooks
        toolbar = findViewById(R.id.toolbar2);
        cardView1 = findViewById(R.id.card1);
        cardView2 = findViewById(R.id.card2);
        cardView3 = findViewById(R.id.card3);
        cardView4 = findViewById(R.id.card4);
//        step 1
        setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        getSupportActionBar().setSubtitle("Home page");


           cardView1.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent = new Intent(MainActivity2.this , S_R_L_View.class);
                   startActivity(intent);
//                   Toast.makeText(MainActivity2.this, "ali mola", Toast.LENGTH_SHORT).show();
               }
           });








    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.opt_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemid = item.getItemId();

        if(itemid==R.id.profile){

//            Toast.makeText(this, "profile", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity2.this , MainActivity.class);
            startActivity(intent);
        }else if(itemid==R.id.newtab){

            Toast.makeText(this, "new", Toast.LENGTH_SHORT).show();
        }else if(itemid==R.id.history){
            Intent intent = new Intent(MainActivity2.this , S_R_L_View.class);
            startActivity(intent);
//            Toast.makeText(this, "history", Toast.LENGTH_SHORT).show();


        } else if(itemid==R.id.setting){

            Toast.makeText(this, "setting", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}