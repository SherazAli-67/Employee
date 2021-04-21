package employee;
public class FullTimeEmployee extends Employee{
    double annualSalary;
    int yearOfContractExp;

    public FullTimeEmployee( String name, String department, int yearOfBirth,double annualSalary, int yearOfContractExp) {
        super(name, department, yearOfBirth);
        this.annualSalary = annualSalary;
        this.yearOfContractExp = yearOfContractExp;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public int getYearOfContractExp() {
        return yearOfContractExp;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void setYearOfContractExp(int yearOfContractExp) {
        this.yearOfContractExp = yearOfContractExp;
    }
    
    public double getMonthlySalary(){
        return annualSalary/12;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" + "annualSalary=" + annualSalary + ", yearOfContractExp=" + yearOfContractExp + '}';
    }
    
    
}
