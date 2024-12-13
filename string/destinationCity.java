import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class destinationCity {
    public String destCity(List<List<String>> paths) {
        HashSet<String> set = new HashSet<>();
        for (List<String> l : paths) {
            set.add(l.get(0)); // Add starting cities to the set
        }
        for (List<String> l : paths) {
            if (!set.contains(l.get(1))) { // If city is not a starting city, it’s the destination
                return l.get(1);
            }
        }
        return ""; // Return empty string if no destination is found
    }

    public static void main(String[] args) {
        destinationCity dc = new destinationCity();
        List<List<String>> paths = Arrays.asList(
                Arrays.asList("London", "New York"),
                Arrays.asList("New York", "Lima"),
                Arrays.asList("Lima", "Sao Paulo")
        );

        String destination = dc.destCity(paths);
        System.out.println("Destination city: " + destination);
    }
}

