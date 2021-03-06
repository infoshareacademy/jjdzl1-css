package com.infoshare.academy.model.cars;

import com.infoshare.academy.model.cars.entity.Car;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
@Table(name = "cars")
public class CarTruck extends Car {

    @Column(name = "capacity")
    protected Integer capacity;
    @Column(name = "cargo_space")
    protected Integer cargoSpace;
    @Column(name = "has_lift")
    protected Boolean hasLift;


    //Constructor
    public CarTruck(Integer id, String make, String model, Integer year, Integer mileage, FuelSourceEnum fuelSourceEnum, Integer enginePower, ColorEnum colorEnum, BodyTypeEnum bodyTypeEnum, Integer seats, TransmissionEnum transmissionEnum, Integer capacity, Integer cargoSpace, Boolean hasLift) {
        super(id, make, model, year, mileage, fuelSourceEnum, enginePower, colorEnum, bodyTypeEnum, seats, transmissionEnum);
        this.capacity = capacity;
        this.cargoSpace = cargoSpace;
        this.hasLift = hasLift;
    }

    //Getters
    public Integer getCapacity() {
        return capacity;
    }

    public Integer getCargoSpace() {
        return cargoSpace;
    }

    public Boolean getHasLift() {
        return hasLift;
    }

    //Setters
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public void setCargoSpace(Integer cargoSpace) {
        this.cargoSpace = cargoSpace;
    }

    public void setHasLift(Boolean hasLift) {
        this.hasLift = hasLift;
    }

    //Methods

    @Override
    public String toString() {
        return "CarTruck{" +
                "capacity=" + capacity +
                ", cargoSpace=" + cargoSpace +
                ", hasLift=" + hasLift +
                ", id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", fuelSource=" + fuelSource +
                ", enginePower=" + enginePower +
                ", color=" + color +
                ", bodyType=" + bodyType +
                ", seats=" + seats +
                ", transmission=" + transmission +
                '}';
    }
}

