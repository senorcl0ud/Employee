package labtwo;

public class BasePlusCommissionEmployee extends CommissionedEmployee {
    private double salary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double grossSales, double commissionRate, double salary){
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.salary = salary;


    }

    public double earnings(){
        return  super.earnings() + salary;
    }

    public double getPaymentAmount(){
        return super.getGrossSales();
    }


    @Override
    public String toString() {
        return "BasePlusCommisonEmployee{" +
                "salary=" + salary +
                '}';
    }
}
