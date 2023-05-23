package Logic1;

public class dateFashion {
    public static int dateFashion(int you, int date) {
        //When you OR the date are both 2 or lower, no table
        if (you <= 2 || date <= 2) {
            return 0;

        //When you OR the date are 8 or higher, yes table
        } else if (you >= 8 || date >=8) {
            return 2;

        //Any other outcome, maybe
        }else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(dateFashion(5, 10)); //Returns 2
        System.out.println(dateFashion(5, 2)); //Returns 0
        System.out.println(dateFashion(5, 5)); //Returns 1
    }
}
