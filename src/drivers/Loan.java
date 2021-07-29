package drivers;

public class Loan implements Loans {
    String loanName = "loan A";
    double duration = 1.2;
    double interest = 12.0; //interest in percentage

    public Loan(){

    }

    @Override
    public String getName() {
        return loanName;
    }

    @Override
    public double getDuration() {
        return duration;
    }

    @Override
    public double getInterest(){
        return interest;
    }

}
