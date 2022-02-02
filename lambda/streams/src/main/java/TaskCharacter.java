import java.util.Arrays;
import java.util.List;

public class TaskCharacter {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");

        words.stream()
                .map(name->name.length())
                .forEach(System.out::println);
    }
}
