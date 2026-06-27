package WEEK_3;
import java.util.Scanner;

public class ForLoop {

    public static void main(String [] args) throws InterruptedException{

        /*Syntax:
        for(int i = 0; i > 0; i++){
        }
        i++ -> increment by 1
        i+=2 -> increment by 2
        i-- -> decrement by 1
        i-=2 -> decrement by 2 */

        // for(int i = 0+1; i < 10+1; i+=2){
        //     System.out.println(i);
        // }


        //COUNTDOWN MINI PROJECT

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many seconds you want to count: ");
        int start = scanner.nextInt();

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("Happy New Year");

    }
    
}
