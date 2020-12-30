package com.example.ecommerceapp.UI;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.ecommerceapp.Adapter.item_adapter;
import com.example.ecommerceapp.Adapter.prev_order_adapter;
import com.example.ecommerceapp.R;
import com.example.ecommerceapp.model.item;
import com.example.ecommerceapp.model.prevOrder;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView item_rec, prev_rec;
    item_adapter adapter;
    prev_order_adapter prev_adapter;
    ArrayList<prevOrder> orders;
    ArrayList<item> items;
    private DrawerLayout mDrawerLayout;
    ImageView navigation,close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //define navigation drawer
        navigation =findViewById(R.id.navigation_id);
        mDrawerLayout =findViewById(R.id.drawer);
        //mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        //mDrawerLayout.addDrawerListener(mToggle);
        //mToggle.syncState();
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // If navigation drawer is not open yet, open it else close it.
                if(!mDrawerLayout.isDrawerOpen(GravityCompat.START)) mDrawerLayout.openDrawer(Gravity.START);
                else mDrawerLayout.closeDrawer(Gravity.END);
            }
        });
        View v = LayoutInflater.from(getBaseContext()).inflate(R.layout.nav,null);

        close =v.findViewById(R.id.close_id);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"Hello Javatpoint",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"hello",Toast.LENGTH_LONG).show();
                mDrawerLayout.closeDrawer(Gravity.END);
            }
        });
        item_rec = findViewById(R.id.itemRec_id);
        prev_rec = findViewById(R.id.prev_order_rec_id);
        orders = new ArrayList<>();
        items = new ArrayList<>();
        items.add(new item(R.drawable.head_shampoo, "Shampoo"));
        items.add(new item(R.drawable.dairymmilk, "Choclates"));
        items.add(new item(R.drawable.clasic_lays_chips, "Chips"));
        items.add(new item(R.drawable.head_shampoo, "Shampoo"));
        items.add(new item(R.drawable.clasic_lays_chips, "Chips"));

        orders.add(new prevOrder(R.drawable.head_shoulder_shampoo, "Head Shoulder", "1 peice", "30"));
        orders.add(new prevOrder(R.drawable.kettle_chips, "KETTLE CHIPS", "2 peice", "10"));
        orders.add(new prevOrder(R.drawable.dairymmilk, "Dairy Milk", "1 peice", "5"));
        orders.add(new prevOrder(R.drawable.kitkaat, "KitKat", "1 peice", "60"));
        prev_adapter = new prev_order_adapter(this, orders);
        RecyclerView.LayoutManager lm2 = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        prev_rec.setLayoutManager(lm2);
        prev_rec.setAdapter(prev_adapter);


        adapter = new item_adapter(this, items);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        item_rec.setLayoutManager(lm);
        item_rec.setAdapter(adapter);


    }
/*
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    */

}
