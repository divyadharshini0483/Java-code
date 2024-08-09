import java.util.ArrayList;
import java.util.List;
public class Employee {
    private int empId;
    private String empName;
    private String empAddress;
    private String empDesignation;
    private String empDepartment;
    private String empPhoneNo;
    private double empBasicPay;
    private double empHRA;
    private double empDA;
    private double empTA;
    private double empSalary;
    public Employee(int empId, String empName, String empAddress, String empDesignation,
                    String empDepartment, String empPhoneNo, double empBasicPay) {
        this.empId = empId;
        this.empName = empName;
        this.empAddress = empAddress;
        this.empDesignation = empDesignation;
        this.empDepartment = empDepartment;
        this.empPhoneNo = empPhoneNo;
        this.empBasicPay = empBasicPay;
        this.empHRA = 0.10 * empBasicPay;
        this.empDA = 0.02 * empBasicPay;  
        this.empTA = 0.02 * empBasicPay;  
        this.empSalary = empBasicPay + empHRA + empDA + empTA;
    }
    public int getEmpId() {
        return empId;
    }
    public String getEmpName() {
        return empName;
    }
    public String getEmpDepartment() {
        return empDepartment;
    }
    public double getEmpSalary() {
        return empSalary;
    }
    public void displayEmployeeDetails() {
        System.out.println("Emp ID: " + empId);
        System.out.println("Emp Name: " + empName);
        System.out.println("Emp Address: " + empAddress);
        System.out.println("Emp Designation: " + empDesignation);
        System.out.println("Emp Department: " + empDepartment);
        System.out.println("Emp Phone No: " + empPhoneNo);
        System.out.println("Emp Basic Pay: " + empBasicPay);
        System.out.println("Emp HRA: " + empHRA);
        System.out.println("Emp DA: " + empDA);
        System.out.println("Emp TA: " + empTA);
        System.out.println("Emp Salary: " + empSalary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John Doe", "123 Main St", "Manager", "Sales", "1234567890", 50000));
        employees.add(new Employee(2, "Jane Smith", "456 Elm St", "Developer", "IT", "0987654321", 60000));
        employees.add(new Employee(3, "Emily Davis", "789 Maple St", "Analyst", "Finance", "5556667777", 55000));
        employees.add(new Employee(4, "Michael Brown", "321 Oak St", "Manager", "IT", "4445556666", 70000));
        employees.add(new Employee(5, "Sarah Wilson", "654 Pine St", "Clerk", "Sales", "3334445555", 30000));
        findHighestPaidEmployeeByDepartment(employees);
    }
    public static void findHighestPaidEmployeeByDepartment(List<Employee> employees) {
        java.util.Map<String, Employee> highestPaidMap = new java.util.HashMap<>();

        for (Employee emp : employees) {
            String dept = emp.getEmpDepartment();
            if (!highestPaidMap.containsKey(dept) || emp.getEmpSalary() > highestPaidMap.get(dept).getEmpSalary()) {
                highestPaidMap.put(dept, emp);
            }
        }
        System.out.println("Highest Paid Employee in Each Department:");
        for (Employee emp : highestPaidMap.values()) {
            emp.displayEmployeeDetails();
            System.out.println("-------------------------------------------------");
        }
    }
}
