package data.vehicle;

import data.CarType;

public class RegularCar extends Vehicle implements Parkable{
    public RegularCar(String plateNumber) {
        super(plateNumber);
    }

    @Override
    public CarType getTypeOfVehicle() {
        return CarType.REGULARCAR;
    }
}
