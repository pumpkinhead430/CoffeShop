package shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop();
        System.out.println("how many people are dining?");
        Scanner sc= new Scanner(System.in);
        int people = sc.nextInt();
        ArrayList<Integer> tableIds = coffeeShop.assignToTable(people);
        ArrayList<Breakfast> breakfasts = new ArrayList<>();
        for(int id :  tableIds){
            Table table = coffeeShop.findTable(id);
            for(int i = 0; i < table.getPeople(); i++){
                Breakfast currentBreakfast = getBreakfast(sc);
                breakfasts.add(currentBreakfast);
            }
            coffeeShop.takeOrders(table.getId(), breakfasts,  getSalad(sc, table.getPeople()));
            breakfasts.clear();
        }

        System.out.println(coffeeShop.getProfit());

        CoffeeShop cafeOfDoom = new CoffeeShop();

        System.out.print(  cafeOfDoom.assignToTable(9));


    }
     public static Breakfast getBreakfast(Scanner sc){
         MainDish dish = getDish(sc);
        Drink drink = getDrink(sc);
        return new Breakfast(dish, drink);
    }

     public static Drink getDrink(Scanner sc){
        System.out.println("enter your drink name: ");
        String drinkName = sc.next();
        System.out.println("do you want your drink hot or not?");
        boolean hot = sc.nextBoolean();
        System.out.println("what is the size of your drink: ");
        String size = sc.next();
        return new Drink(Drink.Size.valueOf(size), hot, Drink.DrinkName.valueOf(drinkName));
    }
    public static MainDish getDish(Scanner sc){
        System.out.println("what dish do you want?");
        String dishName = sc.next();
        return new MainDish(MainDish.Dish.valueOf(dishName));
    }
    public static Salad getSalad(Scanner sc, int people){
        System.out.println("do you want a salad?");
        if(sc.nextBoolean())
            return new Salad(people);
        return null;
    }
}
