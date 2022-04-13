package FightingMiniGame;

public class Main {
    public static void main(String[] args) {
        Fighter lew=new Fighter("Lew",10,2);
        Fighter harry=new Fighter("Harry",5,4);
        Fighter harald=new Fighter("Harald",20,5);
        Fighter jerry=new Fighter("Jerry",30,3);


        System.out.println(Kata.declareWinner(lew,harry,"lew"));
        System.out.println(Kata.declareWinner(lew,harry,"harry"));
        System.out.println(Kata.declareWinner(harald,harry,"harry"));
        System.out.println(Kata.declareWinner(harald,harry,"harald"));
        System.out.println(Kata.declareWinner(jerry,harald,"jerry"));
        System.out.println(Kata.declareWinner(jerry,harald,"harald"));


    }
}
