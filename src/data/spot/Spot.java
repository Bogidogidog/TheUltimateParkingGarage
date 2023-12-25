package data.spot;

public class Spot {

    private int id;

    private double price;

    private boolean isOccupied;

    public Spot(int id, double price) {
        this.id = id;
        this.price = price;
        this.isOccupied = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}
