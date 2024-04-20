import java.util.List;

public class Filter {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers
                .stream()
                .filter(number -> number % 2 == 0)
                .toList();
        assert List.of(2, 4, 6, 8, 10).equals(evenNumbers);
    }

}
