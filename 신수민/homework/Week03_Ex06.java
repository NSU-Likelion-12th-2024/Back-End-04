package homework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Week03_Ex06 {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("James", 10, 3000),
                new User("Alice", 20, 4000),
                new User("Thomas", 15, 3500)
        );

        System.out.println("[user name]");
        users.stream()
                .map(User::getName)
                .forEach(System.out::println);

        int totalPower = users.stream()
                .mapToInt(User::getPower)
                .sum();
        System.out.println("[user power 합계]" );
        System.out.println(totalPower);

        System.out.println("[user level 15 이상]");
        users.stream()
                .filter(user -> user.getLevel() >= 15)
                .map(user -> user.getName().toUpperCase())
                .forEach(System.out::println);
    }
}

class User {
    private String name;
    private int level;
    private int power;

    public User(String name, int level, int power) {
        this.name = name;
        this.level = level;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getPower() {
        return power;
    }
}