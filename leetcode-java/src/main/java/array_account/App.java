package array_account;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "Name");
        map.put("2", "Adress");
        map.put("3", "Phone");
        map.put("4", "PO Box");
        map.put("5", "Social Security");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + " - " + value);

            if (Integer.parseInt(key) >= 4) {
                System.out.println("Security Data ");
            } else {
                System.out.println("Commum Data ");
            }
        }
    }
}