package labtwo;

public class Main {
    public static void main(String[] args) {

       Employee employeeOne = new BasePlusCommissionEmployee("claude","mcalpin", "111-22-3333", 300, 10.00, 800  );
       Employee employeeTwo = new CommissionedEmployee("zamir","lewis", "222-33-4444", 1000,10.00);
       Employee employeeThree = new HourlyEmployee("dwayne", "rose", "333-44-5555",20,56);
       Employee employeeFour = new SalariedEmployee("firstName", "lastName", "444-55-6666",1200);

       Invoice carParts = new Invoice("1234", "alternator", 4, 99.99);


       Employee[] myStaff = new Employee[]{employeeOne, employeeTwo, employeeThree, employeeFour};

       for(Employee staffMember : myStaff){
           System.out.println( staffMember.toString() + "\n" + "Total earnings: " + staffMember.earnings() + "\n" + "Total amount of sales: "  + staffMember.getPaymentAmount());


       }
        System.out.println(  "\n" + "HR owes: " + carParts.getPaymentAmount());






    }
}
