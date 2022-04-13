package Calculator;

public class Evaluator extends Variable {

    public int evaluate(String s) {
        String[] x = s.split(" ");
        setResult(Integer.parseInt(x[0]));
        setI(1);
        while ((getI() + 1) < x.length) {
            if (x[getI()].equals("*")) {
                setResult(getResult() * Integer.parseInt(x[getI() + 1]));
            } else if (x[getI()].equals("/")) {
                setResult(getResult() / Integer.parseInt(x[getI() + 1]));
            } else if (x[getI()].equals("+")) {
                if (expression(x, getI())) {
                    setResult(getResult() + Integer.parseInt(x[getI() + 1]));
                } else {
                    Variable variable = partialValue(x, getI());
                    setResult(getResult() + variable.getP());
                    setI(variable.getI());
                }
            } else if (x[getI()].equals("-")) {
                if (expression(x, getI())) {
                    setResult(getResult() - Integer.parseInt(x[getI() + 1]));
                } else {
                    Variable variable = partialValue(x, getI());
                    setResult(getResult() - variable.getP());
                    setI(variable.getI());
                }
            }
            setI(getI() + 2);
        }

        return getResult();
    }

    public static boolean expression(String[] x, int i) {
        if (i + 2 == x.length || x[i + 2].equals("+") || x[i + 2].equals("-")) {
            return true;
        }
        return false;
    }

    public static Variable partialValue(String[] x, int i) {
        int p = Integer.parseInt(x[i + 1]);
        while ((i + 2) < x.length && (!x[i + 2].equals("+") && !x[i + 2].equals("-"))) {
            if (x[i + 2].equals("*")) {
                p = p * Integer.parseInt(x[i + 3]);
            } else if (x[i + 2].equals("/")) {
                p = p / Integer.parseInt(x[i + 3]);
            }
            i += 2;
        }
        return new Variable(i, p);
    }
}
