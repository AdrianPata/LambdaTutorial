package ro.pata.lambda.test06;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4};
        int key=0;

        process(numbers,key,wrapperLambda((v,k)-> System.out.println(v/k)));
    }

    private static void process(int[] numbers, int key, BiConsumer<Integer,Integer> consumer) {
        for(int i:numbers){
            consumer.accept(i,key);
        }
    }

    private static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer,Integer> consumer){
        return (v,k)-> {
            try {
                consumer.accept(v, k);
            } catch(ArithmeticException ex){
                System.out.println("Exception in wrapper lambda.");
            }
        };
    }
}
