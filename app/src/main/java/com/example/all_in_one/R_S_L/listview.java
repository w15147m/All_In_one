package com.example.all_in_one.R_S_L;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.all_in_one.R;

import java.util.ArrayList;


public class listview extends Fragment {
    ListView listView;
    ArrayList<String> arrName = new ArrayList<>();
    ArrayList<String> arrSName = new ArrayList<>();
    ArrayList<String> languages = new ArrayList<>();

    public listview() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_listview, container, false);

//        listview

        ListView listview = view.findViewById(R.id.listview);

        arrName.add("No 1: Karachi");
        arrName.add("No 2:Lahore");
        arrName.add("No 3:Faisalabad");
        arrName.add("No 4:Rawalpindi");
        arrName.add("No 5:Multan");
        arrName.add("No 6:Gujranwala");
        arrName.add("No 7:Hyderabad");
        arrName.add("No 8:Peshawar");
        arrName.add("No 9:Islamabad");
        arrName.add("No 10:Abbottabad");
        arrName.add("No 11:Sadiqabad");
        arrName.add("No 12:Jhelum");
        arrName.add("No 13:Nawabshah");
        arrName.add("No 14:Chiniot");
        arrName.add("No 15:Mirpur Khas");
        arrName.add("No 16:Okara");
        arrName.add("No 17:Sahiwal");
        arrName.add("No 18:Rahim Yar Khan");
        arrName.add("No 19:Kasur");
        arrName.add("No 20:Larkana");
        arrName.add("No 21:Gujrat");
        arrName.add("No 22:Mardan");
        arrName.add("No 23:Sheikhupura");
        arrName.add("No 24:Kandhkot");
        arrName.add("No 25:Sukkur");
        arrName.add("No 26:Bahawalpur");
        arrName.add("No 27:Sargodha");
        arrName.add("No 28:Sialkot");
        arrName.add("No 29:Sargodha");
        arrName.add("No 30:Quetta");


        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, arrName);
        listview.setAdapter(adapter);

// Spenner

        Spinner spinner = view.findViewById(R.id.sprinner);

        arrSName.add("cnic card");
        arrSName.add("Atm card");
        arrSName.add("school card");

        arrSName.add("voter card ");
        arrSName.add("Driving license card");
        arrSName.add("Rastion card");
        arrSName.add("bnzeer card");
        arrSName.add("cnic card");
        arrSName.add("Atm card");
        arrSName.add("school card");
        arrSName.add("voter card ");
        arrSName.add("Driving license card");
        arrSName.add("Rastion card");
        arrSName.add("bnzeer card");

        ArrayAdapter<String> Sadapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, arrSName);
        spinner.setAdapter(Sadapter);


//AutoCompleteTextView
        AutoCompleteTextView autoCompleteTextView = view.findViewById(R.id.auto);


        languages.add("C");
        languages.add("Java");
        languages.add("C++");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("HTML");
        languages.add("CSS");
        languages.add("XML");
        languages.add("Markdown");
        languages.add("SQL");
        languages.add("MATLAB");
        languages.add("R");
        languages.add("Ruby");
        languages.add("Kotlin");
        languages.add("NoSQL");
        languages.add("C#");
        languages.add("Angular");
        languages.add("PHP");
        languages.add("Typescript");
        ArrayAdapter web = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1,languages );
        autoCompleteTextView.setAdapter(web);
        autoCompleteTextView.setThreshold(1);


        return view;
    }
}