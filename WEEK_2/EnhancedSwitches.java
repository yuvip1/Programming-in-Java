package WEEK_2;

public class EnhancedSwitches {

    public static void main(String [] args){
        
        //A replacement of many if else statements

        String day = "someday";

        switch(day){
            case "monday" -> System.out.println("It is a weekday");
            case "tuesday" -> System.out.println("It is a weekday");
            case "saturday" -> System.out.println("It is a weekend");

            default -> System.out.println(day + " is not a day");
        }


        

    }

}