package array1;
public class sameFirstLast {
    public static boolean sameFirstLast(int[] nums) {

        //If the array is more than 1 number AND
        //The first and last number in the array are equal it's true
        if (nums.length >= 1 && nums[0] == nums[nums.length - 1]) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3};
        int [] nums2 = {1,2,3,1};
        int [] nums3 = {1,2,1};
        System.out.println(sameFirstLast(nums)); //Returns false
        System.out.println(sameFirstLast(nums2)); //Returns true
        System.out.println(sameFirstLast(nums3)); //Returns true
    }
}
