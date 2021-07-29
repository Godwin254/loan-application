package drivers;

import db.Database;

public class Loan implements Loans {
    String loanName = "loan A";
    double duration = 8;
    double interest = 6.0; //interest in percentage
    double loanAmount;
    double paidAmount;
    Database db;

    Loanee loan;

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

    //set loan amount borrowed by user
    public void setLoanAmount(double loanAmount){
        if (loanAmount < 1000 && loanAmount > 100000){
            throw new IllegalArgumentException("You can borrow only amounts above 1000 and amounts less than 100000");

        }

        this.loanAmount = loanAmount;
    }

    //amount paid by client
    public void setPaidAmount(double amount){
        this.paidAmount = amount;
    }

    public double getPaidAmount(){
        return paidAmount;
    }

    public double getLoanAmount(){
        return loanAmount - paidAmount;
    }

    public double getGivenLoan(){

        return loanAmount - ((interest/100) * loanAmount);
    }


}
