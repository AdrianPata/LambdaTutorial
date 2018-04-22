package ro.pata.lambda.test08;

import ro.pata.lambda.test04.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MethodReferenceExample2 {
    public static void main(String[] args) {
        List<Person> people= Arrays.asList(
                new Person("Charles","Dickens",60),
                new Person("Lewis","Carol",42),
                new Person("Thomas","Carlyle",51),
                new Person("Charlotte","Bronte",45),
                new Person("Matthew","Arnold",39)
        );


    }

    private static void printConditionally(List<Person> people, Predicate<Person> condition) {
        for(Person p:people){
            if(condition.test(p)) {
                System.out.println(p);
            }
        }
    }
}
