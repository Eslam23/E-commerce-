package com.example.ecommerceapp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommerceapp.R;
import com.example.ecommerceapp.UI.Category;
import com.example.ecommerceapp.model.item;

import java.util.ArrayList;

public class item_adapter extends RecyclerView.Adapter<item_adapter.item_viewholder> {
  Context context;
  ArrayList<item>data;

    public item_adapter(Context context, ArrayList<item> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public item_viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_row,parent,false);

        return new item_viewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull item_viewholder holder,final int position) {
     holder.Item.setImageResource(data.get(position).getImage());
     holder.Name.setText(data.get(position).getItem_name());
     holder.Item.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent i = new Intent(context, Category.class);
             i.putExtra("item",data.get(position).getImage());
             i.putExtra("name",data.get(position).getItem_name());
             context.startActivity(i);
         }
     });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class item_viewholder extends RecyclerView.ViewHolder {
        ImageView Item;
        TextView Name;
        public item_viewholder(@NonNull View itemView) {
            super(itemView);
            Item =itemView.findViewById(R.id.item_imagee_id);
            Name =itemView.findViewById(R.id.itemName_id);


        }
    }
}
