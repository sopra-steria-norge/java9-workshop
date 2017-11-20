package no.soprasteria.workshop.java9.splitter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Splitter {

    public List<String> wordSplitter(String word) {
        return Stream.of(word.split("(?!^)")).collect(Collectors.toList());
    }
}
