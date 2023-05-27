package model;

public class Villa extends Residence {
    public Villa(double price, double area, int roomCount, int loungeCount) {
        super(price, area, roomCount, loungeCount);
    }
    @Override
    public String toString() {
        return "Villa{" +
                "price=" + getPrice() +
                ", area=" + getArea() +
                ", roomCount=" + getRoomCount() +
                ", loungeCount=" + getLoungeCount() +
                '}';
    }
}
