package com.example.recyclerviewonclicklistener;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DataViewHolder extends RecyclerView.ViewHolder {

    TextView Name,Description;

    public DataViewHolder(@NonNull View itemView) {
        super(itemView);

        Name = itemView.findViewById(R.id.name);
        Description = itemView.findViewById(R.id.des);




    }


}
