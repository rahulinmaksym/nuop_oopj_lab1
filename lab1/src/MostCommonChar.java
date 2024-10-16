import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostCommonChar {

    public static char findMostCommonChar(String str1, String str2) {
        String combined = str1 + str2;

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : combined.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        char mostCommonChar = '\0';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostCommonChar = entry.getKey();
            }
        }

        return mostCommonChar;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String str1 = scn.nextLine();
        String str2 = scn.nextLine();

        char result = findMostCommonChar(str1, str2);

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Most common character: " + result);
    }
}