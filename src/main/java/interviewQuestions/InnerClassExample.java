package interviewQuestions;


class A {
    private int age;

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return this.age;
    }

    class B {
        private String name;

        void setName(String name) {
            this.name = name;
        }

        String getName() {
            return this.name;
        }

    }
}

public class InnerClassExample {
    public static void main(String[] args) {
        A obj = new A();
        obj.setAge(12);
        System.out.println("Age : " + obj.getAge());

        A.B obj2 = obj.new B();
        obj2.setName("Jay");
        System.out.println(obj2.getName());

//        --- In case Class B is static
//        A.B obj2 = new A.B();
//        obj2.setName("Krunal");
//        System.out.println(obj2.getName());
    }
}
