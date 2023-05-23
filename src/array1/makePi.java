package array1;
import java.util.Arrays;

public class makePi {
    public static int[] makePi() {
        int[] piArray = {3,1,4};
        return piArray;
    }

    public static void main(String[] args) {
        int [] pi = makePi();
        System.out.println(Arrays.toString(pi)); //Returns [3,1,4]
    }
}
