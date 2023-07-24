package com.example.all_in_one.R_S_L;

import android.content.ClipData;
import android.graphics.ColorSpace;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class itemadapter extends RecyclerView.Adapter<itemadapter.viewHolder> {
    @NonNull
    @Override
    public itemadapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }
//List<Model> ;
    public itemadapter() {

    }

    @Override
    public void onBindViewHolder(@NonNull itemadapter.viewHolder holder, int position) {




    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        public viewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
