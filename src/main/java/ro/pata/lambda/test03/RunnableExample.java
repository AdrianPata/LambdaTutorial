package ro.pata.lambda.test03;

public class RunnableExample {
    public static void main(String[] args) {
        Thread myLambdaThread=new Thread(()-> System.out.println("Hello"));

        myLambdaThread.start();
    }
}
