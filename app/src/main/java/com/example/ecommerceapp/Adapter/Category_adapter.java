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
import com.example.ecommerceapp.UI.Cart;
import com.example.ecommerceapp.UI.ItemDetail;
import com.example.ecommerceapp.model.prevOrder;

import java.util.ArrayList;

public class Category_adapter extends RecyclerView.Adapter<Category_adapter.category_holder>{

    Context context;
    ArrayList<prevOrder> orders;

    public Category_adapter(@NonNull Context context, ArrayList<prevOrder> orders) {
        this.context = context;
        this.orders = orders;
    }

    public category_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.category_row,parent,false);

        return new category_holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull category_holder holder,final int position) {
        holder.image.setImageResource(orders.get(position).getImage());
        holder.price.setText(orders.get(position).getPrice());
        holder.quntity.setText(orders.get(position).getQuntity());
        holder.name.setText(orders.get(position).getName());
        holder.itemView.setBackgroundColor(orders.get(position).getColor());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, ItemDetail.class);
                i.putExtra("name",orders.get(position).getName());
                i.putExtra("image",orders.get(position).getImage());
                i.putExtra("quantity",orders.get(position).getQuntity());
                i.putExtra("price",orders.get(position).getPrice());
                i.putExtra("desc",orders.get(position).getDecs());
                i.putExtra("man",orders.get(position).getManfactoringDet());
                context.startActivity(i);
            }
        });
        holder.order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, Cart.class);
                i.putExtra("name",orders.get(position).getName());
                i.putExtra("image",orders.get(position).getImage());
                i.putExtra("quantity",orders.get(position).getQuntity());
                i.putExtra("price",orders.get(position).getPrice());
                context.startActivity(i);
            }
        });
        //orders.get(position).getColor()
    }

    @Override
    public int getItemCount() {
        return orders.size();
    }

    public class category_holder extends RecyclerView.ViewHolder {
        ImageView image , order;
        TextView name ,quntity,price;
        public category_holder(@NonNull View itemView) {
            super(itemView);
                image =itemView.findViewById(R.id.category_image_id);
                name =itemView.findViewById(R.id.category_name_id);
                quntity =itemView.findViewById(R.id.total);
                price =itemView.findViewById(R.id.category_price_id);
                order = itemView.findViewById(R.id.category_add_id);

        }
    }
}
