package no.soprasteria.workshop.java9.interfaces;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public interface IneffektivKalkulator {
    default int sumAvParTall(int... nums) {
        return leggSammen(n -> n % 2 == 0, nums);
    }

    default int sumAvOddetall(int... nums) {
        return leggSammen(n -> n % 2 != 0, nums);
    }

    default int sum(int... nums) {
        return sumAvOddetall(nums) + sumAvParTall(nums);
    }

    private int leggSammen(IntPredicate predicate, int... nums) {
        return IntStream.of(nums)
                .filter(predicate)
                .sum();
    }
}
