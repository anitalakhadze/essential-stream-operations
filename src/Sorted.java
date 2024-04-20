import java.util.List;

public class Sorted {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 1, 6, 8, 2, 4, 5, 9, 7);
        List<Integer> sorted = numbers
                .stream()
                .sorted()
                .toList();
        assert List.of(1, 2, 3, 4, 5, 6, 7, 8, 9).equals(sorted);
    }

}
