package com.example.all_in_one.sorting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.all_in_one.R;

import java.util.Arrays;


public class Bubble extends Fragment {
    TextView loop1, loop2, loop3, loop4;
    Button btn, rbtn;
    EditText eidtarr;

    public Bubble() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bubble, container, false);

        loop1 = view.findViewById(R.id.loop1);
        loop2 = view.findViewById(R.id.loop2);
        loop3 = view.findViewById(R.id.loop3);
        loop4 = view.findViewById(R.id.loop4);
        btn = view.findViewById(R.id.btn);
        rbtn = view.findViewById(R.id.Rbtn);
        eidtarr = view.findViewById(R.id.arr);
        loop1.setText(" ");
        loop2.setText(" ");
        loop3.setText(" ");
        loop4.setText(" ");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newarray = eidtarr.getText().toString();
                int[] array = method(newarray);
                int arr[] = array;

                for (int i = 0; i < arr.length - 1; i++) {
                    for (int j = 0; j < arr.length - i - 1; j++) {

                        if (arr[j] > arr[j + 1]) {
                            int tamp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = tamp;
                        }
                        printarray(arr, i);
                    }


                }


                // printing the string
//                String str = Arrays.toString(array).replaceAll("\\[|\\]", "");
//                loop1.setText(" : " + str);


            }
        });
        rbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loop1.setText(" ");
                loop2.setText(" ");
                loop3.setText(" ");
                loop4.setText(" ");
            }
        });
        return view;
    }
    private void printarray(int[] arr, int i) {
        if (i == 0) {
            String str = Arrays.toString(arr).replaceAll("\\[|\\]", "");
            loop1.setText(" : " + str);

        } else if (i == 1) {
            String str = Arrays.toString(arr).replaceAll("\\[|\\]", "");
            loop2.setText(" : " + str);
        } else if (i == 2) {
            String str = Arrays.toString(arr).replaceAll("\\[|\\]", "");
            loop3.setText(" : " + str);
        } else if (i == 3) {
            String str = Arrays.toString(arr).replaceAll("\\[|\\]", "");
            loop4.setText(" : " + str);
        }
    }

    static int[] method(String str) {

        String[] splitArray = str.split(" ");
        int[] array = new int[splitArray.length];


        for (int i = 0; i < splitArray.length; i++) {
            array[i] = Integer.parseInt(splitArray[i]);
        }
        return array;
    }
}