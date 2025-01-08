package OopsConcept;
class Employee{
    private String name,designation,gender;
    private int age;
    private boolean isMarried;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Employee ajayMehta = new Employee();
        ajayMehta.setName("Ajay Mehta");
        ajayMehta.setAge(24);
        ajayMehta.setDesignation("QA");
        ajayMehta.setGender("Male");
        ajayMehta.setMarried(false);

        System.out.println("Name: "+ajayMehta.getName());
        System.out.println("Age: "+ajayMehta.getAge());
        System.out.println("Designation: "+ajayMehta.getDesignation());
        System.out.println("Gender: "+ajayMehta.getGender());
        System.out.println("IsMarried ? "+ajayMehta.isMarried());
    }
}
