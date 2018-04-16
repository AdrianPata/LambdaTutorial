package ro.pata.lambda.test05;

import ro.pata.lambda.test04.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionalInterfacesExample {
    public static void main(String[] args) {
        List<Person> people= Arrays.asList(
                new Person("Charles","Dickens",60),
                new Person("Lewis","Carol",42),
                new Person("Thomas","Carlyle",51),
                new Person("Charlotte","Bronte",45),
                new Person("Matthew","Arnold",39)
        );

        //1: Sort list by last name
        Collections.sort(people, (o1, o2)->o1.getLastName().compareTo(o2.getLastName()));

        //2: Create a method that prints all the elements in the list
        performConditionally(people, p->true, p-> System.out.println("A: "+p));

        //3: Create a method that prints all people that have last name beginning with C
        performConditionally(people, p->p.getLastName().startsWith("C"), p-> System.out.println("F: "+p));
    }

    private static void performConditionally(List<Person> people, Predicate<Person> condition, Consumer<Person> consumer) {
        for(Person p:people){
            if(condition.test(p)) {
                consumer.accept(p);
            }
        }
    }
}
