import drivers.Loan;
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
        String fname, lname, phoneNo, password;
        int idNo;
        double salary, amountToPay;
        Boolean isLogin = false;
        Loanee person = new Loanee();
        Loan ln = new Loan();

        double amountToBorrow;


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
                    System.out.println("Enter ID No. :\n");
                    idNo = sc.nextInt();
                    System.out.println("Enter phoneNo. :\n");
                    phoneNo = sc.next();
                    System.out.println("Enter password :\n");
                    password = sc.next();


                    //set user inputs
                    person.setFirstName(fname);
                    person.setLastName(lname);
                    person.setIdNo(idNo);
                    person.setLastName(phoneNo);
                    person.setCode(password);

                    System.out.println("Saved successfully!\n");

                    //prompt user to login after registration
                    App.display1("Login");

                    //grab user login inputs
                    System.out.println("Enter ID No. :\n");
                    idNo = sc.nextInt();
                    System.out.println("Enter password :\n");
                    password = sc.next();

                    System.out.println("Processing..\n");
                    System.out.println("100%.. done!\n");

                    //validate login credentials
                    if (idNo == person.getIdNo() && password.equals(person.getCode())){
                        System.out.println("Successful login..\n");
                        App.displayOpt();

                        user_input = sc.nextInt();

                        if (user_input == 1){
                            //borrow loan
                            System.out.println("How much would like to borrow? \n");
                            amountToBorrow = sc.nextDouble();
                            System.out.println("How much is your monthly salary? \n");
                            salary = sc.nextDouble();

                            //set loan request details
                            ln.setLoanAmount(amountToBorrow);
                            person.setSalary(salary);


                        }else if (user_input == 2 ){
                            //check balance
                            System.out.println(person.getLoanBalance());

                        }else if (user_input == 3){
                            //pay loan
                            System.out.println("Enter amount to pay back");
                            amountToPay = sc.nextDouble();
                            ln.setPaidAmount(amountToPay);

                            System.out.println("You have successfully paid: " + person.getPaidAmount());
                            System.out.println("Outstanding loan balance: " + person.getLoanBalance());


                        }else{
                            //exit
                            App.display1("New User");

                        }

                    }else{
                        System.out.println("Incorrect details!\n");
                        //prompt user to login after registration
                        App.display1("Login");
                    }


                }else if(user_input == 2){
                    //code for login

                    App.display1("Login");
                    System.out.println("*********************");

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
                "*** Registration - "+val+" ***\n" +
                "1.Save and exit\n");
    }

    static void displayOpt(){
        System.out.println("What would you like to do?\n" +
                            "1. Borrow Loan\n" +
                            "2. Check loan balance\n" +
                            "3. Clear outstanding loan\n" +
                            "4. Exit\n");

    }

    static void registerPsn(){

    }


}
