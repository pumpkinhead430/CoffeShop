package shop;

public class Breakfast {

    private MainDish dish;
    private Drink drink;

    public Breakfast(MainDish dish, Drink drink) {
        this.dish = dish;
        this.drink = drink;
    }

    public MainDish getDish() {
        return dish;
    }

    public void setDish(MainDish dish) {
        this.dish = dish;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public int CalculatePrice(boolean salad) {
        if (salad)
            return dish.getPRICE() - 2 + drink.getPrice();

        return dish.getPRICE() + drink.getPrice();
    }
}
