package warmUp1;

public class monkeyTrouble {
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        //Return true when both monkeys smile
        if (aSmile && bSmile) {
            return true;
        }

        //Return true if both aren't smiling
        if (!aSmile && !bSmile) {
            return true;

        //Return false if any other outcome
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        //Test
        System.out.println(monkeyTrouble(true, true)); //Returns true
        System.out.println(monkeyTrouble(false, false)); //Returns true
        System.out.println(monkeyTrouble(true, false)); //Returns false
    }

}
