import java.util.Scanner;

public class Calc_1 {
    public static void main(String[] args) {

        double a, b;
        Scanner scan = new Scanner(System.in);
        int x;

        while(true){
            System.out.println("set a");
            a = scan.nextDouble();
            System.out.println("set b");
            b = scan.nextDouble();
            System.out.println("select option \n1-add \n2-substract \n3-multiply "
                                     + "\n4-divide\n5-exit");
            x = scan.nextInt();
            if (x < 1 || x > 5) {
                System.out.println("choose number from range 1-5 \n");
            }

            switch (x) {
                case 1 -> {
                    System.out.println();
                    System.out.println(a + b);
                }
                case 2 -> {
                    System.out.println();
                    System.out.println(a - b);
                }
                case 3 -> {
                    System.out.println();
                    System.out.println(a * b);
                }
                case 4 -> {
                    if (b != 0) {
                        System.out.println();
                        System.out.println(a / b);
                    } else {
                        System.out.println("you cannot divide by zero!");
                    }
                }

                case 5 -> {

                    System.out.println("\nquitting...");
                    scan.close();
                    System.exit(007);
                }
            }
        }


    }


}