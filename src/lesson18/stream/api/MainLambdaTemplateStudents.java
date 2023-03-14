package lesson18.stream.api;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.lang.Comparable;

import static lesson18.stream.api.FruitType.*;
import static lesson18.stream.api.Vitamin.A;
import static lesson18.stream.api.Vitamin.B;
import static lesson18.stream.api.Vitamin.B1;
import static lesson18.stream.api.Vitamin.B2;
import static lesson18.stream.api.Vitamin.C;
import static lesson18.stream.api.Vitamin.D;
import static lesson18.stream.api.Vitamin.E;
import static lesson18.stream.api.Vitamin.P;

/**
 * @author spasko
 */
public class MainLambdaTemplateStudents implements Comparable<Fruit> {
    public static void main(String[] args) {
        List<Fruit> fruits = fillFruitsList();

        System.out.println("Part 1");

        fruits.stream()
                .peek(fr -> System.out.println(fr))
                .flatMap(fr -> fr.getVitamins()
                        .stream()
                        .filter(f -> C == f || A == f))
                .forEach(System.out::println);

        System.out.println("Part 2");

        Set<Vitamin> vitaminSet = fruits.stream()
                .flatMap(fr -> fr.getVitamins()
                        .stream())
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println("vitaminSet = " + vitaminSet);

        System.out.println("Part 3");

        Map<FruitType, Fruit> cheapFruit = fruits.stream()
                .collect(Collectors.toMap(Fruit::getFruitType, Function.identity(), (fruit1, fruit2) -> {
                    if (fruit1.getPrice() <= fruit2.getPrice()) {
                        return fruit1;
                    } else {
                        return fruit2;
                    }
                }));
        System.out.println("cheapFruit = " + cheapFruit);

        System.out.println("Part 4");

        fruits.stream()
                .sorted(Comparator.comparingInt(Fruit::getDayToLive).reversed())
                .limit(3)
                .forEach(fruit -> System.out.println(fruit));

        System.out.println("Part 5");

        Map<FruitType, Long> countByFruitType  = fruits.stream()
                .collect(Collectors.groupingBy(Fruit::getFruitType, Collectors.counting()));
        System.out.println("countByFruitType = " + countByFruitType);

        System.out.println("Part 6");
        Map<FruitType, List<Fruit>> fruitsList = fruits.stream()
                .collect(Collectors.groupingBy(Fruit::getFruitType,
                        Collectors.toList()));
        System.out.println("fruitsList = " + fruitsList);



        System.out.println("****");

    }

    private static List<Fruit> fillFruitsList() {
        List<Fruit> fruits = new ArrayList<>();

        Fruit fruit = new Fruit(APPLE, 30, LocalDate.of(2019, 1, 4), 12, null);
        fruit.setVitamins(List.of(B, C));
        fruits.add(fruit);

        fruit = new Fruit(STRAWBERRY, 15, LocalDate.of(2019, 1, 2), 50, null);
        fruit.setVitamins(List.of(A, C));
        fruits.add(fruit);

        fruit = new Fruit(PEAR, 30, LocalDate.of(2019, 1, 4), 40, null);
        fruit.setVitamins(List.of(A, B1, B2, C));
        fruits.add(fruit);

        fruit = new Fruit(ORANGE, 60, LocalDate.of(2019, 1, 3), 30, null);
        fruit.setVitamins(List.of(E, B, A));
        fruits.add(fruit);

        fruit = new Fruit(STRAWBERRY, 25, LocalDate.of(2019, 1, 2), 60, null);
        fruit.setVitamins(List.of(A, C, D));
        fruits.add(fruit);

        fruit = new Fruit(PEAR, 15, LocalDate.of(2019, 1, 4), 40, null);
        fruit.setVitamins(List.of(A, B, B1, B2, P));
        fruits.add(fruit);

        fruit = new Fruit(PEAR, 5, LocalDate.of(2019, 1, 6), 10, null);
        fruit.setVitamins(List.of(B1, B2, P));
        fruits.add(fruit);

        fruit = new Fruit(APPLE, 30, LocalDate.of(2019, 1, 4), 12, null);
        fruit.setVitamins(List.of(B, C));
        fruits.add(fruit);

        return fruits;
    }

    @Override
    public int compareTo(Fruit o) {
        return o.getDayToLive();
    }
}
