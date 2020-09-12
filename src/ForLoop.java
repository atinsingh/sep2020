import java.util.Scanner;

/**
 *  For Loops allow you to run statement in loop
 *
 */
/*
    print all odd numbers between 1 to 50
 */
public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int num1, num2;
//        System.out.println("Key in Number 1");
//        num1 = sc.nextInt();
//
//        System.out.println("Key in Number 2");
//        num2 = sc.nextInt();
//
//
//        System.out.println("Here is the number you gave");
//        System.out.println(num1);
//        System.out.println(num2);
        System.out.println("Enter a double value");
        System.out.println(sc.nextDouble());
        System.out.println("Key in a string");
        str = sc.nextLine();

        System.out.println(str);
    }


}


/*
    Write a interactive program which should present following
    Menu to user

     ****************MENU****************
     Choose an option
      1 - For Addition
      2-  For Substraction
      3 - For Multiplication
      4 - For Modulus

      0  for EXIT

      if select 1 to 4
      Key in Number 1

      Key in Number 2



 */
