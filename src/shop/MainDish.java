package shop;

public class MainDish {

    private Dish dish;
    private int calories;
    private final int PRICE = 40;

    enum Dish {Eggs, Toast, PotatoPancake}

    public MainDish(Dish dish, int calories) {
        this.dish = dish;
        this.calories = calories;
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
