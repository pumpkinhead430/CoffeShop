package shop;

public class MainDish {

    private Dish dish;
    private int calories;
    private final int PRICE = 40;

    enum Dish {Eggs, Toast, PotatoPancake}

    public MainDish(Dish dish) {
        this.dish = dish;
        switch (dish){
            case Eggs -> this.calories = 320;
            case Toast -> this.calories = 400;
            case PotatoPancake -> this.calories = 1000;
        }
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getPRICE() {
        return PRICE;
    }
}
