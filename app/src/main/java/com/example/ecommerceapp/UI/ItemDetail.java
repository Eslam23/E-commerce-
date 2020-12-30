package com.example.ecommerceapp.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ecommerceapp.R;

public class ItemDetail extends AppCompatActivity {
 ImageView back , image ,order ,book ;
 TextView name ,quantity ,price , desc ,man ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);
        back = findViewById(R.id.detail_back_id);
        image =findViewById(R.id.detail_image_id);
        order =findViewById(R.id.detail_order_id);
        book =findViewById(R.id.detail_book_id);
        name =findViewById(R.id.datail_name_id);
        quantity =findViewById(R.id.detail_quan_id);
        price =findViewById(R.id.det_price_id);
        desc =findViewById(R.id.detail_description_id);
        man =findViewById(R.id.detail_man_id);
        Intent i = getIntent();
        image.setImageResource(i.getIntExtra("image",R.drawable.elviveee));
        name.setText(i.getStringExtra("name"));
        quantity.setText(i.getStringExtra("quantity"));
        price.setText(i.getStringExtra("price"));
        desc.setText(i.getStringExtra("desc"));
        man.setText(i.getStringExtra("man"));
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ItemDetail.this,Category.class));
            }
        });
    }
}
