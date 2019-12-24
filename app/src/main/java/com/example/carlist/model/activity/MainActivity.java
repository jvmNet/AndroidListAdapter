package com.example.carlist.model.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.carlist.R;
import com.example.carlist.model.car_adapter.CarsAdapter;
import com.example.carlist.model.car_description.Cars;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cars_list);

        List<Cars> list_cars = getItems();

        CarsAdapter carsAdapter = new CarsAdapter(this, list_cars);

        ListView list_car = (ListView) findViewById(R.id.list_cars_id);
        list_car.setAdapter(carsAdapter);

    }

    public void changeActivityClick(View view){
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    private List<Cars> getItems(){
        List<Cars> items = new ArrayList<Cars>();

        items.add(new Cars("KIA", 240, 1.6));
        items.add(new Cars("BMW", 280, 2));
        items.add(new Cars("Mersedes", 320, 3));
        items.add(new Cars("Skoda", 240, 1.8));
        items.add(new Cars("VW", 280, 2));

        return items;
    }
}
