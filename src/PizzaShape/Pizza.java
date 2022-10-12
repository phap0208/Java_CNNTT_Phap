package PizzaShape;

public class Pizza {
    private double price;
    private IShape shape;
    public Pizza(double p, IShape s) {
        this.price = p;
        this.shape = s;
    }
    public double getPrice() {
        return price;
    }
    public IShape getShape() {
        return shape;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "price=" + price +
                ", shape=" + shape +
                '}';
    }
}