package com.example.ecommerceapp.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ecommerceapp.R;

public class Cart extends AppCompatActivity {
 ImageView back , plus , minus , image ;
 TextView name , qunt , price ,totalItem , totalPrice ,count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        back = findViewById(R.id.cart_back_id);
        plus =findViewById(R.id.cart_plus_id);
        minus =findViewById(R.id.cart_minus_id);
        image =findViewById(R.id.cart_image_id);
        name = findViewById(R.id.cart_name_id);
        qunt =findViewById(R.id.cart_quant_id);
        price =findViewById(R.id.cart_price_id);
        totalItem =findViewById(R.id.total_item_id);
        totalPrice =findViewById(R.id.tot_price_id);
        count = findViewById(R.id.counter);
        Intent i = getIntent();
        name.setText(i.getStringExtra("name"));
        qunt.setText(i.getStringExtra("quantity"));
        price.setText(i.getStringExtra("price"));
        image.setImageResource(i.getIntExtra("image",R.drawable.elviveee));
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int qunt =Integer.parseInt(count.getText().toString());
                int temp =qunt+1;
                count.setText(String.valueOf(temp));
                totalItem.setText(String.valueOf(temp));
                double total = temp * Double.valueOf(price.getText().toString());
                totalPrice.setText(String.valueOf(total));
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int qunt =Integer.parseInt(count.getText().toString());
                if(qunt!=1){
                    int temp =qunt-1;
                    count.setText(String.valueOf(temp));
                    totalItem.setText(String.valueOf(temp));
                    double total = temp* Double.valueOf(price.getText().toString());
                    totalPrice.setText(String.valueOf(total));
                }

            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Cart.this,Category.class));
            }
        });
    }
}
