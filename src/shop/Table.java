package shop;

import java.util.ArrayList;

public class Table {
    private int atTable;
    private int id;
    private ArrayList<Breakfast> breakfasts;
    private Salad salad;

    public Table(int id){
        this.id = id;
        this.atTable = 0;
        this.breakfasts = new ArrayList<>();
        this.salad = null;
    }

    public boolean isTaken(){
        return this.atTable > 0;
    }

    private void clearTable(){
        if(!this.breakfasts.isEmpty())
            this.breakfasts.clear();
        this.salad = null;
        this.atTable = 0;
    }

    public void assignTable(int people){
        this.atTable = people;
    }

    public void takeOrders(ArrayList<Breakfast> orders){
        breakfasts.addAll(orders);
    }

    public void addSalad(Salad salad){ this.salad = salad; }

    public int calculatePrice(){
        int sum = 0;
        boolean isSalad = salad != null;
        for(Breakfast breakfast : this.breakfasts)
            sum += breakfast.CalculatePrice(isSalad);
        if(isSalad)
            sum += this.salad.CalculatePrice(this.atTable);
        sum += ((double)12  / 100 ) * sum;
        return sum;
    }

    public int getId() {
        return id;
    }
    public boolean isItTable(int id){
        return  this.id == id;
    }
}
