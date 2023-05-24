package hashMapPractice;
import java.util.HashSet;

public class TwoSum {
    public static boolean hasTwoSum(int[] nums, int target) {
        HashSet<Integer> numbers = new HashSet<>();

        for (int num : nums) {
            int number = target - num;

            if (numbers.contains(num)) {
                return true;
            } else {
                numbers.add(number);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] input = {2,3,8,9,12};
        int target = 12;

        boolean answer = hasTwoSum(input, target);

        System.out.println(answer);
    }
}
