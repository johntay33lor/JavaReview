package warmUp1;

public class sumDouble {
    public static int sumDouble(int a, int b) {
        int sum = a + b;

        //checking to see if the numbers are the same
        // if so doubling the sum and retuning it
        if (a == b) {
            return sum * 2;
        } else {
            //if two ints are not the same it just returns the sum
            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumDouble(1, 2)); //Returns 3
        System.out.println(sumDouble(3, 2)); //Returns 5
        System.out.println(sumDouble(2, 2)); //Returns 8
    }
}
