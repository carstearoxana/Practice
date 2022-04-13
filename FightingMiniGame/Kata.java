package FightingMiniGame;

public class Kata {
    public static String declareWinner(Fighter fighter1,Fighter fighter2,String firstAttacker) {
        Fighter firstFighter,secondFighter;

        if (fighter1.name.toLowerCase().equals(firstAttacker.toLowerCase())) {
            firstFighter = fighter1;
            secondFighter = fighter2;
        } else {
            firstFighter = fighter2;
            secondFighter = fighter1;
        }
        while(true) {
            secondFighter.health = secondFighter.health - firstFighter.damagePerAttack;
            if (secondFighter.health > 0) {
                firstFighter.health = firstFighter.health - secondFighter.damagePerAttack;
                if (firstFighter.health <= 0) {
                    return secondFighter.name;
                }
            } else {
                return firstFighter.name;
            }
        }
    }
}


