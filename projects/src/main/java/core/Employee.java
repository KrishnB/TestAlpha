package core;



public class Employee {

    String empId;
    String empName;
    Department empDepartment;
    Laptop empLaptop;
    Designation designation;

    public Employee(String id,String name, Designation desig, Department depart)
    {
        this.empId = id;
        this.empName = name;
        this.designation = desig;
        this.empDepartment = depart;
    }

    public String getEmpId() { return empId; }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Laptop getEmpLaptop()
    {
        return empLaptop;
    }

    public void setEmpLaptop(Laptop empLaptop)
    {
        this.empLaptop = empLaptop;
    }

    public Department getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(Department empDepartment) {
        this.empDepartment = empDepartment;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public String getEmployeeDetails(Employee employee)
    {
        String details = "Employee Id: "+employee.empId + "\n" +"Employee Name: "+employee.empName+ "\n"+"Employee Department: "+ employee.getEmpDepartment()+ "\n"+"Employee Designation: " + employee.getDesignation();
        return details;
     }
}
