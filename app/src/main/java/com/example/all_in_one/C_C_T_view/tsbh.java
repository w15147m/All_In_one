package com.example.all_in_one.C_C_T_view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.all_in_one.R;


public class tsbh extends Fragment {
    View view;
    Button btnc;
    TextView t1, t2, t3, t4;
    int a = 0;
    int b = 0;
    int c = 0;
    int countbtn = 0;
    int counttotal = 0;

    public tsbh() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_tsbh, container, false);

        btnc = view.findViewById(R.id.btnc);
        t1 = view.findViewById(R.id.t1);
        t2 = view.findViewById(R.id.t2);
        t3 = view.findViewById(R.id.t3);
        t4 = view.findViewById(R.id.t4);


        // Inflate the layout for this fragment


//        t3.setText(String.valueOf(Ncount()));


        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (countbtn < 101) {
                btnc.setText(String.valueOf(btncount()));
                t4.setText(String.valueOf(totqlcount()));

                if (a < 34) {

                    t1.setText(String.valueOf(t1count()));

                } else if (b < 33) {

                    t2.setText(String.valueOf(t2count()));

                } else if (c < 33) {

                    t3.setText(String.valueOf(t3count()));

                } else if (counttotal < 101) {

                    t3.setText(String.valueOf(totqlcount()));

                }else {

                      Toast.makeText(getActivity(), "مکمل بوا", Toast.LENGTH_SHORT).show();



                }

                }else {

                    Toast.makeText(getActivity(), "مکمل بوا", Toast.LENGTH_SHORT).show();



                }
            }
        });


        return view;

    }

    public int t1count() {
        a++;
//        Toast.makeText(getActivity(), "ali mola", Toast.LENGTH_SHORT).show();
        return a;
    }

    public int t2count() {
        b++;
//        Toast.makeText(getActivity(), "ali mola", Toast.LENGTH_SHORT).show();
        return b;
    }

    public int t3count() {
        c++;
//        Toast.makeText(getActivity(), "ali mola", Toast.LENGTH_SHORT).show();
        return c;
    }

    public int totqlcount() {
        counttotal++;
//        Toast.makeText(getActivity(), "ali mola", Toast.LENGTH_SHORT).show();
        return counttotal;
    }

    public int btncount() {
        countbtn++;
//        Toast.makeText(getActivity(), "ali mola", Toast.LENGTH_SHORT).show();
        return countbtn;
    }


}