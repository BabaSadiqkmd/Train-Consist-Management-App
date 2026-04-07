import java.util.*;
import java.util.stream.*;

// UC7 & UC8: Bogie Class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // =========================
        // UC1: Initialize Train
        // =========================
        System.out.println("\n--- UC1 ---");

        List<String> trainConsist = new ArrayList<>();
        System.out.println("Train initialized");
        System.out.println("Initial bogie count: " + trainConsist.size());


        // =========================
        // UC2: ArrayList Operations
        // =========================
        System.out.println("\n--- UC2 ---");

        List<String> passenger = new ArrayList<>();
        passenger.add("Sleeper");
        passenger.add("AC Chair");
        passenger.add("First Class");

        System.out.println("After adding: " + passenger);

        passenger.remove("AC Chair");
        System.out.println("After removal: " + passenger);

        System.out.println("Contains Sleeper? " + passenger.contains("Sleeper"));


        // =========================
        // UC3: HashSet
        // =========================
        System.out.println("\n--- UC3 ---");

        Set<String> ids = new HashSet<>();
        ids.add("BG101");
        ids.add("BG102");
        ids.add("BG101"); // duplicate
        ids.add("BG103");

        System.out.println("Unique IDs: " + ids);


        // =========================
        // UC4: LinkedList
        // =========================
        System.out.println("\n--- UC4 ---");

        LinkedList<String> train = new LinkedList<>();

        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        train.add(2, "Pantry");

        train.removeFirst();
        train.removeLast();

        System.out.println("Train Consist: " + train);


        // =========================
        // UC5: LinkedHashSet
        // =========================
        System.out.println("\n--- UC5 ---");

        LinkedHashSet<String> formation = new LinkedHashSet<>();
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper"); // duplicate

        System.out.println("Formation: " + formation);


        // =========================
        // UC6: HashMap
        // =========================
        System.out.println("\n--- UC6 ---");

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Sleeper", 72);
        map.put("AC Chair", 56);
        map.put("First Class", 24);

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }


        // =========================
        // UC7: Comparator Sorting
        // =========================
        System.out.println("\n--- UC7 ---");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("Sorted Bogies: " + bogies);


        // =========================
        // UC8: Stream Filtering
        // =========================
        System.out.println("\n--- UC8 ---");

        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .toList();

        System.out.println("Filtered (>60): " + filtered);
    }
}