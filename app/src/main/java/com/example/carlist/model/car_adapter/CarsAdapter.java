package com.example.carlist.model.car_adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.carlist.R;
import com.example.carlist.model.car_description.Cars;

import java.util.List;

public class CarsAdapter extends BaseAdapter {

    private List<Cars> listCar;
    private LayoutInflater layoutInflater;

    public CarsAdapter(Context context, List<Cars> listCar){
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.listCar = listCar;
    }

    @Override
    public int getCount() {
        return listCar.size();
    }

    @Override
    public Object getItem(int position) {
        return listCar.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if(view == null){
            view = layoutInflater.inflate(R.layout.item_car, parent, false);
        }

        TextView car_model = (TextView) view.findViewById(R.id.car_model_id);
        TextView car_speed = (TextView) view.findViewById(R.id.car_speed_id);
        TextView car_engineer = (TextView) view.findViewById(R.id.car_engineer_id);

        Cars cars = (Cars) getItem(position);

        car_model.setText("Model car: " + cars.getCarModel());
        car_speed.setText("Speed car: " + cars.getCarSpeed());
        car_engineer.setText("Engineer car: " + cars.getCarEngineer());

        return view;
    }
}
