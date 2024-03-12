package reusableComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesOperations {

    static Properties prop = new Properties();
    public static String getPropertiesValueByKey(String key) {
        // 1. Load data from properties file
        // 2. Read the data from properties file
        String propFilePath = System.getProperty("user.dir") + "/src/test/resources/config.properties";

        // 3. Load the file
        // Read the data from properties file
        try (FileInputStream fileInputStream = new FileInputStream(propFilePath)) {
            prop.load(fileInputStream);
            return prop.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}