package Calculator;

public class Variable {
    private int i;
    private int p;
    private int result;

    public Variable() {
    }

    public Variable(int i, int p) {
        this.i = i;
        this.p = p;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getI() {
        return i;
    }

    public int getP() {
        return p;
    }

    public int getResult() {
        return result;
    }
}
