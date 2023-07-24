package com.example.all_in_one.C_C_T_view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.all_in_one.R;


public class convertor extends Fragment {


    TextView eure, yuan, us, dirham, rial;
    Button btn;
    EditText pkr;


    public convertor() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_convertor, container, false);

        btn = view.findViewById(R.id.convert);
        eure = view.findViewById(R.id.eure);
        yuan = view.findViewById(R.id.yuan);
        us = view.findViewById(R.id.us);
        dirham = view.findViewById(R.id.dirham);
        rial = view.findViewById(R.id.rial);
        pkr = view.findViewById(R.id.pkr);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Float num = Float.parseFloat(pkr.getText().toString());

                us.setText(""+us$(num));
                dirham.setText("" +fdirhum(num) );
                yuan.setText("" + fyuan(num));
                eure.setText("" + feure(num));
                rial.setText("" + frial(num));


//               Toast.makeText(getActivity(), "aasdfasf", Toast.LENGTH_SHORT).show();


            }
        });


        return view;
    }


    public double us$(float num) {

        Double us1 = num / 285.00;
        Double us =Math.round (us1 * 100) / 100.0;

        return us;

    }
    public double fyuan(float num) {

        Double us1 = num / 39.71;
        Double us =Math.round (us1 * 100) / 100.0;

        return us;

    }
    public double feure(float num) {

        Double us1 = num / 317.17;
        Double us =Math.round (us1 * 100) / 100.0;

        return us;

    }
    public double fdirhum(float num) {

        Double us1 = num / 77.59;
        Double us =Math.round (us1 * 100) / 100.0;

        return us;

    }  public double frial(float num) {

        Double us1 = num * 75.97;
        Double us =Math.round (us1 * 100) / 100.0;

        return us;

    }


}