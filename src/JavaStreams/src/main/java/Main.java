import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    List<Person> people = getPeople();

    // Imperative approach 
    // looks gross don't do this

    /*

    List<Person> females = new ArrayList<>();

    for (Person person : people) {

      if (person.getGender().equals(Gender.FEMALE)) {
        females.add(person);
      }
    }

    females.forEach(System.out::println);

    */

    // Declarative approach 
    // looks so beautiful is will bring a tear to your eyes

    // Filter
    List<Person> females = people.stream()
        .filter(person -> person.getGender().equals(Gender.FEMALE))
        .collect(Collectors.toList()); //collects result to new list. can extract to variable

//    females.forEach(System.out::println);

    // Sort
    List<Person> sorted = people.stream()
        .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender).reversed()) //sort takes comparitator. can also chain with thenComparing
        .collect(Collectors.toList());

//    sorted.forEach(System.out::println);

    // All match
    boolean allMatch = people.stream()
        .allMatch(person -> person.getAge() > 8); // all ages to to be bigger than 8 to be true

//    System.out.println(allMatch);
    // Any match
    boolean anyMatch = people.stream()
        .anyMatch(person -> person.getAge() > 121); // any person can match

//    System.out.println(anyMatch);
    // None match
    boolean noneMatch = people.stream()
        .noneMatch(person -> person.getName().equals("Antonio")); // true because there is no antonio 

//    System.out.println(noneMatch);

    // Max
    people.stream()
        .max(Comparator.comparing(Person::getAge));
   //     .ifPresent(System.out::println);

    // Min
    people.stream()
        .min(Comparator.comparing(Person::getAge));
//        .ifPresent(System.out::println);

    // Group
    Map<Gender, List<Person>> groupByGender = people.stream()
        .collect(Collectors.groupingBy(Person::getGender));

//    groupByGender.forEach((gender, people1) -> {
//      System.out.println(gender);
//      people1.forEach(System.out::println);
//      System.out.println();
//    });

    Optional<String> oldestFemaleAge = people.stream()
        .filter(person -> person.getGender().equals(Gender.FEMALE))
        .max(Comparator.comparing(Person::getAge))
        .map(Person::getName);

    oldestFemaleAge.ifPresent(System.out::println);
  }

  private static List<Person> getPeople() {
    return List.of(
        new Person("Yoda", 900, Gender.MALE),
        new Person("Leia Organa", 30, Gender.FEMALE),
        new Person("Ahsoka", 20, Gender.FEMALE),
        new Person("Anakin SkyWalker", 22, Gender.MALE),
        new Person("Obi Kenobi", 35, Gender.MALE),
        new Person("Asajj Ventress", 33, Gender.FEMALE),
        new Person("Rey SkyWalker", 120, Gender.FEMALE),
        new Person("Darth Maul", 40, Gender.MALE)
    );
  }

}
