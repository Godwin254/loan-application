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

                    App.display("New User");

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
                    App.display("Login");

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
                        App.displayMenu();

                        user_input = sc.nextInt();

                        if (user_input == 1){
                            //borrow loan
                            System.out.println("******************************************\n");
                            System.out.println("How much would like to borrow? \n");
                            amountToBorrow = sc.nextDouble();
                            System.out.println("How much is your monthly salary? \n");
                            salary = sc.nextDouble();

                            //set loan request details
                            ln.setLoanAmount(amountToBorrow);
                            person.setSalary(salary);

                            System.out.println("*******************************\n");
                            System.out.println("Borrowed Loan details \n");
                            System.out.printf("%20s%20s%10s%20s%20s%n","Borrowed amount", "Given Amount", "Interest(%)", "Time(month)", "Amount to pay");
                            System.out.printf("%20.2f%20.2f%20.2f%5.2f%.2f%n", person.getBorrowedLoan(), ln.getGivenLoan(), ln.getInterest(), ln.getDuration(), person.getBorrowedLoan());

                            System.out.println("Would you like to proceed? \n" +
                                                "1. Yes\n" +
                                                "2. exit\n");

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
                            App.display("New User");

                        }

                    }else{
                        System.out.println("Incorrect details!\n");
                        //prompt user to login after registration
                        App.display("Login");
                    }


                }else if(user_input == 2){
                    //code for login

                    App.display("Login");
                    System.out.println("**************************");

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

    //overloaded method
    public static void display(String val){
        System.out.println("******** WELCOME TO TAP-LOAN-APP ********\n" +
                "*** Registration - "+val+" ***\n" +
                "1.Save and exit\n");
    }

    static void displayMenu(){
        System.out.println("What would you like to do?\n" +
                            "1. Borrow Loan\n" +
                            "2. Check loan balance\n" +
                            "3. Clear outstanding loan\n" +
                            "4. Exit\n");

    }

    static void registerPsn(){

    }


}
