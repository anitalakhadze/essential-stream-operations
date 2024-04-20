import java.util.List;

public class Skip {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> skipped = numbers
                .stream()
                .skip(2)
                .toList();
        assert List.of(4, 5).equals(skipped);

        List<Integer> limited = numbers
                .stream()
                .limit(3)
                .toList();
        assert List.of(1, 2, 3).equals(limited);
    }

}
