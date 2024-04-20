import java.util.Collection;
import java.util.List;

public class FlatMap {

    public static void main(String[] args) {
        List<List<String>> shapes = List.of(
                List.of("triangle", "rectangle", "square"), // sharp forms
                List.of("circle", "ellipse", "cylinder") // rounded forms
        );

        List<String> flattenedShapes = shapes
                .stream()
                .flatMap(Collection::stream)
                .toList();

        assert flattenedShapes.size() == 6;
        assert List.of("triangle", "rectangle", "square", "circle", "ellipse", "cylinder").equals(flattenedShapes);
    }

}
