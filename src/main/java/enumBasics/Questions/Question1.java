//        **Question:**
//Create an `enum` called `Day` that represents the days of the week (`MONDAY` to `SUNDAY`).
// Each day should have an associated boolean value indicating whether it's a **weekend** or not.
//
//Then, write a Java program that:
//
//        1. Iterates over all values of the `Day` enum.
//        2. Prints each day along with whether it is a **Weekend** or a **Weekday**.
//
//        ---

package enumBasics.Questions;


enum Day {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    private final boolean isWeekend;


    Day(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public boolean isWeekend() {
        return isWeekend;
    }
}

public class Question1 {
    public static void main(String[] args) {
        Day[] days = Day.values();
        for (Day day : days)
            System.out.println(day + " : isWeekEnd ? " + day.isWeekend());
    }
}