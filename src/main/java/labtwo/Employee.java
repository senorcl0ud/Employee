package labtwo;

public abstract class Employee implements IPayable{
    private static int count = 0;
    private String firstName;
    private String lastName;
    private final String SocialSecurityNumber;



    public Employee(String firstName, String lastName, String SocialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.SocialSecurityNumber = SocialSecurityNumber;
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


    @Override
    public String toString() {
        return "Employee{" +
                "firstName= '" + firstName + '\'' +
                ", lastName= '" + lastName + '\'' +
                '}';
    }
}
