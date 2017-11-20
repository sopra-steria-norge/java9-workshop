package no.soprasteria.workshop.java9.verifier;

import no.soprasteria.workshop.java9.splitter.Splitter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class VerifierTest {

    private Verifier verifier = new Verifier();

    @Test
    void skal_ha_argument_med_lengde_en() {
        assertThrows(IllegalArgumentException.class, () -> verifier.isLegalCharacter("en"));
        assertThrows(IllegalArgumentException.class, () -> verifier.isLegalCharacter(""));
        assertThrows(IllegalArgumentException.class, () -> verifier.isLegalCharacter(null));
    }

    @Test
    void har_tilgang_på_transitive_klasser_i_tester() {
        Splitter splitter = new Splitter();
        String word = "Denne kan jeg dele opp";
        assertThat(splitter.wordSplitter(word)).hasSize(22);
        assertThat(splitter.wordSplitter(word)).hasSameElementsAs(splitter.wordSplitter(verifier.returnOnlyVerifiedCharacters(word)));
    }
}