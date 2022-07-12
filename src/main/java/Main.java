import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import task.first.RailFenceCipher;
import task.fourth.Circle;
import task.fourth.Shape;
import task.fourth.Square;
import task.fourth.Triangle;
import task.second.NumberTransformer;
import task.third.SudokuValidator;

public class Main {
    public static void main(String[] args) {
        RailFenceCipher railFenceCipher = new RailFenceCipher(3);
        System.out.println(railFenceCipher.getDecryptedData("WECRLTEERDSOEEFEAOCAIVDEN"));
        System.out.println(railFenceCipher.getEncryptedData("WEAREDISCOVEREDFLEEATONCE"));

        NumberTransformer transformer = new NumberTransformer();
        System.out.println(transformer.getTransformedNumber(999123));

        List<Integer> raw1 = new ArrayList<>();
        raw1.add(7);
        raw1.add(8);
        raw1.add(4);
        raw1.add(1);
        raw1.add(5);
        raw1.add(9);
        raw1.add(3);
        raw1.add(2);
        raw1.add(6);

        List<Integer> raw2 = new ArrayList<>();
        raw2.add(5);
        raw2.add(3);
        raw2.add(9);
        raw2.add(6);
        raw2.add(7);
        raw2.add(2);
        raw2.add(8);
        raw2.add(4);
        raw2.add(1);

        List<Integer> raw3 = new ArrayList<>();
        raw3.add(6);
        raw3.add(1);
        raw3.add(2);
        raw3.add(4);
        raw3.add(3);
        raw3.add(8);
        raw3.add(7);
        raw3.add(5);
        raw3.add(9);

        List<Integer> raw4 = new ArrayList<>();
        raw4.add(9);
        raw4.add(2);
        raw4.add(8);
        raw4.add(7);
        raw4.add(1);
        raw4.add(5);
        raw4.add(4);
        raw4.add(6);
        raw4.add(3);

        List<Integer> raw5 = new ArrayList<>();
        raw5.add(3);
        raw5.add(5);
        raw5.add(7);
        raw5.add(8);
        raw5.add(4);
        raw5.add(6);
        raw5.add(1);
        raw5.add(9);
        raw5.add(2);

        List<Integer> raw6 = new ArrayList<>();
        raw6.add(4);
        raw6.add(6);
        raw6.add(1);
        raw6.add(9);
        raw6.add(2);
        raw6.add(3);
        raw6.add(5);
        raw6.add(8);
        raw6.add(7);

        List<Integer> raw7 = new ArrayList<>();
        raw7.add(8);
        raw7.add(7);
        raw7.add(6);
        raw7.add(3);
        raw7.add(9);
        raw7.add(4);
        raw7.add(2);
        raw7.add(1);
        raw7.add(5);

        List<Integer> raw8 = new ArrayList<>();
        raw8.add(2);
        raw8.add(4);
        raw8.add(3);
        raw8.add(5);
        raw8.add(6);
        raw8.add(1);
        raw8.add(9);
        raw8.add(7);
        raw8.add(8);

        List<Integer> raw9 = new ArrayList<>();
        raw9.add(1);
        raw9.add(9);
        raw9.add(5);
        raw9.add(2);
        raw9.add(8);
        raw9.add(7);
        raw9.add(6);
        raw9.add(3);
        raw9.add(4);

        List<List<Integer>> sudoku = new ArrayList<>();

        sudoku.add(raw1);
        sudoku.add(raw2);
        sudoku.add(raw3);
        sudoku.add(raw4);
        sudoku.add(raw5);
        sudoku.add(raw6);
        sudoku.add(raw7);
        sudoku.add(raw8);
        sudoku.add(raw9);

        SudokuValidator sudokuValidator = new SudokuValidator();

        System.out.println(sudokuValidator.validate(sudoku));

        int side = 3;
        int radius = 1;
        int base = 5;
        int height = 2;
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(side));
        shapes.add(new Circle(radius));
        shapes.add(new Triangle(base, height));

        System.out.println(shapes);

        Collections.sort(shapes);

        System.out.println(shapes);

    }
}
