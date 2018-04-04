package com.example.android.foodorder;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by RATNAKAR MISHRA on 03-04-2018.
 */

public class myAdapter extends RecyclerView.Adapter<myAdapter.ViewHolder> {
    private List<String> values;
    @Override
    public myAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v=inflater.inflate(R.layout.row_layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(myAdapter.ViewHolder holder, int position) {
        final String name = values.get(position);
        holder.text.setText(name);
        holder.text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context,Main2Activity.class);
                Bundle bundle= new Bundle();
                bundle.putString("name",name);
                i.putExtras(bundle);
                context.startActivity(i);
            }
        });



    }

    @Override
    public int getItemCount() {
        return values.size();
    }
    private Context context;
    public myAdapter(List<String> dataset){
        values=dataset;
    }
    public void add(int position, String item){
        values.add(position,item);
        notifyItemInserted(position);
    }
    public void remove(int position){
        values.remove(position);
        notifyItemRemoved(position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public View layout;
        public TextView text;
       // public ImageView myImage;
        public ViewHolder(View v) {
            super(v);
            layout=v;
            text=(TextView) v.findViewById(R.id.text1);
           // myImage=(ImageView) v.findViewById(R.id.myImage);
            context = itemView.getContext();
        }
    }
}
