package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropReader {
    private static String filePath = "src/main/resources/prop.properties";

    public static String getProperty(String pName) {


        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);

            properties.load(fileInputStream);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties.getProperty(pName);
    }

}
