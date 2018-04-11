package employees;

public class CommissionedEmployee extends Employee{

        private double grossSales;
        private double commissionRate;



    public CommissionedEmployee(String firstName, String lastName,
                String socialSecurityNumber, HireDate hireDate, double grossSales, double commissionRate){
            super(firstName, lastName, socialSecurityNumber, hireDate);
            this.grossSales = grossSales;
            this.commissionRate = commissionRate;
        }


        public double earnings(){

            return grossSales * (commissionRate/100);

    }

        @Override
        public String toString() {
            return "CommisionedEmployee{" +
                    "grossSales=" + grossSales +
                    ", commissionRate=" + commissionRate +
                    '}';
        }

    public double getPaymentAmount() {
        return this.getGrossSales();
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
}
