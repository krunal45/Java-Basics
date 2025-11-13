package main.interviewQuestions;

abstract class AbstractClassExample {
    abstract  void drive();

    AbstractClassExample(){

    }

    void playMusic() {
        System.out.println("play music");
    }

    static class maruti extends AbstractClassExample {

        @Override
        void drive() {
            System.out.println("drive maruti");
        }
    }

    public static void main(String[] args) {
        AbstractClassExample obj1 = new maruti();
        new AbstractClassExample() {
            @Override
            void drive() {

            }
        };
        obj1.drive();
        obj1.playMusic();
    }
}
