package Logic1;

public class squirrelPlay {
    public static boolean squirrelPlay(int temp, boolean isSummer) {

        //If it is summer the temp has to be between 60 and 100
        if (isSummer) {
            return temp >= 60 && temp <= 100;

        //If not summer the temp has to be between 60 and 90
        }else {
            return temp >=60 && temp <=90;
        }
    }

    public static void main(String[] args) {
        System.out.println(squirrelPlay(70, false));
        System.out.println(squirrelPlay(95, false));
        System.out.println(squirrelPlay(95, true));
    }
}
