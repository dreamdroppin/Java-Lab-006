//Word Check
import java.util.HashMap;

public class WordChecks {
    public static boolean isAbecedarian(String word) {
        char[] chars = word.toLowerCase().toCharArray();

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] < chars[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPairIsogram(String word) {
        HashMap<Character, Integer> charFrequency = new HashMap<>();

        for (char c : word.toLowerCase().toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        for (int frequency : charFrequency.values()) {
            if (frequency != 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String abecedarianWord = "accept";
        System.out.println("Abecedarian: " + isAbecedarian(abecedarianWord));

        String pairIsogramWord = "reappear";
        System.out.println("Pair Isogram: " + isPairIsogram(pairIsogramWord));
    }
}
