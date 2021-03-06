package employees;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, HireDate hireDate, double wage, double hours){
        super(firstName, lastName, socialSecurityNumber, hireDate);
        this.hours = hours;
        this.wage = wage;
    }



    public double earnings(){
        return this.wage * this.hours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "wage=" + wage +
                ", hours=" + hours +
                '}';
    }

    public double getPaymentAmount() {
        return earnings();
    }
}
