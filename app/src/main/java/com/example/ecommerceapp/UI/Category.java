package com.example.ecommerceapp.UI;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ecommerceapp.Adapter.Category_adapter;
import com.example.ecommerceapp.R;
import com.example.ecommerceapp.model.item;
import com.example.ecommerceapp.model.prevOrder;

import java.util.ArrayList;

public class Category extends AppCompatActivity {
    RecyclerView cat_rec;
    TextView name;
    ImageView back , image;
    ArrayList<prevOrder>items;
    Category_adapter adapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        name = findViewById(R.id.category_name_id);
        image = findViewById(R.id.category_image_id);
        Intent i = getIntent();
        name.setText(i.getStringExtra("name"));
        image.setImageResource(i.getIntExtra("item",R.drawable.elviveee));





        cat_rec =findViewById(R.id.category_rec_id);
        items = new ArrayList<>();
        items.add(new prevOrder(R.drawable.head_shoulder_shampoo, "Head_Shoulder","1L","30",R.drawable.ffcolor,
        "Head & Shoulders Classic Clean Anti-Dandruff shampoo fights flakes and leaves your scalp clean Light classic scent leaves hair smelling fresh and clean",
                "Head & Shoulders Classic Clean Anti-Dandruff shampoo fights flakes and leaves your scalp clean Light classic scent leaves hair smelling fresh and clean"));
        items.add(new prevOrder(R.drawable.shampoo_dove, "DOVE","2L","20",R.drawable.scolor));
        items.add(new prevOrder(R.drawable.elviveee, "ELIVIVE","1L","25",R.drawable.tcolor));
        items.add(new prevOrder(R.drawable.green_shampoo, "OLIVE","1L","10",R.drawable.fcolor));
        items.add(new prevOrder(R.drawable.elviveee, "SHEROSA","1L","17",R.drawable.ffcolor));
        items.add(new prevOrder(R.drawable.head_shampoo, "Head_Shoulder","1L","30",R.drawable.fffcolor));
        items.add(new prevOrder(R.drawable.shampoo_dove, "ELIVIVE","1L","30",R.drawable.sscolor));
        items.add(new prevOrder(R.drawable.head_shoulder_shampoo, "DOVE","1L","30",R.drawable.ssscolor));
        items.add(new prevOrder(R.drawable.elviveee, "ELIVIVE","1L","30",R.drawable.ffcolor));
        adapter = new Category_adapter(this,items);
        RecyclerView.LayoutManager lm2 = new GridLayoutManager(this,2,RecyclerView.VERTICAL,false);
        cat_rec.setLayoutManager(lm2);
        cat_rec.setAdapter(adapter);
        back =findViewById(R.id.back_id);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Category.this,MainActivity.class));
            }
        });
    }
}
