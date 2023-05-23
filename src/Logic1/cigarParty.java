package Logic1;

public class cigarParty {
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        //If it is the weekend meaning isWeekend is true
        //then as long as there are at least 40 cigars, party successful

        if (isWeekend) {
            return cigars >= 40;

        //If it's not the weekend, it has to be between 40 and 60 cigars
        } else{
            return cigars >= 40 && cigars <= 60;
        }
    }

    public static void main(String[] args) {
        System.out.println(cigarParty(30, false));  //Return false
        System.out.println(cigarParty(50, false));  //Return true
        System.out.println(cigarParty(70, true));   //Return true
    }
}
