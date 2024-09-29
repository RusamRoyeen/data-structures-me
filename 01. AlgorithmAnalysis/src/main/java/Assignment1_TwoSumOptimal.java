import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Assignment1_TwoSumOptimal {

    public static void main(String[] args) {

        int[] array = new int[] {2, 7, 9, 11};
        System.out.println(Arrays.toString(towSumOptimalSolution(array, 9)));
    }

    public static int[] towSumOptimalSolution(int[] array, int targetValue){
        // Complexity of the solution is O(n) ,but I have space complexity of o(n)
        // create hashMap
        Map<Integer, Integer> map = new HashMap();
        for (int i=0; i<array.length; i++){
            int potentialMatch = targetValue - array[i];
            if (map.containsKey(potentialMatch)) return new int[] {i, map.get(potentialMatch)};
            else map.put(array[i], i);
        }
        return new int[]{};
    }
}
