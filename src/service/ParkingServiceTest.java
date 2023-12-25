package service;

import data.vehicle.RegularCar;
import data.vehicle.Vehicle;

import static org.junit.jupiter.api.Assertions.*;

class ParkingServiceTest {

    @org.junit.jupiter.api.Test
    void parkTheClientsCar() {

        //ARRANGE
        ParkingService parkingService = new ParkingService();

        Vehicle vehicle = new RegularCar("TestPlateNumber");

        //ACT
        String ticketString = parkingService.parkTheClientsCar(vehicle);

        //ASSERT
        assertEquals(ticketString, "TICKET " + vehicle.getPlateNumber());
    }
}