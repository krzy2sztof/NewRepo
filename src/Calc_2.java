import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double a = 0, b = 0;
        int c=0;



                while (true) {
                    try {
                    System.out.println("enter first value ");
                    a = scan.nextDouble();

                    System.out.println("enter digit: \n1-add\n2-substract\n3-multiply\n4-divide\n5-exit");

                    c = scan.nextInt();
                    if (c < 1 || c > 5) {
                        System.out.println("invalid input, choose 1, 2, 3, 4 or 5");
                        continue;
                    } else if (c == 5) {
                        scan.close();
                        System.exit(007);
                    }

                    System.out.println("enter second value ");
                    b = scan.nextDouble();


                    switch (c) {
                        case 1 -> System.out.println(a + " + " + b + " = " + (a + b));
                        case 2 -> System.out.println(a + " - " + b + " = " + (a - b));
                        case 3 -> System.out.println(a + " * " + b + " = " + (a * b));
                        case 4 -> {
                            if (b != 0) {
                                System.out.println(a + " / " + b + " = " + (a / b));
                            } else {
                                System.out.println("can't divide by zero!");
                            }
                        }
                    }
                    } catch (InputMismatchException e){
                        System.out.println("This is not a number !");
                        scan.next();


                }


        }
    }
    }

