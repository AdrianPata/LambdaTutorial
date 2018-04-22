package ro.pata.lambda.test09;

import ro.pata.lambda.test04.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {
    public static void main(String[] args) {
        List<Person> people= Arrays.asList(
                new Person("Charles","Dickens",60),
                new Person("Lewis","Carol",42),
                new Person("Thomas","Carlyle",51),
                new Person("Charlotte","Bronte",45),
                new Person("Matthew","Arnold",39)
        );

        //This will not have a predefined order of execution. It will apply the lambda expression to all the
        //elements in the list using parallelization. There is no guarantee about which element in the list will
        //be executed first.
        people.forEach(System.out::println);
    }
}
