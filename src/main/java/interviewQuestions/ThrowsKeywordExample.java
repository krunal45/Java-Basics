package interviewQuestions;

class A3 {
    void show() throws ClassNotFoundException {
        Class.forName("java.lang.Object");
    }
}


public class ThrowsKeywordExample {
    public static void main(String[] args) {
        A3 obj = new A3();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
