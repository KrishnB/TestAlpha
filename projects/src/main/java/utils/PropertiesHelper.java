package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PropertiesHelper {

    Properties properties = new Properties();

    public PropertiesHelper(String propertyFileName) {
        System.out.println(propertyFileName);
        String userDirectory = System.getProperty("user.dir");
        try {
            File file = new File(String.format(userDirectory+"/src/test/resources/%s.properties",propertyFileName));
            System.out.println(file.getPath());
            InputStream inputStream1 = new FileInputStream(file);
            properties.load(inputStream1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return properties.getProperty("name");
    }

    public String getOS() {
        return properties.getProperty("os");
    }

    public String getProcessor() {
        return properties.getProperty("processor");
    }

}
