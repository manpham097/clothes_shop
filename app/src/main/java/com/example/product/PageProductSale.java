package com.example.product;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class PageProductSale extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_product_sale);

        gridView = findViewById(R.id.grid_product_sale);

        ArrayList<ProductSale> productSales = new ArrayList<>();
        productSales.add(new ProductSale("Ao thun trang","500,000","550,000","4.5","80RV"));
        productSales.add(new ProductSale("Ao thun trang","500,000","550,000","4.5","80RV"));
        productSales.add(new ProductSale("Ao thun trang","500,000","550,000","4.5","80RV"));
        productSales.add(new ProductSale("Ao thun trang","500,000","550,000","4.5","80RV"));

        ProductSaleAdapter adapter = new ProductSaleAdapter(this,productSales);
        gridView.setAdapter(adapter);

    }
}