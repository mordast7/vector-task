package task.third;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SudokuValidator {
    public boolean validate(List<List<Integer>> sudoku) {
        int countOfRaws = sudoku.size();
        int countOfNumbers = (int) sudoku.stream()
                .mapToLong(Collection::size)
                .sum();

        if (countOfRaws < 1) {
            return false;
        }
        if (countOfRaws * countOfRaws != countOfNumbers) {
            return false;
        }

        for (List<Integer> raw : sudoku) {
            if (raw.size() != countOfRaws) {
                return false;
            }

            List<Integer> list = raw.stream()
                    .distinct()
                    .collect(Collectors.toList());
            if (list.size() != countOfRaws) {
                return false;
            }
        }
        return true;
    }
}
