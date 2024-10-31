package day2_java_syntax_basics;

public class MainJavaBasics {
    public static void main(String[] args) {
        System.out.println("Welcome Khylle");
        System.out.println("Java Backend");

        sayMessage();

        //calling a method with a no return value
        Message message = new Message();
        message.sayOtherMessage();
        System.out.println();

        //for calling a static method
        Message.anotherMessage();

        //This is a one line comment
        /*
            This
            is
            a
            multi
            line

         */
    }

    private static void sayMessage() {
        System.out.println("This is a sayMethod() method");
    }
}

