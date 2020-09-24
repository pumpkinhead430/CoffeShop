package shop;

public class Drink {

    private Size size;
    private boolean hot;
    private DrinkName name;

    enum DrinkName {Tea, Coffee, OrangeJuice, Cola}
    enum Size {Small, Medium, Large}

    public Drink(Size size, boolean hot, DrinkName name) {
        this.size = size;
        this.hot = hot;
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public boolean isHot() {
        return hot;
    }

    public void setHot(boolean hot) {
        this.hot = hot;
    }

    public DrinkName getName() {
        return name;
    }

    public void setName(DrinkName name) {
        this.name = name;
    }

    public int getPrice(boolean salad) {
        int price;
         switch (this.size) {
            case Small -> price = 5;
            case Medium -> price = 7;
            default -> price = 10;
        };
        if(salad)
            price--;
        return price;

    }

}
