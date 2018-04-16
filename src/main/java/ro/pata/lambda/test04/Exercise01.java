package ro.pata.lambda.test04;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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

        //1: Sort list by last name
        Collections.sort(people, (o1, o2)->o1.getLastName().compareTo(o2.getLastName()));

        //2: Create a method that prints all the elements in the list
        printConditionally(people,p->true);

        System.out.println("-----------------");

        //3: Create a method that prints all people that have last name beginning with C
        printConditionally(people, p->p.getLastName().startsWith("C"));
    }

    private static void printConditionally(List<Person> people, Predicate<Person> condition) {
        for(Person p:people){
            if(condition.test(p)) {
                System.out.println(p);
            }
        }
    }
}