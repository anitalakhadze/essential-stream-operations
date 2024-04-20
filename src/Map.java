import java.util.List;

public class Map {

    public static void main(String[] args) {
        List<String> pets = List.of("Hamster", "Cat", "Dog");
        List<String> upperCaseNames = pets
                .stream()
                .map(String::toUpperCase)
                .toList();
        assert List.of("HAMSTER", "CAT", "DOG").equals(upperCaseNames);
    }

    // TODO: add exercises

}
