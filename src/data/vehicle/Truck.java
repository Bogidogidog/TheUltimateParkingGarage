package data.vehicle;

import data.CarType;

public class Truck extends Vehicle implements Parkable{
    public Truck(String plateNumber) {
        super(plateNumber);
    }

    @Override
    public CarType getTypeOfVehicle() {
        return CarType.TRUCK;
    }
}
