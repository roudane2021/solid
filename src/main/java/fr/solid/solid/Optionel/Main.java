package fr.solid.solid.Optionel;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        List<Employe> employes = getList();

        Optional.of("hhh")
                .flatMap(v -> getOptional(v))
                .ifPresent(System.out::println);

    }

    private static List<Employe> getList() {
        return Arrays.asList(
                new Employe(1478L, "roudane", "rachid", "0750836330", true),
                new Employe(1478L, "doni", "ahmed", "0750836330", false),
                new Employe(1478L, "dawdi", "nizar", "0750836330", true),
                new Employe(1478L, "foki", "omar", "0750836330", true)
        );
    }

    private static Optional<Integer> getOptional(final String value) {

        return Objects.equals("hhh", value) ? Optional.of(2) : Optional.empty();
    }
}

