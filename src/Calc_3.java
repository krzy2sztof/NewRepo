import java.util.Scanner;

public class Calc_3 extends Patterns {
    public static void main(String[] args) {

        Patterns x = new Patterns();
        Scanner scanner = new Scanner(System.in);

        double a, b;
        int c;

       do {
           System.out.println("first 'double'");
           a = scanner.nextDouble();
           System.out.println("next 'double'");
           b = scanner.nextDouble();
           System.out.println("1-add\n2-substract\n3-multiply\n4-divide\n5-exit");
           c = scanner.nextInt();
           switch (c) {
               case 1 -> {
                   System.out.print(a + " + " + b + " = ");
                   x.add(a, b);
               }
               case 2 -> {
                   System.out.print(a + " - " + b + " = ");
                   x.substract(a, b);
               }
               case 3 -> {
                   System.out.print(a + " * " + b + " = ");
                   x.multiply(a, b);
               }
               case 4 -> {
                   System.out.print(a + " / " + b + " = ");
                   x.divide(a, b);
               }
               case 5 -> {
                   System.exit(0);
                   scanner.close();
               }
           }
       }while(true);





    }
}
