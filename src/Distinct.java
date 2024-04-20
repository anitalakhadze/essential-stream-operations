import java.util.List;

public class Distinct {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 4, 4, 5);
        List<Integer> distinctNumbers = numbers
                .stream()
                .distinct()
                .toList();
        assert List.of(1, 2, 3, 4).equals(distinctNumbers);
    }

}
