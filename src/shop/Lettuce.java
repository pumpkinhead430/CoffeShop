package shop;

public class Lettuce {


    private static final int PRICE = 10;
    private Type type;

    enum Type{
        Arab, Round
    }

    public Lettuce(Type type) {
        this.type = type;

    }


    public int getPRICE() {
        return PRICE;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
