package com.example.product;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.grid_product);

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("ao thun trang","500000","4.6","86RV"));
        products.add(new Product("ao thun den","550000","4.6","87RV"));
        products.add(new Product("ao thun den","550000","5.0","88RV"));
        products.add(new Product("ao thun den","550000","4.6","89RV"));


        ProductAdapter adapter = new ProductAdapter(this,products);
        gridView.setAdapter(adapter);
    }
}