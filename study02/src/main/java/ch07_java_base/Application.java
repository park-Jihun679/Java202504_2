package ch07_java_base;

public class Application {

    public static void main(String[] args) {
        StudentDTO st = new StudentDTO("name", 30, "email");

        System.out.println(st);
    }
}
