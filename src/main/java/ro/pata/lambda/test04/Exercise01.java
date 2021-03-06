package ro.pata.lambda.test04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Exercise01 {
    public static void main(String[] args) {
        List<Person> people= Arrays.asList(
                new Person("Charles","Dickens",60),
                new Person("Lewis","Carol",42),
                new Person("Thomas","Carlyle",51),
                new Person("Charlotte","Bronte",45),
                new Person("Matthew","Arnold",39)
        );

        printConditionally(people, p->true,System.out::println); //p->method(p)
    }

    private static void printConditionally(List<Person> people, Predicate<Person> condition, Consumer<Person> consumer) {
        for(Person p:people){
            if(condition.test(p)) {
                consumer.accept(p);
            }
        }
    }
}