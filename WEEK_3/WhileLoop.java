package WEEK_3;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        // /* if a user is skipping a prompt while loops helps to force the user to
        // forcefully use the prompt or else the rest of the program won't work */
        
        // String name = "";
        
        // while(name.isEmpty()){
        //     System.out.print("Enter your name : ");
        //     name = scanner.nextLine();
        // }

        // System.out.println("Hello " + name);

        // scanner.close();


        // //PROGRAM 2 : INFINITE LOOP

        // while(1==1){
        //     System.out.println("HELP");


        //PROGRAM 3

        // int age = 0;

        // System.out.print("Enter your age : ");
        // age = scanner.nextInt();

        // while(age<0){
        //     System.out.println(" Not Applicable");
        //     System.out.print("Enter your age : ");
        //     age = scanner.nextInt();

        // }

        // System.out.println("You are " + age + " years old" );

        //PROGRAM 4: DO WHILE LOOP


        int num = 0;

        do{
            System.out.print("Enter a number between 1 - 10: ");
            num = scanner.nextInt();
        } while(num < 0 || num > 10 );

        System.out.println("You picked " + num);










        scanner.close();




        

    }
    
}
