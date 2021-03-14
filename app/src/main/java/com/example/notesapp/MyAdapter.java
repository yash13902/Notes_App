package com.example.notesapp;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    static ArrayList<String> s1 = new ArrayList<>();
    static ArrayList<String> s2 = new ArrayList<>();
    static RecyclerView.Adapter adapter;
    public MyAdapter(Context ct){
        context = ct;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {

        if (s1 != null && s2 != null) {
            holder.myHeader.setText(s1.get(position));
            holder.myBody.setText(s2.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return s1.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView myHeader, myBody;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myHeader = itemView.findViewById(R.id.textTitle);
            myBody = itemView.findViewById(R.id.textDescription);
        }
    }
}

