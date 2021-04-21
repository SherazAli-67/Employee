package employee;
public class BasePlusCommissionEmployee extends CommissionEmployee{
    double baseMonthlySalary;

    public BasePlusCommissionEmployee(double baseMonthlySalary, double grossSales, double commissionRate, String name, String department, int yearOfBirth) {
        super(grossSales, commissionRate, name, department, yearOfBirth);
        this.baseMonthlySalary = baseMonthlySalary;
    }

    public double getBaseMonthlySalary() {
        return baseMonthlySalary;
    }

    public void setBaseMonthlySalary(double baseMonthlySalary) {
        this.baseMonthlySalary = baseMonthlySalary;
    }
    
    public double getTotalAmount(){
        return baseMonthlySalary*(super.getCommissionAmount())*12;
    }
}
