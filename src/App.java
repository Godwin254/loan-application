import drivers.Loanee;
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

        //variables
        String fname;
        String lname;
        int idNo;
        String phoneNo;
        double salary;
        Loanee person = new Loanee(3000);

        person.setFirstName("John");
        String name = person.getFirstName();
        System.out.println(name);


        try {
            //welcome text//
            App.display();
            //int user_input = sc.nextInt();

            while(sc.hasNext()){

                int user_input = sc.nextInt();

                if (user_input == 1){
                    //code for registration

                    App.display1("New User");

                    //grab user input
                    System.out.println("*********************\n");
                    System.out.println("Enter First name:\n");
                    fname = sc.next();
                    System.out.println("Enter Last name:\n");
                    lname = sc.next();
                    System.out.println("Enter ID No. name:\n");
                    idNo = sc.nextInt();
                    System.out.println("Enter phoneNo. name:\n");
                    phoneNo = sc.next();

                    //set user inputs
                    person.setFirstName(fname);
                    person.setLastName(lname);
                    person.setIdNo(idNo);
                    person.setLastName(phoneNo);


                }else if(user_input == 2){
                    //code for login

                    App.display1("Login");
                    System.out.println("*********************");
                    App.displayLoans();

                }else if (user_input == 3){
                    //code to exit
                    System.out.println("Thank you for using the App");
                    break;
                } else{
                    //code for incorrect input option
                    System.out.println("Enter correct choice\n");
                    App.display();
                    sc.nextInt();
                }


            }

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

    public static void display1(String val){
        System.out.println("******** WELCOME TO TAP-LOAN-APP ********\n" +
                "*** Registration - "+val+" ***\n");
    }

    static void displayLoans(){
        System.out.println("Select loan package e.g 1,2");
        System.out.printf("%s%20s%20s%20s%n","Package", "Loan Amount", "Interest", "Duration");
        System.out.printf("%d.%s%15d%22.2f%20.2f%n", 1, "Silver", 10000, 16.2, 1.0);
        System.out.printf("%d.%s%20d%20.2f%20.2f%n", 2, "Bronze", 30000, 12.6, 0.7);
        System.out.printf("%d.%s%20d%20.2f%20.2f%n", 3, "Gold", 100000, 6.6, 0.4);

    }


}
