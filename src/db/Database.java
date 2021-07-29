package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

    private double capital;
    private double givenAmounts;
    private double returnedAmounts;
    private double profits;

    public double getCapital() {
        return capital;
    }

    public double getGivenAmounts() {
        return givenAmounts;
    }

    public double getReturnedAmounts() {
        return returnedAmounts;
    }

    public double getProfits() {
        return profits;
    }

    public void setProfits(double profits){
        this.profits = profits;
    }
}
