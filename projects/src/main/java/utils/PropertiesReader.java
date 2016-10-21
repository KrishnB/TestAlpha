package utils;


public class PropertiesReader {

        public static PropertiesHelper propertiesHelper = new PropertiesHelper(System.getProperty("laptopMake"));

        public static String name = propertiesHelper.getName();
        public static String os = propertiesHelper.getOS();
        public static String processor = propertiesHelper.getProcessor();


}
