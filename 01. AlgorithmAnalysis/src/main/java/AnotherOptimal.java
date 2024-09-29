import java.util.Arrays;

public class AnotherOptimal {
    public static void main(String[] args) {

        int[] nums = {16, 7, 11, 15,2};
        int target = 9;
        int [] ind = new int[2];

        //sort method here nlogn
        for (int i = 0, j =1 ; i < nums.length; i++, j++ ) {
            if (nums[i] == target) {continue;}
            if(target - nums[i] == nums[j]) {
                ind[0] = i; ind[1] = j;
                System.out.println(Arrays.toString(ind));
            }
        } // overall complexity will be nlogn + n
    }
}
