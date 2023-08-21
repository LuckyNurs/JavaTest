import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WeightedString {
    public static void main(String[] args) {
        String input = "abbcccd";
        int[] queries = {1, 3, 9, 8};
        List<String> results = calculateWeightsAndCheckQueries(input, queries);
        
        System.out.println("Output: " + results);
    }

    public static List<String> calculateWeightsAndCheckQueries(String input, int[] queries) {
        List<String> results = new ArrayList<>();
        
        // Calculate weights for characters
        int[] charWeights = new int[26];
        for (int i = 0; i < 26; i++) {
            charWeights[i] = i + 1;
        }
        
        // Calculate weights for substrings
        int[] substringWeights = new int[input.length()];
        substringWeights[0] = charWeights[input.charAt(0) - 'a'];
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                substringWeights[i] = substringWeights[i - 1] + charWeights[input.charAt(i) - 'a'];
            } else {
                substringWeights[i] = charWeights[input.charAt(i) - 'a'];
            }
        }

        // Check queries against calculated weights
        for (int q : queries) {
            boolean found = false;
            for (int weight : substringWeights) {
                if (q == weight) {
                    found = true;
                    break;
                }
            }
            results.add(found ? "Yes" : "No");
        }
        
        return results;
    }
    
}