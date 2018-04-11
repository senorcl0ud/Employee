package employees;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String SocialSecurityNumber, double weeklySalary, HireDate hireDate){
        super(firstName, lastName, SocialSecurityNumber, hireDate);
        this.weeklySalary = weeklySalary;
    }





    public double earnings(){
        return weeklySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "weeklySalary=" + weeklySalary +
                '}';
    }


    public double getWeeklySalary() {
        return weeklySalary;
    }

    public double getPaymentAmount() {
        return earnings();
    }
}
