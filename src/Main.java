import java.util.HashMap;

public class Main {


    public static int findIt(int[] a) {
        // Use a dictionary to store the counts
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int i : a) {
            counts.put(i, counts.getOrDefault(i, 0) + 1);
        }
        // Create the count array
        int[] count_array = new int[counts.size()];
        int index = 0;
        for (int key : counts.keySet()) {
            count_array[index] = counts.get(key);
            index++;
        }
        // Find the maximum odd count
        int max_odd_count = 0;
        for (int count : count_array) {
            if (count % 2 == 1 && count > max_odd_count) {
                max_odd_count = count;
            }
        }
        // Find the integer with the maximum odd count
        for (int key : counts.keySet()) {
            if (counts.get(key) == max_odd_count) {
                return key;
            }
        }
        // If no integer has an odd count, return -1
        return -1;

    }

    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        System.out.println("Odd one: "+findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
        System.out.println("Odd one: "+findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
        System.out.println("Odd one: "+findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
        System.out.println("Odd one: "+findIt(new int[]{10}));
        System.out.println("Odd one: "+findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
        System.out.println("Odd one: "+findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));

    }

}