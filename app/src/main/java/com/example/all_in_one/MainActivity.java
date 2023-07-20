package com.example.all_in_one;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
  Toolbar toolbar;
    MaterialButton button;
    ImageView facebook;

  EditText password , textname;

//    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        textname = findViewById(R.id.editTextText);
       password = findViewById(R.id.editpass);
        button  = findViewById(R.id.loginbtn);
        facebook = findViewById(R.id.facebook);

//       admin and admin
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                if(textname.getText().toString().equals("admin") && password.getText().toString().equals("admin") ){


//                    Toast.makeText(MainActivity.this, "now you are login", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                    startActivity(intent);

                }
                else {

                    Toast.makeText(MainActivity.this, "user name or password is incorrect ", Toast.LENGTH_SHORT).show();
                }
            }
        });



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
Intent intent = new Intent(MainActivity.this , MainActivity.class);
//            Toast.makeText(this, "log in please", Toast.LENGTH_SHORT).show();
        }else if(itemid==R.id.newtab){

            Toast.makeText(this, "log in please", Toast.LENGTH_SHORT).show();
        }else if(itemid==R.id.history){

            Toast.makeText(this, "log in please", Toast.LENGTH_SHORT).show();
        } else if(itemid==R.id.setting){

            Toast.makeText(this, "log in please", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}