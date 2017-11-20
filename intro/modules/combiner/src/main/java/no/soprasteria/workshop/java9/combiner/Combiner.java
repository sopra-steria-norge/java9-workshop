package no.soprasteria.workshop.java9.combiner;

import java.util.List;
import java.util.stream.Collectors;

public class Combiner {

    public String combineCharacters(List<String> charactersList) {
        return charactersList.stream().collect(Collectors.joining(" "));
    }
}
