import core.Employee;
import org.testng.annotations.Test;

/**
 * Created by tvserver on 19/10/16.
 */
public class EmployeeTest
{
    @Test
    public void shouldCreateEmployee()
    {
        Employee karthik = new Employee("1","karthik","SDET");
    }

}
