package model;

public abstract class Residence {
    private double price;
    private double area;
    private int roomCount;
    private int loungeCount;

    public Residence(double price, double area, int roomCount, int loungeCount) {
        this.price = price;
        this.area = area;
        this.roomCount = roomCount;
        this.loungeCount = loungeCount;
    }

    @Override
    public String toString() {
        return "Residence{" +
                "price=" + price +
                ", area=" + area +
                ", roomCount=" + roomCount +
                ", loungeCount=" + loungeCount +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getLoungeCount() {
        return loungeCount;
    }

    public void setLoungeCount(int loungeCount) {
        this.loungeCount = loungeCount;
    }
}
