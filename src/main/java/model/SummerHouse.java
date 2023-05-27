package model;

public class SummerHouse extends Residence {
    public SummerHouse(double price, double area, int roomCount, int loungeCount) {
        super(price, area, roomCount, loungeCount);
    }

    @Override
    public String toString() {
        return "Summer House{" +
                "price=" + getPrice() +
                ", area=" + getArea() +
                ", roomCount=" + getRoomCount() +
                ", loungeCount=" + getLoungeCount() +
                '}';
    }
}
