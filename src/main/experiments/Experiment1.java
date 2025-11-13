package main.experiments;

public class Experiment1 {
    public static void main(String[] args) {
//        String o1, o2;
//        o1 = "true";
//        System.out.println("Value of o1 :" + o1);
//        System.out.println("Hashcode:" + o1.hashCode());
//        o2 = "true";
//        o2 = "false";
//        System.out.println("Hashcode:" + o2.hashCode());
//        System.out.println("Are o1 and o2 same ? " + (o1 == o2));

        //------StringBuffer
        StringBuffer name1,name2;
        name1 = new StringBuffer("getOrDefaultMapExample");
        name2 = new StringBuffer("getOrDefaultMapExample");
        System.out.println("name1 == name2 ->"+name1.equals(name2));
    }
}
