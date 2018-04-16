package ro.pata.lambda.test02;

public class TypeInference {
    public static void main(String[] args) {
        StringLengthLambda myLambda=s->s.length();
        System.out.println(myLambda.getLength("Hello"));
    }

    interface StringLengthLambda{
        int getLength(String s);
    }
}
