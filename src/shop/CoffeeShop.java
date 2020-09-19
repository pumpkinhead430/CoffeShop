package shop;

import java.util.ArrayList;

public class CoffeeShop {
    private int profit;
    private ArrayList<Table> tables = new ArrayList<>();
    public CoffeeShop(){
        for(int i = 0; i < 30; i++){
            tables.add(new Table(i));
        }
    }



    public ArrayList<Integer> assignToTable(int people){
        ArrayList<Integer> assignedTables = new ArrayList<>();
        if(people > 6) {
            double split = (double) people / 2;
            people = (int) split;
            if (split % 1 != 0)
                split += 0.5;
            for (Table table : this.tables) {
                if (!table.isTaken()) {
                    table.assignTable((int) split);
                    assignedTables.add(table.getId());
                    break;
                }
            }
        }

        for(Table table : this.tables) {
            if (!table.isTaken()) {
                table.assignTable(people);
                assignedTables.add(table.getId());
                break;
            }
        }
        return assignedTables;
    }

    public Table findTable(int id){
        for(Table table : this.tables) {
            if (table.isItTable(id))
                return table;
        }
        return null;
    }

    public void takeOrders(int tableId, ArrayList<Breakfast> breakfasts, Salad salad){
        Table table = findTable(tableId);
       if(table != null) {
           table.takeOrders(breakfasts);
           if (salad != null)
               table.addSalad(salad);
       }
    }
    public void calculateProfit(){
        for(Table table : this.tables)
            this.profit += table.calculatePrice();
    }






}
