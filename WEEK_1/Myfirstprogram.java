import java.util.Scanner;
public class Myfirstprogram {
    public static void main(String[] args){

        // String name = "Yuvraj";
        // String Charr = "Good";
        // int age = 21;
        // char currency = '$';
        // boolean isStudent= true;

        // System.out.println( name );
        // System.out.println("He is " + name +  " and he is " + Charr + " and his age is " + age );
      
        // Scanner Class

        Scanner scanner = new Scanner(System.in);

        // System.out.print(" Enter your Name: ");
        // scanner.nextLine();

        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.print("Enter your Age: ");
        int Age = scanner.nextInt();
        System.out.println("Your age is " + Age);  
        
        System.out.print("Your GPA: ");
        double GPA = scanner.nextDouble();
        System.out.println("Your GPA is " + GPA);

        System.out.print("Are you Gay? (true/false): " );
        boolean isGay = scanner.nextBoolean();
        System.out.println("Gay:" + isGay);
        
        if(isGay){
            System.out.println("You are Gay");
        }
        else{
            System.out.println("You are still Gay");
        }

        scanner.close();


        
    }
    
}
