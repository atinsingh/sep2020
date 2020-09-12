import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int choice = -1;
        int num1 =0, num2=0;
        Scanner scanner = new Scanner(System.in);

        while (choice!=0) {
            System.out.println("*******MENU*******");
            System.out.println("1  - Addition");
            System.out.println("2  - Substraction");
            System.out.println("3  - Multiplication");
            System.out.println("4  - Modulus");
            System.out.println();
            System.out.println("0  - EXIT");

            choice  = scanner.nextInt();
            if(choice!=0) {
                System.out.println("Key in the Number 1");
                num1 = scanner.nextInt();
                System.out.println("Key in the Number 2");
                num2 = scanner.nextInt();
            }

            switch (choice) {
                case 0: {
                  break;
                }
                case  1 : {
                    System.out.println("Sum  is " + (num1+num2) );
                }break;
                case 2: {
                    System.out.println("Substraction  is " + (num1-num2) );
                }break;
                case 3: {
                    System.out.println("Multiplication  is " + (num1*num2) );
                }break;
                case 4: {
                    System.out.println("Modulus  is " + (num1%num2) );
                }break;
                default:{
                    System.out.println("PLEASE KEY IN THE VALID CHOICE");
                }
            }

        }

    }
}
