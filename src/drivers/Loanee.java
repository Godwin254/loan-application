package drivers;

public class Loanee extends Person{

    private double salary;
    Loan ln = new Loan();
    //constructor
    public Loanee(){
        super();
    }
    public Loanee(double salary){
        super();
        this.salary = salary;
    }

    public void setSalary(double salary){
        if (salary <= 0.0 ){
            throw new IllegalArgumentException("Salary cannot be less than zero");
        }
        this.salary = salary;
    }

    //borrow loan method
    public void borrowLoan(double amount){
        ln.setLoanAmount(amount);
    }

    //set client salary
    public double getSalary(){
        return salary;
    }

    //get outstanding loan amount
    public double getLoanBalance(){
        return ln.getLoanAmount();
    }

    public double getPaidAmount(){
        return ln.getPaidAmount();
    }
}
