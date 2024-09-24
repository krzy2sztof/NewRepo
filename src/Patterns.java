public class Patterns {

    public void add(double a, double b) {
        System.out.println(a+b);
    }


    public void substract(double a, double b) {
        System.out.println(a-b);
    }



    public void divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("do not divide by zero, it's illegal !");
        }
        System.out.println( a / b);
    }

    public void multiply(double a, double b) {
        System.out.println( a*b);}
}
