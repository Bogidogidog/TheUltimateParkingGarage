package service;

import data.CarType;
import data.spot.LargeSpot;
import data.spot.SmallSpot;
import data.spot.Spot;
import data.vehicle.Parkable;
import data.vehicle.RegularCar;
import data.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingService {

    List<Spot> parkingSpots;

    public ParkingService() {
        this.parkingSpots = new ArrayList<>();
        this.parkingSpots.add(new SmallSpot(1));
        this.parkingSpots.add(new SmallSpot(2));
        this.parkingSpots.add(new SmallSpot(3));
        this.parkingSpots.add(new SmallSpot(4));
        this.parkingSpots.add(new LargeSpot(5));
        this.parkingSpots.add(new LargeSpot(6));
        this.parkingSpots.add(new LargeSpot(7));
        this.parkingSpots.add(new SmallSpot(8));
        this.parkingSpots.add(new SmallSpot(9));
    }


    public String parkTheClientsCar(Vehicle clientVehicle) {

        CarType carType = ((Parkable) clientVehicle).getTypeOfVehicle();
        Spot freeSpot = getFreeSpot(carType);
        if(freeSpot==null && carType.equals(CarType.REGULARCAR)){
            freeSpot = getFreeSpot(CarType.TRUCK);
        }

        if(freeSpot==null){
            return "There is no space for this car: " + ((Parkable) clientVehicle).getTypeOfVehicle();
        }

        return parkAndPrintTicket(freeSpot, clientVehicle);
    }

    private String parkAndPrintTicket(Spot freeSpot, Vehicle clientVehicle) {
        freeSpot.setOccupied(true);
        System.out.println(freeSpot.getId());
        return "TICKET " + clientVehicle.getPlateNumber();
    }

    private Spot getFreeSpot(CarType type){
        for(Spot spot : parkingSpots){
            if(type == CarType.REGULARCAR && spot instanceof SmallSpot && !spot.isOccupied()){
                return spot;
            } else if(type == CarType.TRUCK && spot instanceof LargeSpot && !spot.isOccupied()){
                return spot;
            }
        }
        return null;
    }
}
