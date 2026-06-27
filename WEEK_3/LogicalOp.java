package WEEK_3;

public class LogicalOp {
    public static void main(String[] args){

        // && - AND (all the conditions must be true then only it will execute)
        // || - OR (atleast one comdition must be true)
        // ! - NOT (used to false a true statement and vice versa)

        double temp = 30;
        boolean isSunny = true;
        if(temp <= 30 && temp >= 0 && !isSunny){
            System.out.print("The Wether is good");


        }
        else{
            System.out.println("Bad Wether");
        }

    }
    
}
