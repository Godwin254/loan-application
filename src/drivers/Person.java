package drivers;

/*
* Encapsulation
* Inheritance
* Abstraction
* Polymorphism
* Overloading & overriding
* */
public class Person {

    //fields
    private String firstName;
    private String lastName;
    private int idNo;
    private int phoneNo;
    private String code;
    private int COUNT = 0;
    Loan ln;

    //constructor
    public Person(){

    }
    public Person(String firstName, int phoneNo) throws IllegalArgumentException{
        //validate name entries
        validName(firstName);
        this.firstName = firstName;
        this.phoneNo = phoneNo;
        COUNT++;
    }

    public Person(String firstName, String lastName,int phoneNo, int idNo) throws IllegalArgumentException{

        //validate name entries
        validName(firstName,lastName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
        this.idNo = idNo;
        COUNT++;
    }

    public Person(String firstName, String lastName, int idNo) throws IllegalArgumentException{
        //validate name entries
        validName(firstName,lastName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNo = idNo;
        COUNT++;
    }

    public Person(String firstName, String lastName, int idNo, String code) throws IllegalArgumentException{

        //validate name entries
        validName(firstName,lastName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNo = idNo;
        this.code = code;
        COUNT++;
    }

    //getters and setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        //validate name entries
        validName(firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        //validate name entries
        validName(firstName);
        this.lastName = lastName;
    }

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCOUNT(){
        return COUNT;
    }


    //validators

    public void validName(String fname)throws IllegalArgumentException{
        if (fname.length() < 3 ){
            throw new IllegalArgumentException("Name should have 3 letters and above");
        }
    }

    public void validName(String fname, String lname)throws IllegalArgumentException{
        if (fname.length() < 3 || lname.length() < 3){
            throw new IllegalArgumentException("Name should have 3 letters and above");
        }
    }

}
