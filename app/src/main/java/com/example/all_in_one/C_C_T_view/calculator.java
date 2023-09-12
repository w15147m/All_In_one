package com.example.all_in_one.C_C_T_view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.all_in_one.R;
import com.google.android.material.button.MaterialButton;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class calculator extends Fragment/*, AppCompatActivity implements View.OnClickListener*/ {


    TextView resultTv, solutionTview;
    MaterialButton buttonc,buttonAC, buttondot, buttondmdu;
    MaterialButton buttondivide, buttonmultiply, buttonminus, buttonplus, buttonequls;
    MaterialButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button0;

    public calculator() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calculator, container, false);
        // hooks
        resultTv = view.findViewById(R.id.result_tv);
        solutionTview = view.findViewById(R.id.solution_tview);
        solutionTview.setText("");
        resultTv.setText("");
        buttonc = view.findViewById(R.id.button_c);
        buttondmdu = view.findViewById(R.id.button_mdu);
        buttondivide = view.findViewById(R.id.button_divide);
        button1 = view.findViewById(R.id.button_1);
        button2 = view.findViewById(R.id.button_2);
        button3 = view.findViewById(R.id.button_3);
        buttonmultiply = view.findViewById(R.id.button_multiply);
        button4 = view.findViewById(R.id.button_4);
        button5 = view.findViewById(R.id.button_5);
        button6 = view.findViewById(R.id.button_6);
        buttonplus = view.findViewById(R.id.button_plus);
        button7 = view.findViewById(R.id.button_7);
        button8 = view.findViewById(R.id.button_8);
        button9 = view.findViewById(R.id.button_9);
        buttonminus = view.findViewById(R.id.button_minus);
        buttonAC = view.findViewById(R.id.button_AC);
        button0 = view.findViewById(R.id.button_0);
        buttondot = view.findViewById(R.id.button_dot);
        buttonequls = view.findViewById(R.id.button_equals);


        return view;
    }

 /*   @Override
    public void onClick(View v) {


        MaterialButton button = (MaterialButton) v;
        String btnText  = button.getText().toString();
        String dataToCalculat = solutionTview.getText().toString();


        if(btnText.equals("AC")){
            solutionTview.setText("");
            resultTv.setText("");
            return;

        } else if (btnText.equals("=")) {

            resultTv.setText(resultTv.getText());
            solutionTview.setText("");
            return;
        }
        else if (btnText.equals("C")) {

            dataToCalculat = dataToCalculat.substring(0 ,dataToCalculat.length()-1);
            return;
        }else {

            dataToCalculat = dataToCalculat + btnText;
            String fResult = getResult(dataToCalculat);
            if (!fResult.equals("Err")){
                resultTv.setText(fResult);

            }

        }




        solutionTview.setText(dataToCalculat);

      *//*  if(btnText.equals("=")){

            resultTv.setText(solutionTview.getText());


        }
        if(btnText.equals("c")){

            dataToCalculat = dataToCalculat.substring(0 ,dataToCalculat.length()-1);
        }else{
            dataToCalculat = dataToCalculat + btnText;

        }
        if(btnText.equals("AC")){

            solutionTview.setText("");
            resultTv.setText("");
        }else {
            solutionTview.setText(dataToCalculat);
        }*//*

    }
    String getResult(String data){
        try{
            Context context  = Context.enter();
            context.setOptimizationLevel(-1);
            Scriptable scriptable = context.initStandardObjects();
            String finalResult =  context.evaluateString(scriptable,data,"Javascript",1,null).toString();
            if(finalResult.endsWith(".0")){
                finalResult = finalResult.replace(".0","");
            }
            return finalResult;
        }catch (Exception e){
            return "Err";
        }

    }*/


}