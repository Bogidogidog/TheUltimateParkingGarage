import data.vehicle.RegularCar;
import data.vehicle.Truck;
import data.vehicle.Vehicle;
import service.ParkingService;

public class Main {

    /*Your job is to design a parking garage.
    There are 2 types of parking spots: small and large. The price of small spots is $9.99, and for large spots, it’s $19.99.
    Each spot has to have a unique identifier.

    There are 2 types of vehicles that can park in this garage, regular cars and trucks.
    Each vehicle has to have a unique identifier.
    Regular cars can park in large spots but only if there are no small spots left in the garage.
    Trucks can only park in large spots.

    When a vehicle reserves a spot, it receives a ticket with the information of when it was reserved (date & time), the ID & price of the spot, and the ID of the vehicle.
    Two vehicles cannot park in the same parking spot.
    One vehicle cannot park in multiple spots at the same time.
    */

    public static void main(String[] args) {

        ParkingService parkingService = new ParkingService();

        System.out.println(parkingService.parkTheClientsCar(new RegularCar("RS666RS11")));
        System.out.println(parkingService.parkTheClientsCar(new RegularCar("RS666RS22")));
        System.out.println(parkingService.parkTheClientsCar(new RegularCar("RS666RS33")));
        System.out.println(parkingService.parkTheClientsCar(new RegularCar("RS666RS44")));
        System.out.println(parkingService.parkTheClientsCar(new RegularCar("RS666RS55")));
        System.out.println(parkingService.parkTheClientsCar(new Truck("TRUCKKKKK")));
        System.out.println(parkingService.parkTheClientsCar(new RegularCar("RS666RS66")));
        System.out.println(parkingService.parkTheClientsCar(new RegularCar("RS666RS77")));
        System.out.println(parkingService.parkTheClientsCar(new Truck("TRUCK2")));
        System.out.println(parkingService.parkTheClientsCar(new Truck("TRUCK4")));
        System.out.println(parkingService.parkTheClientsCar(new Truck("TRUCK5")));




    }



}