import core.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.LaptopFactory;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class EmployeeTest
{

    Company testVagrant;
    Employee karthik,vinay;

    @BeforeTest
    public void setup() {
        testVagrant = new Company("TestVagrant","IndiraNagar,Bangalore");
        karthik = new Employee("1","Karthik",Designation.SDET,Department.IT);
        vinay = new Employee("2","Vinay",Designation.QA,Department.IT);
    }


    @Test
    public void shouldCreateAndDisplayEmployee()
    {

        //Adding the employee in to list
        testVagrant.addEmployee(karthik);
        testVagrant.addEmployee(vinay);

        //Displaying All Employees
        testVagrant.displayAllEmployees();

        //Display a Particular Employee
        testVagrant.displayEmployee(vinay);

        //Testing the Employee Details
        assertEquals(karthik.getEmpId(), "1");
        assertEquals(karthik.getEmpName(), "Karthik");
        assertEquals(karthik.getDesignation(), Designation.SDET);

        assertEquals(vinay.getEmpId(), "2");
        assertEquals(vinay.getEmpName(), "Vinay");
        assertEquals(vinay.getDesignation(), Designation.QA);

    }


    @Test
    public void IssueLaptopToEmployee() {

        //Find the number of employees present in the company
        LaptopFactory factory = new LaptopFactory(2);
        List<Laptop> ITLaptops = factory.getITLaptops();

        testVagrant.issueLaptop(karthik,ITLaptops.get(0));
        testVagrant.issueLaptop(vinay,ITLaptops.get(1));

        testVagrant.showEmpLaptop(karthik);



    }

}
