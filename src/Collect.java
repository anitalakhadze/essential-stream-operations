import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Collect {

    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "peach", "banana", "cherry", "banana", "peach");
        Set<String> fruitSet = fruits
                .stream()
                .collect(Collectors.toSet());
        assert fruitSet.size() == 4;
    }

}
