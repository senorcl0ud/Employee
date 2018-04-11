package employees;

public abstract class Employee implements IPayable{
    private static int count = 0;
    private String firstName;
    private String lastName;
    private final String SocialSecurityNumber;
    private HireDate hireDate;



    public Employee(String firstName, String lastName, String SocialSecurityNumber, HireDate hireDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.SocialSecurityNumber = SocialSecurityNumber;
        this.hireDate = hireDate;
        count++;

        System.out.printf("Constructed %s %s | count=%d%n", firstName, lastName, count);

    }

    public double getPaymentAmount(){
        return 0.0;
    }




    public abstract double earnings();


    public static int getCount() {
        return count;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return SocialSecurityNumber;
    }

    public HireDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(HireDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName= '" + firstName + '\'' +
                ", lastName= '" + lastName + '\'' +
                ", hireDate= '" + hireDate + '\''  +
                '}';
    }
}
