package com.example.all_in_one.R_S_L;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.view.LayoutInflaterCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.all_in_one.R;

import java.util.ArrayList;

public class myadpterclass  extends RecyclerView.Adapter<myadpterclass.myviewholder>
{
  ArrayList<datamodel> dataholder;

    public myadpterclass(ArrayList<datamodel> dataholder) {
        this.dataholder = dataholder;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row_design,parent,false);
    return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
//  holder .iimg


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class myviewholder extends RecyclerView.ViewHolder
 {
   ImageView iimg;
   TextView header , sheader;


   public myviewholder(@NonNull View itemView) {
     super(itemView);
   iimg = itemView.findViewById(R.id.img1);
   header = itemView.findViewById(R.id.ta1);
   sheader = itemView.findViewById(R.id.ta2);


   }
 }


  }


