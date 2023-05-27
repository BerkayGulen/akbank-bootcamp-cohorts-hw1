package model;

public class House extends Residence {
    public House(double price, double area, int roomCount, int loungeCount) {
        super(price, area, roomCount, loungeCount);
    }

    @Override
    public String toString() {
        return "House{" +
                "price=" + getPrice() +
                ", area=" + getArea() +
                ", roomCount=" + getRoomCount() +
                ", loungeCount=" + getLoungeCount() +
                '}';
    }
}
