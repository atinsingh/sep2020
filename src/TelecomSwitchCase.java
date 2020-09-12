public class TelecomSwitchCase {
    public static void main(String[] args) {

        int coutryCode = 1;

        switch (coutryCode) {
            case 1 :
            case 2 :{
                System.out.println("Dummy2");
            }
            case 3 :{
                System.out.println("Dummy3");
                break;
            }
            case 4 :{
                System.out.println("Dummy4");
            }break;
            case 5 :{
                System.out.println("Dummy5");
            }break;
            case 6 :{
                System.out.println("Dummy6");
            }break;
            default: {
                System.out.println("Nothing matched");
            }
        }

        System.out.println("I am still running");
    }
}
