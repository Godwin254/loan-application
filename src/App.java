import drivers.Person;
import java.util.Scanner;

/*
* Author @Brown
*
* **** Main App @Tap_money_app****
*
* */
public class App {

    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        try {
            //welcome text//
            App.display();

            /*********************************************************/
            Person psn1 = new Person("John",0705507460);
            Person psn2 = new Person("John", "Doe",070553360);
            Person psn3 = new Person("John", "Doe",0705247360,12344);

            psn2.getCOUNT();
            //grab user input
            int input = sc.nextInt();

            while(input != 3){
                
            }
            System.out.println(psn1.getCOUNT());

        }catch (Exception e){
            System.err.println(e.getMessage());
        }finally {
            sc.close();
        }
    }

    //methods
    public static void display(){
        System.out.println("******** WELCOME TO TAP-LOAN-APP ********\n" +
                "*** Your money lending partner. ***\n" +
                "Registration. - (select appropriate choice e.g 1,2)\n" +
                 "1. New user, Sign up\n" +
                 "2. Already registered, Login\n" +
                 "3. Exit app\n");
    }


}
