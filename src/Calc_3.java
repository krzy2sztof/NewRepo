import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc_3 extends Patterns {
    public static void main(String[] args) {

        Patterns x = new Patterns();
        Scanner scanner = new Scanner(System.in);

        double a, b;
        int c;

        while (true) {
            try {
                System.out.println("enter first value");
                a = scanner.nextDouble();
                System.out.println("enter second value");
                b = scanner.nextDouble();
                System.out.println("1-add\n2-substract\n3-multiply\n4-divide\n5-exit");
                c = scanner.nextInt();
                if(c<1||c>5){
                    System.out.println("choose digit between 1-5");
                }

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
                        if(b!=0){
                            System.out.print(a + " / " + b + " = ");
                            x.divide(a, b);}
                    else {
                            System.out.println("You go to jail");
                    }
                    }
                    case 5 -> {
                        System.exit(007);
                        scanner.close();
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("This is not a number!");
                scanner.next();
            }
        }


    }
}
