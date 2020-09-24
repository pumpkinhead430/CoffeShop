package shop;

public class Salad {

    private Tomato tomato;
    private Lettuce lettuce;
    private int num_Of_People;


    public Salad(Tomato tomato, Lettuce lettuce, int num_Of_People) {
        this.tomato = tomato;
        this.lettuce = lettuce;
        this.num_Of_People = num_Of_People;
    }

    public int CalculatePrice(int people){
        return (lettuce.getPRICE()+tomato.getPRICE()) * num_Of_People;
    }
}
