import java.util.Scanner;
public class ScannerClass {
    public static void main(String [] args){

        // Scanner Class
        /*SYNTAX:
        
        import java.util.Scanner;
        Scanner sc = new Scanner(System.in);
        
        soutprint(); 
        String name = sc.nextLine(); -> allows users to give input
        
        sc.close();*/

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
    
