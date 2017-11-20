package no.soprasteria.workshop.java9.verifier;

import no.soprasteria.workshop.java9.combiner.Combiner;
import no.soprasteria.workshop.java9.splitter.Splitter;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Verifier {

    private final Splitter splitter = new Splitter();
    private final Combiner combiner = new Combiner();

    public String returnOnlyVerifiedCharacters(String wordToClean) {
        return combiner.combineCharacters(splitter.wordSplitter(wordToClean)
                .stream()
                .filter(this::isLegalCharacter)
                .collect(Collectors.toList()));
    }

    boolean isLegalCharacter(String character) {
        if (character == null || character.isEmpty() || character.length() > 1) {
            throw new IllegalArgumentException("Forventet en karakter og bare en");
        }
        return Pattern.matches("\\w|\\s", character);
    }
}
