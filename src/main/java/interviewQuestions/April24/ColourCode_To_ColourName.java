//🎨 Question 2: Color Code to Color Name
//Write a method that takes a color code (char) and returns the corresponding color name:
//
//'R' or 'r' → "Red"
//
//'G' or 'g' → "Green"
//
//'B' or 'b' → "Blue"
//
//'Y' or 'y' → "Yellow"
//
//For anything else, return "Unknown color"
//
//Use a switch-case, and be sure to handle both uppercase and lowercase letters.
package interviewQuestions.April24;

public class ColourCode_To_ColourName {

    static String getColourName(char colourCode) {
        char code = Character.toLowerCase(colourCode);

        return switch (code){
            case 'r' ->  "Red";
            case 'g' -> "Green";
            case 'b' ->  "Blue";
            case 'y' ->  "Yellow";
            default -> "Unknown color";};
    }

    public static void main(String[] args) {
        char[] colourCodes = {'R','a','D','g','b','Y'};
        for (char colourCode:colourCodes)
            System.out.println(colourCode+" : "+getColourName(colourCode));
    }
}