package utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PropertiesHelper {

    Properties properties = new Properties();

    public PropertiesHelper(String propertyFileName) {
        String userDirectory = System.getProperty("user.dir");
        try {
            File file = new File(String.format(userDirectory+"/src/test/resources/%s.properties",propertyFileName));
            System.out.println(file.getPath());
            InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("/home/karthik/Development/TestAlpha/projects/src/main/java/testdata/Test.txt");
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return properties.getProperty("name");
    }

}
