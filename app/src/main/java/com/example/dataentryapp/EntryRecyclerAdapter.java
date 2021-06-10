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

public class EntryRecyclerAdapter extends RecyclerView.Adapter<EntryRecyclerAdapter.ViewHolder>{
    Context context;
    String[] entriesList;

    // RecyclerView recyclerView;
    public EntryRecyclerAdapter(Context context, String[] entriesList) {
        this.context = context;
        this.entriesList = entriesList;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View listItem = layoutInflater.inflate(R.layout.entrylist, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(entriesList[position]);
        Log.d("Priyaa", "onBindViewHolder: "+entriesList[position]);
        // holder.relativeLayout.setOnClickListener(view -> Toast.makeText(view.getContext(),"click on item: "+listData[position],Toast.LENGTH_LONG).show());

        holder.textView.setOnClickListener(view -> {
            if(entriesList[position].equals("Credit Entry")){
                Toast.makeText(view.getContext(), "item1"+ entriesList[position],Toast.LENGTH_SHORT).show();
                Intent intent = new Intent (context, CreditEntry.class);
                context.startActivity(intent);
            }
            else if(entriesList[position].equals("Collection Entry")){
                Toast.makeText(view.getContext(), "item2"+ entriesList[position],Toast.LENGTH_SHORT).show();
            }

            else{
                Toast.makeText(context, "Nothing", Toast.LENGTH_SHORT).show();
            }

        });
    }


    @Override
    public int getItemCount() {
        return entriesList.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public RelativeLayout relativeLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.textView = (TextView) itemView.findViewById(R.id.entries);
            relativeLayout = (RelativeLayout)itemView.findViewById(R.id.entry_layout);
        }
    }
}