package ro.pata.lambda.test07;

public class ClosuresExample {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        //b can be used in lambda but it has to be final. Java 8 does not require "final" keyword to be written.
        doProcess(a, i -> System.out.println(i+b));
    }

    public static void doProcess(int i,Process p){
        p.process(i);
    }
}

interface Process {
    void process(int i);
}
