package com.enoque.produt_registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName, editTextPrice, editTextValidity, editTextQuantity;
    private Button buttonRegister, buttonList;

    private ArrayList<Product> products = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        buttonRegister = findViewById(R.id.btnRegist);
        buttonList = findViewById(R.id.btnList);

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addToList();
            }
        });

        buttonList.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listProducts(products);
            }
        }));

    }

    public void addToList() {
        editTextName = findViewById(R.id.etxtName);
        editTextPrice = findViewById(R.id.etxPrice);
        editTextValidity = findViewById(R.id.extValidity);
        editTextQuantity = findViewById(R.id.extQuantity);

        String name = editTextName.toString();
        double price = Double.valueOf(editTextPrice.toString());
        int validity = Integer.valueOf(editTextValidity.toString());
        int quantity = Integer.valueOf(editTextQuantity.toString());

        products.add(new Product(name, price, validity, quantity));
    }

    public void listProducts(ArrayList<Product> p) {
        for(int i = 0; i < p.size(); i++) {
            System.out.println(p.get(i).getName());
            System.out.println(p.get(i).getPrice());
            System.out.println(p.get(i).getValidity());
            System.out.println(p.get(i).getQuantity());
        }
    }

}