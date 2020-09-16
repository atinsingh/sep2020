public class SimpleIntrestCalculator {
    //main method
    public static void main(String[] args) {

        // int, double //  class == User Designed Type  & Complex Type
        String batchName = "Samson";
        int a = 20;
       // double interest = calculateSimpleInterest(200000, 1.98f, 3);
        calculateSimpleInterest(200000, 1.98f, 3);
        sum(2,3) ;
        //System.out.println(a);
        greeting();
    }

    // access modifier or specifiers
    // java is considered strong type language
    public static double calculateSimpleInterest(double amount, float roi, int time) {
       return  ( amount * roi * time) / 100;
    }

    public static int sum(int a, int b) {
        return a+b;
    }

    /*
        enhance this to print greeting in different lang code, langcode will passed
        as 2 char string example "EN" = English, "HI" = Hindi, "TM" = Tamil
        ES ="Spaniel"
        method should recieve name of person to greeting
     */
    public static void greeting(String name, String langCode) {
        switch (langCode) {
            case "EN" :
                System.out.println("Hello, How are you " + name);
                break;
            case "ES" :
                System.out.println("Hola,  " + name);
                break;
            case "HI" :
                System.out.println("Namaste,  " + name);
                break;
            case "TM" :
                System.out.println("Vadekam,  " + name);
                break;
            default:
                System.out.println("Invalid lang code");
        }
    }

    // write a method to sum two int values,
    // write a method to multiply 3 double values;
}

