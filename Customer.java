package OopWithTim;

public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("This has all arguments");
    }

    public Customer(){
        this("JOHN DOE", "johndoe@email.com");
        System.out.println("No args");
    }

    public Customer(String name, String email){
        this(name, 1000.00D, email);
        System.out.println("2 args");
    }
    public void customerInfo(){
        System.out.println(
                "CUSTOMER NAME: " + getName() + " "+
                        "CUSTOMER EMAIL: " + getEmail() + "\n"+
                        "YOUR CREDIT LIMIT IS: " + getCreditLimit()
        );
    }
}
