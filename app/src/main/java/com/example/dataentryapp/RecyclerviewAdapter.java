package com.example.dataentryapp;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder>{
    Context context;
    String[] listData;

    // RecyclerView recyclerView;
    public RecyclerviewAdapter(Context context, String[] listData) {
        this.context = context;
        this.listData = listData;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View listItem= layoutInflater.inflate(R.layout.pagelist, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(listData[position]);
        Log.d("Priyaa", "onBindViewHolder: "+listData[position]);
       // holder.relativeLayout.setOnClickListener(view -> Toast.makeText(view.getContext(),"click on item: "+listData[position],Toast.LENGTH_LONG).show());

        holder.textView.setOnClickListener(view -> {
            if(listData[position].equals("USERS")){
                Toast.makeText(view.getContext(), "item3"+ listData[position],Toast.LENGTH_SHORT).show();
                Intent intent = new Intent (context, UserRecycler.class);
                context.startActivity(intent);
            }
            else if(listData[position].equals("REPORT")){
                Toast.makeText(view.getContext(), "item2"+ listData[position],Toast.LENGTH_SHORT).show();
            }
            else if(listData[position].equals("ENTRIES")){
                Toast.makeText(view.getContext(), "item3"+ listData[position],Toast.LENGTH_SHORT).show();
                Intent intent = new Intent (context, EntryRecycler.class);
                context.startActivity(intent);
            }
            else{
                Toast.makeText(context, "Nothing", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public RelativeLayout relativeLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.textView = (TextView) itemView.findViewById(R.id.items);
            relativeLayout = (RelativeLayout)itemView.findViewById(R.id.relativeLayout);
        }
    }
}