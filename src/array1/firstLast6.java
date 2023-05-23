package array1;

public class firstLast6 {
    public static boolean firstLast6(int[] nums) {

        //When the first # is 6 OR the last # is 6 it's true
        //0 index is first #, length(index) - 1 is last #
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;

        //If not it's false
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int [] nums = {1, 2, 6};
        int [] nums2 = {6,1,2,3};
        int [] nums3 = {13,6,1,2,3};
        System.out.println(firstLast6(nums)); //Returns true
        System.out.println(firstLast6(nums2)); //Returns true
        System.out.println(firstLast6(nums3)); //Returns false
    }
}
