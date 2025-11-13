package main.enumBasics;

public class Example1 {
    enum statusCodes {
        toDo, running, inProgress, failed
    }

    public static void main(String[] args) {
        statusCodes statuse = statusCodes.running;
//        System.out.println(statuse);
//        getting index of statusCodes
//        int index = statusCodes.toDo.ordinal();
//        System.out.println("Index of toDo :" + index);
//        statusCodes[] statuses = statusCodes.values();
//        for (statusCodes status : statuses) {
//            System.out.println(status + " : " + status.ordinal());
//        }

        switch (statuse) {
            case toDo -> {
                System.out.println("Work Pending");
                break;
            }
            case running -> {
                System.out.println("Running");
                break;
            }
            case inProgress -> {
                System.out.println("In Progress");
                break;
            }
            case failed -> {
                System.out.println("Failed");
                break;
            }
        }
    }
}
