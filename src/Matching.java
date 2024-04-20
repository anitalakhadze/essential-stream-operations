import java.util.List;

public class Matching {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        assert Boolean.TRUE.equals(
                numbers
                .stream()
                .anyMatch(num -> num == 5)
        );

        assert Boolean.FALSE.equals(
                numbers
                        .stream()
                        .anyMatch(num -> num == 15)
        );

        assert Boolean.TRUE.equals(
                numbers
                        .stream()
                        .noneMatch(num -> num == 15)
        );

        assert Boolean.FALSE.equals(
                numbers
                        .stream()
                        .noneMatch(num -> num == 3)
        );

        assert Boolean.TRUE.equals(
                numbers
                        .stream()
                        .allMatch(num -> num > 0)
        );

        assert Boolean.FALSE.equals(
                numbers
                        .stream()
                        .allMatch(num -> num % 2 == 0)
        );

    }

}
