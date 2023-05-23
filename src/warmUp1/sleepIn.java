package warmUp1;

public class sleepIn {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
       //Sleep in if it's not a weekday OR if on vacation
        if (!weekday || vacation) {
            return true;
            //No sleeping in on weekdays or no vacation
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Test
        System.out.println(sleepIn(false, false)); //Returns true
        System.out.println(sleepIn(true, false)); //Returns false
        System.out.println(sleepIn(false, true)); //Returns true
    }

}

