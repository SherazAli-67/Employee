package employee;
import java.util.ArrayList;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class TestEmployee {
        static int empCounter=0;
        static int fEmpCounter=0;
        static int pEmpCounter=0;
        static int cEmpCounter=0;
        static int bEmpCounter=0;
    private void readFile() throws IOException{
        BufferedReader bufReader = null; 
        ArrayList<String> listOfLines = new ArrayList<>();
            try {
                bufReader = new BufferedReader(new FileReader("readme.txt"));
                
                String line = bufReader.readLine();
                while (line != null) {
                    listOfLines.add(line);
                    line = bufReader.readLine();
                }       bufReader.close();
            } catch (FileNotFoundException ex) {
                System.out.println("Error: "+ex.getMessage());
            } 
            
            for(int i=0;i<listOfLines.size();i++){
                System.out.println(listOfLines.get(i));
            }
    }
    private void printMonthlySalary(ArrayList<FullTimeEmployee> fArrayList){
        for(FullTimeEmployee emp: fArrayList){
            System.out.println(emp.getName()+": "+emp.getMonthlySalary());
        }
    }
    private  void printTotalWage(ArrayList<PartTimeEmployee> pArrayList) {
        for(PartTimeEmployee emp: pArrayList){
            System.out.println(emp.getName()+": "+emp.getTotalWage());
        }
    }

    private  void printCommissionAmount(ArrayList<CommissionEmployee> cArrayList) {
        for(CommissionEmployee emp: cArrayList){
            System.out.println(emp.getName()+": "+emp.getCommissionAmount());
        }
    }

    private  void printTotalAmount(ArrayList<BasePlusCommissionEmployee> bArrayList) {
        for(BasePlusCommissionEmployee emp: bArrayList){
            System.out.println(emp.getName()+": "+emp.getTotalAmount());
        }
    }
    public void printEmployees(ArrayList<Employee> employees){
        for(Employee e: employees){
            System.out.println(e.toString());
        }
    }
    
    public void counters(){
        
        
        System.out.println("Employee Instances: "+empCounter);
        System.out.println("FullTimeEmployee Instances: "+fEmpCounter);
        System.out.println("PartTimeEmployee Instances: "+pEmpCounter);
        System.out.println("CommissionEmployee Instances: "+cEmpCounter);
        System.out.println("BasePlusCommissionEmployee Instances: "+bEmpCounter );
    }
    
    public static void main(String []args) throws IOException{
        ArrayList<PartTimeEmployee> pArrayList = new ArrayList<>();
        ArrayList<CommissionEmployee> cArrayList = new ArrayList<>();
        ArrayList<BasePlusCommissionEmployee> bArrayList = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<FullTimeEmployee> fArrayList = new ArrayList<>();
        
        TestEmployee testEmp = new TestEmployee();
        
        
        Employee emp1 = new Employee("Salim Ahmed", "IT", 1990);
        FullTimeEmployee fEmp = new FullTimeEmployee("Ali Ramiz", "Finance", 1980, 240000, 2023);
        PartTimeEmployee pEmp = new PartTimeEmployee(200, 40, "Rami Kamal", "Finance", 1989);
        CommissionEmployee cEmp =  new CommissionEmployee(100000, 0.08, "John Li", "Sales", 1995);
        BasePlusCommissionEmployee bEmp = new BasePlusCommissionEmployee(5000, 90000, 0.05, "Fadi Bassam", "Sales", 1990);
        Employee emp2 = new Employee("Dimas Ahmed", "Technical", 1995);
        FullTimeEmployee fEmp1 = new FullTimeEmployee("George Tom", "Management", 1980, 1200000, 2025);
        FullTimeEmployee fEmp2 = new FullTimeEmployee("Kim Yu", "Technical", 1995, 60000, 2025);
        FullTimeEmployee fEmp3 = new FullTimeEmployee("Omar Ramiz", "IT", 1980, 280000, 2023);
        PartTimeEmployee pEmp1 = new PartTimeEmployee(250, 80, "Rami Hassan", "IT", 1989);
        CommissionEmployee cEmp1 =  new CommissionEmployee(1000000, 0.09, "Jet Li", "Sales", 1985);
        BasePlusCommissionEmployee bEmp1 = new BasePlusCommissionEmployee(4000, 10000, 0.06, "Ahmed Bassam", "Sales", 1995);
        
        employees.add(emp1);
        employees.add(emp2);
        employees.add(fEmp);
        employees.add(fEmp1);
        employees.add(fEmp2);
        employees.add(fEmp3);
        employees.add(pEmp);
        employees.add(pEmp1);
        employees.add(cEmp);
        employees.add(cEmp1);
        employees.add(bEmp);
        employees.add(bEmp1);
        
        fArrayList.add(fEmp);
        fArrayList.add(fEmp1);
        fArrayList.add(fEmp2);
        fArrayList.add(fEmp3);
        
        pArrayList.add(pEmp);
        pArrayList.add(pEmp1);
        
        cArrayList.add(cEmp);
        cArrayList.add(cEmp1);
        
        bArrayList.add(bEmp);
        bArrayList.add(bEmp1);
        
        fEmpCounter = fArrayList.size();
        bEmpCounter = bArrayList.size();
        cEmpCounter = cArrayList.size();
        pEmpCounter = pArrayList.size();
        empCounter = employees.size() - (fEmpCounter+bEmpCounter+cEmpCounter+pEmpCounter);
       
        
                //testEmp.printEmployees(employees);
        testEmp.counters();
        
        System.out.println("Monthly  Salary of  Each Full Time  Employee");
        testEmp.printMonthlySalary(fArrayList);
        System.out.println();
        
        System.out.println("Total Wage Of Employees");
        testEmp.printTotalWage(pArrayList);
        System.out.println();
        
        System.out.println("Employees with their commission Amount");
        testEmp.printCommissionAmount(cArrayList);
        
        System.out.println();
        
        System.out.println("Total Amount For Each BasePlusCommission Employee");
        testEmp.printTotalAmount(bArrayList);  
        System.out.println();
        testEmp.readFile();
    }
}
