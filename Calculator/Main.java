package Calculator;

public class Main {
    public static void main(String[] args) {
        Evaluator evaluator = new Evaluator();
        String s = "2 + 2 * 3 * 2 / 3 - 6 * 2";
        System.out.println(evaluator.evaluate(s));
    }
}
