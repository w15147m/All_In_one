package com.example.all_in_one.fooddata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.all_in_one.R;

public class getdata extends AppCompatActivity {

    TextView t1, t2, t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getdata);
        Bundle bundle = getIntent().getExtras();

        t1 = findViewById(R.id.tview1);
        t2 = findViewById(R.id.tview2);
        t3 = findViewById(R.id.tview3);
        t1.setText(bundle.getString("name"));
        t2.setText(bundle.getString("email"));
        t3.setText(bundle.getString("phone"));

//        Toast.makeText(this, bundle.getString("name"), Toast.LENGTH_SHORT).show();


    }
}