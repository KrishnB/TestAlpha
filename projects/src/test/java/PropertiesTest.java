import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.PropertiesHelper;


public class PropertiesTest {

    PropertiesHelper propertiesHelper;
    @BeforeTest
    public void setup() {
        propertiesHelper = new PropertiesHelper("Dell");
    }


    @Test
    public void getLaptopName() {
        Assert.assertEquals(propertiesHelper.getName(),"dell");
    }
}
