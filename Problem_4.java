import java.util.HashMap;
import java.util.Map;

public class Problem_4 {

    public static void main(String[] args) {
        // hardcoding input array as per example usually
        // but can be dynamic too
        int[] input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        // using hashmap to store the counts like a dict in python
        Map<Integer, Integer> counts = new HashMap<>();

        // we gotta check for multiples of 1 to 9
        for (int i = 1; i <= 9; i++) {
            int count = 0;
            
            // iterating thru the input array
            for (int num : input) {
                // modulus operator ftw
                // if rem is 0 means its a multiple
                if (num % i == 0) {
                    count++;
                }
            }
            // putting result in map
            counts.put(i, count);
        }

        // printing the final map
        // the format shud match what they asked
        System.out.println(counts);
    }
}
