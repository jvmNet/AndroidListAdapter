package com.example.carlist.model.car_description;

public class Cars {

    private String carModel;
    private double carSpeed;
    private double carEngineer;

    public Cars(String carModel, double carSpeed, double carEngineer){
        this.carModel = carModel;
        this.carSpeed = carSpeed;
        this.carEngineer = carEngineer;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public double getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(double carSpeed) {
        this.carSpeed = carSpeed;
    }

    public double getCarEngineer() {
        return carEngineer;
    }

    public void setCarEngineer(double carEngineer) {
        this.carEngineer = carEngineer;
    }
}
