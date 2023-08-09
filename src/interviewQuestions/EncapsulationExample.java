package interviewQuestions;

class EncapsulationExample {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Demo {
    public static void main(String[] args) {
        EncapsulationExample obj = new EncapsulationExample();
        obj.setName("Krunal");
        obj.setAge(32);
        System.out.println("Name : " + obj.getName() + " Age: " + obj.getAge());
    }
}
