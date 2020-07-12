package com.example.demoapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demoapp.R;
import com.example.demoapp.models.Mainscreen_Object;

import java.util.ArrayList;

public class Mainscreen_adapter extends RecyclerView.Adapter<Mainscreen_adapter.ViewHolder> {
    Context mcontex;
    ArrayList<Mainscreen_Object> arrayList;

    public Mainscreen_adapter(Context mcontex, ArrayList<Mainscreen_Object> arrayList) {
        this.mcontex = mcontex;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View listview=layoutInflater.inflate(R.layout.recyclerview_mainpage,parent,false);
        ViewHolder viewHolder=new ViewHolder(listview);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageView.setImageResource(arrayList.get(position).getImageid());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mcontex=itemView.getContext();
            imageView=(ImageView)itemView.findViewById(R.id.imageView);

        }
    }
}
