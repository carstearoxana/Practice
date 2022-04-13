package Calculator;

public class Main {
    public static void main(String[] args) {
        Evaluator evaluator = new Evaluator();
        String s = "2 + 2 * 3 * 2 / 3 - 6 * 2";
        int c = 2 + 2 * 3 * 2 / 3 - 6 * 2;
        System.out.println(evaluator.evaluate(s));
//        System.out.println(c);


//        String s="2 * 3";
//        int c=2 + 2;

//        String[] x = s.split(" ");
//        int r = Integer.parseInt(x[0]);
//        int i = 1;
//        while ((i + 1) < x.length) {
//            if (x[i].equals("*")) {
//                r = r * Integer.parseInt(x[i + 1]);
//            } else if (x[i].equals("/")) {
//                r = r / Integer.parseInt(x[i + 1]);
//
//            } else if (x[i].equals("+")) {
//                if (expression(x,i)) {
//                    r = r + Integer.parseInt(x[i + 1]);
//                } else {
//                    Variables returnPi=something(x,i);
//                    r=r+returnPi.getP();
//                    i=returnPi.getI();
//                }
//            }else if (x[i].equals("-")) {
//                if (expression(x,i)) {
//                    r = r - Integer.parseInt(x[i + 1]);
//                } else {
//                    Variables returnPi=something(x,i);
//                    r=r-returnPi.getP();
//                    i=returnPi.getI();
//                }
//            }
//            i+=2;
//        }
//        System.out.println("rezultatul este: "+r);
//        System.out.println("corect este: "+c);
//    }
//
//    public static boolean expression(String[] x, int i){
//        if(i+2==x.length||x[i + 2].equals("+") || x[i + 2].equals("-")){
//            return true;
//        }
//        return false;
//    }
//
//    public static Variables something(String[] x, int i){
//        int p = Integer.parseInt(x[i + 1]);
//        while ((i + 2) < x.length && (!x[i + 2].equals("+") && !x[i + 2].equals("-"))) {
//            if (x[i + 2].equals("*")) {
//                p = p * Integer.parseInt(x[i + 3]);
//            } else if (x[i + 2].equals("/")) {
//                p = p / Integer.parseInt(x[i + 3]);
//            }
//            i+=2;
//        }
//        return new Variables(i,p);
//    }
//}
//    final class Variables{
//     private int i;
//     private int p;
//     public Variables(int i, int p) {
//            this.i = i;
//            this.p = p;
//        }
//        public int getI() {
//           return i;
//        }
//        public int getP() {
//            return p;
//        }
    }
}