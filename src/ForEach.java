import java.util.List;

public class ForEach {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        numbers.forEach(num -> System.out.println(num * 2));
    }

}
