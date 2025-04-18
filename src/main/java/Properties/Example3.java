package Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Example3 {
    public static void main(String[] args) {
        Properties sampleProperties = new Properties();
        FileInputStream fileReader;
        try {
            fileReader = new FileInputStream("src/main/java/Properties/sample.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        if (fileReader!=null){
            try {
                sampleProperties.load(fileReader);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if (sampleProperties.getProperty("env").equals("QA")){
            System.out.println("--QA--");
        }
        if (sampleProperties.getProperty("browser").equals("chrome")){
            System.out.println("--Chrome--");
        }
        if (sampleProperties.getProperty("parallelMode").equals("True")){
            System.out.println("Parallel Mode");
        }else {
            System.out.println("Serial Mode");
        }
        if (sampleProperties.getProperty("appVersion").equals("1.2")){
            System.out.println("App version: 1.2");
        }
    }
}
