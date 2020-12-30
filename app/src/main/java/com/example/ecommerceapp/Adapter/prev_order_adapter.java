package com.example.ecommerceapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommerceapp.R;
import com.example.ecommerceapp.model.prevOrder;

import java.util.ArrayList;

public class prev_order_adapter extends RecyclerView.Adapter<prev_order_adapter.prev_holder> {
    Context context;
    ArrayList<prevOrder>orders;

    public prev_order_adapter(Context context, ArrayList<prevOrder> orders) {
        this.context = context;
        this.orders = orders;
    }

    @NonNull
    @Override
    public prev_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.prev_order,parent,false);

        return new prev_holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull prev_holder holder, int position) {
        holder.image.setImageResource(orders.get(position).getImage());
        holder.price.setText(orders.get(position).getPrice());
        holder.quntity.setText(orders.get(position).getQuntity());
        holder.name.setText(orders.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return orders.size();
    }

    public class prev_holder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name ,quntity,price,add;
        public prev_holder(@NonNull View itemView) {
            super(itemView);
            image =itemView.findViewById(R.id.item_imagee_id);
            name =itemView.findViewById(R.id.itemnamee_id);
            quntity =itemView.findViewById(R.id.quant_id);
            price =itemView.findViewById(R.id.price);
            add=itemView.findViewById(R.id.add_id);
        }
    }
}
