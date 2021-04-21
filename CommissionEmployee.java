package employee;
public class CommissionEmployee extends Employee{
    double grossSales;
    double commissionRate;

    public CommissionEmployee(double grossSales, double commissionRate, String name, String department, int yearOfBirth) {
        super(name, department, yearOfBirth);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getCommissionAmount(){
        return commissionRate*grossSales;
    }
    @Override
    public String toString() {
        return "CommissionEmployee{" + "grossSales=" + grossSales + ", commissionRate=" + commissionRate + '}';
    }
    
    
}
