package ro.pata.lambda.test01;

public class Greeter {
    public void greet(Greeting g){
        g.perform();
    }

    public static void main(String[] args) {
        Greeting lambdaGreeting=()-> System.out.println("Hello");

        Greeting innerGreeting=new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello");
            }
        };

        Greeter g=new Greeter();
        g.greet(lambdaGreeting);
        g.greet(innerGreeting);
        g.greet(()-> System.out.println("Hello"));
    }
}


