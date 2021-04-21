package employee;
public class PartTimeEmployee extends Employee{
    double wage;
    int hours;

    public PartTimeEmployee(double wage, int hours, String name, String department, int yearOfBirth) {
        super(name, department, yearOfBirth);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public int getHours() {
        return hours;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    
    public double getTotalWage(){
        return wage;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" + "wage=" + wage + ", hours=" + hours + '}';
    }
    
    
}
