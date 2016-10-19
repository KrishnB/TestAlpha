import core.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.LaptopFactory;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by tvserver on 19/10/16.
 */
public class EmployeeTest
{

    Company testVagrant;
    Employee karthik,vinay,employee3,employee4,employee5;
    Department department1,department2;
    Laptop dell,mac;

    @BeforeTest
    public void setup() {
        testVagrant = new Company("TestVagrant","IndiraNagar,Bangalore");
        karthik = new Employee("1","Karthik",Designation.SDET);
        vinay = new Employee("2","Vinay",Designation.QA);
    }


    @Test
    public void shouldCreateEmployee()
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

        //Find the number of employees present in the company
        LaptopFactory factory = new LaptopFactory(3);
        List<Laptop> laptops = factory.getLaptops();

        testVagrant.issueLaptop(karthik,laptops.get(0));
        testVagrant.issueLaptop(vinay,laptops.get(1));


    }


    @Test
    public void DesignationTest() {

    }

}
