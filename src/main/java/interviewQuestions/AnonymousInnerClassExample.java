package interviewQuestions;

class A1 {
    String name;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}

public class AnonymousInnerClassExample {
    public static void main(String[] args) {
        A1 obj1 = new A1() {
            String getName() {
                return "Alok";
            }
        };
        obj1.setName("Krunal");
        System.out.println("Name : " + obj1.getName());
    }
}