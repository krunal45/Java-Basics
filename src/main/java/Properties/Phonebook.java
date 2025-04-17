package Properties;

import java.io.*;
import java.util.Properties;

public class Phonebook {
    public static void main(String[] args) throws IOException {
        Properties phonebook = new Properties();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name,number;
        FileInputStream fileInputStream = null;
        boolean changed = false;

//        Try to open phonebook.dat file
        try {
            fileInputStream = new FileInputStream("src/main/java/Properties/phonebook.dat");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

//        If phonebook file already exists, load existing phone numbers
        try {
            if (fileInputStream!=null){
                phonebook.load(fileInputStream);
                fileInputStream.close();
            }
        } catch (IOException e) {
            System.out.println("Error reading file!");
        }

//        Let user enter new name & numbers
        do {
            System.out.println("Enter New Name"+" ('quit' to stop): ");
            name = bufferedReader.readLine();
            if (name.equals("quit")) continue;

            System.out.println("Enter Number: ");
            number = bufferedReader.readLine();

            phonebook.put(name, number);
            changed = true;
        }while (!name.equals("quit"));

//        If phonebook data is changed then save it.
        if (changed){
            FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/Properties/phonebook.dat");
            phonebook.store(fileOutputStream, "phone Book");
            fileOutputStream.close();
        }

//        Look up phonebook
        do {
            System.out.println("Enter Name to find: "+" ('quit' to quit)");
            name = bufferedReader.readLine();
            if (name.equals("quit")) continue;

            number = (String) phonebook.get(name);
            System.out.println(number);
        }while (!name.equals("quit"));
    }
}