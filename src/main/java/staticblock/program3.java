
//**Question:**
//You are building a configuration loader for an automation testing framework. This loader must initialize a `BASE_URL` constant
// **only once** before any test runs.
//
//Implement a class called `ConfigLoader` with the following:
//
//- A `static String BASE_URL` variable.
//- A `static block` that initializes `BASE_URL` by printing a message like `"Loading BASE_URL..."` and assigning it a default value like `"https://test.example.com"`.
//- A `static method` `printBaseUrl()` that prints the current `BASE_URL`.
//- A `main` method that simply calls `printBaseUrl()`.
//
//**Requirements:**
//- Demonstrate that the static block runs only **once**, even if `printBaseUrl()` is called multiple times.
//
//---
//
//**Follow-up Questions:**
//- When exactly does the static block get executed?
//- What happens if you have multiple static blocks?

package staticblock;

public class program3 {
    static String BASE_URL;

    static {
        BASE_URL = "https://test.example.com";
        System.out.println("Loading BASE_URL..." + BASE_URL);
    }

    static void printBaseUrl() {
        System.out.println(BASE_URL);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            printBaseUrl();
        }
    }
}