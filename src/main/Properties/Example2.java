package main.Properties;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Example2 {
    public static void main(String[] args) {
        Set<Object> keys;
        String state, capital;
        Properties defaultList = new Properties();
        defaultList.put("California", "Sacramento");
        defaultList.put("Texas", "Austin");

        Properties stateCapitals = new Properties(defaultList);
        stateCapitals.put("Florida", "Tallahassee");
        stateCapitals.put("New York", "Albany");
        stateCapitals.put("Illinois", "Springfield");
        stateCapitals.put("Pennsylvania", "Harrisburg");

        keys = stateCapitals.keySet();
        for (Object key : keys) {
            state = (String) key;
            capital = stateCapitals.getProperty(state);
            System.out.println(state + " : " + capital);
        }

//        default Properties check
        state = "California";
        capital = stateCapitals.getProperty(state);
        System.out.println(state+" : "+capital);
    }
}
