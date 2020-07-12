package com.example.demoapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demoapp.R;
import com.example.demoapp.models.Child_Object;
import com.example.demoapp.models.parent_Object;

import java.util.ArrayList;
import java.util.List;

public class Parent_adapter extends RecyclerView.Adapter<Parent_adapter.parentViewHolder> {

  Context mcontext;
  ArrayList<parent_Object> parent_objectList;

    public Parent_adapter(Context mcontext, ArrayList<parent_Object> parent_objectList) {
        this.mcontext = mcontext;
        this.parent_objectList = parent_objectList;
    }

    @NonNull
    @Override
    public parentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new parentViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_parent, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull parentViewHolder holder, int position) {

        holder.title.setText(parent_objectList.get(position).getTitle());
        setChildRecycler(holder.recyclerView, (ArrayList<Child_Object>) parent_objectList.get(position).getChild_objects());

    }

    @Override
    public int getItemCount() {
        return parent_objectList.size();
    }

    public class parentViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        RecyclerView recyclerView;
        public parentViewHolder(@NonNull View itemView) {
            super(itemView);
            title=(TextView)itemView.findViewById(R.id.title);
            recyclerView=(RecyclerView)itemView.findViewById(R.id.recycler_parent);
        }
    }
    private void setChildRecycler(RecyclerView recyclerView, ArrayList<Child_Object> child_objectList){

        Child_adapter child_adapter=new Child_adapter(mcontext,child_objectList);
        recyclerView.setLayoutManager(new LinearLayoutManager(mcontext, RecyclerView.HORIZONTAL, false));
        recyclerView.setAdapter(child_adapter);

    }
}
