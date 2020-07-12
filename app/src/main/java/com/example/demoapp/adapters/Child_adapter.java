package com.example.demoapp.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demoapp.R;
import com.example.demoapp.models.Child_Object;

import java.util.ArrayList;
import java.util.List;

public class Child_adapter extends RecyclerView.Adapter<Child_adapter.ChildViewHolder> {
    private Context mcontex;
    private ArrayList<Child_Object> child_objectList;

    public Child_adapter(Context mcontext, ArrayList<Child_Object> child_objectList) {
        this.mcontex = mcontext;
        this.child_objectList = child_objectList;
    }

    @NonNull
    @Override
    public ChildViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new ChildViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_child, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ChildViewHolder holder, int position) {


        holder.itemImage.setImageResource(child_objectList.get(position).getImage());
        holder.name.setText(child_objectList.get(position).getName());
        holder.tag.setText(child_objectList.get(position).getTag());
    }

    @Override
    public int getItemCount() {
        return child_objectList.size();
    }


    public static final class ChildViewHolder extends RecyclerView.ViewHolder {

        ImageView itemImage;
        TextView name,tag;

        public ChildViewHolder(@NonNull View itemView) {
            super(itemView);

            itemImage = (ImageView) itemView.findViewById(R.id.Cimage);
            name=(TextView)itemView.findViewById(R.id.Cname);
            tag=(TextView)itemView.findViewById(R.id.Tag);
        }
    }
}