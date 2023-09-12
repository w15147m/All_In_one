package com.example.all_in_one.C_C_T_view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.all_in_one.R;


public class BMI extends Fragment {
    EditText ft, in, weight;
    TextView btn, ruselt ,resultnum;
    public BMI() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate(R.layout.fragment_b_m_i, container, false);
        ft = view.findViewById(R.id.ft);
        in = view.findViewById(R.id.in);
        weight = view.findViewById(R.id.kg);
        btn = view.findViewById(R.id.btn);
        ruselt = view.findViewById(R.id.result);
        resultnum = view.findViewById(R.id.resultnum);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int myft = Integer.parseInt( ft.getText().toString());
                int myin = Integer.parseInt( in.getText().toString());
                int mykg = Integer.parseInt( weight.getText().toString());


                int totalin =myft*12+myin;
                double totalcm = totalin*2.53;
                double totalM = totalcm/100;
                double bmi1 =mykg/(totalM*totalM);
                Double bmi =Math.round (bmi1 * 100) / 100.0;
                String BMI = String.valueOf(bmi);
                if (bmi>25){

                    ruselt.setText("overweight");
                    resultnum.setText(BMI);
                }

                if (bmi<18){

                    ruselt.setText("lowweight");
                    resultnum.setText(BMI);
                }
                else {

                    ruselt.setText("healthy");
                    resultnum.setText(BMI);
                }












            }
        });




        return view;





    }
}