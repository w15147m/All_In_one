package com.example.all_in_one;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  Toolbar toolbar;

//    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);

//        step 1

        setSupportActionBar(toolbar);
      if(getSupportActionBar()!=null){

          getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//          getSupportActionBar().setTitle("All");

      }

       getSupportActionBar().setSubtitle("log inpage");

      }


//       step 2

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.opt_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemid = item.getItemId();

        if(itemid==R.id.profile){

            Toast.makeText(this, "profile", Toast.LENGTH_SHORT).show();
        }else if(itemid==R.id.newtab){

            Toast.makeText(this, "new", Toast.LENGTH_SHORT).show();
        }else if(itemid==R.id.history){

            Toast.makeText(this, "history", Toast.LENGTH_SHORT).show();
        } else if(itemid==R.id.setting){

            Toast.makeText(this, "setting", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}