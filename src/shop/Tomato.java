package shop;

public class Tomato {

    private static final int PRICE = 5;
    private String color;
    private double weight;


    public Tomato(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public int getPRICE() {
        return PRICE;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }
}
