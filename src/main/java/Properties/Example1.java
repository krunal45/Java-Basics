package Properties;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Example1 {
    public static void main(String[] args) {
        Properties stateCapitals = new Properties();
        String state,capital;
        stateCapitals.put("Alabama", "Montgomery");
        stateCapitals.put("Alaska", "Juneau");
        stateCapitals.put("Arizona", "Phoenix");
        stateCapitals.put("Arkansas", "Little Rock");

        Set<Object> keys = stateCapitals.keySet();
        for (Object key : keys) {
            state = (String) key;
            capital = (String) stateCapitals.get(state);
            System.out.println("The Capital of " + state + " is " + capital);
        }

//        Look for state not in the list.
        capital = stateCapitals.getProperty("Florida","Not Found");
        System.out.println("The Capital of Florida is "+capital);
    }
}
