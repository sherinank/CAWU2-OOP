import java.util.HashMap;

public class Main {
    HashMap<String, Integer> map = new HashMap<>();

    public Main() {
        map.put("Soto", 15000);
        map.put("Bakso", 7000);
        map.put("Mie Ayam", 12000);

        System.out.println(map);
        System.out.println(map.keySet()); // Fixed syntax error

        map.forEach((key, value) -> {
            System.out.println(value); 
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}
