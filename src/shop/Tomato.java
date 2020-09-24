package shop;

public class Tomato {

    private static final int PRICE = 5;
    private String color;
    private double wheight;


    public Tomato(String color, double wheight) {
        this.color = color;
        this.wheight = wheight;
    }

    public int getPRICE() {
        return PRICE;
    }

    public String getColor() {
        return color;
    }

    public double getWheight() {
        return wheight;
    }
}
