import java.util.Scanner;
public class IfState {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int age;

        System.out.println("Enter your age: ");
        age = sc.nextInt();

        // int age = -1;

        if(age < 0){
            System.out.println("You are not born yet.");

        }
        else if(age == 0){
            System.out.println("You are a baby");
        }

        if (age > 0){
            System.out.println("You are born");

        }
        else if(age == 0){
            System.out.println("You are just a baby");
        }
        

        if(age > 18){
            System.out.println("You are an adult");
        }
        else if(age < 18){
            System.out.println("You are a minor");

        }
        if(age > 50){
            System.out.println("You are old");

        }
        else if(age > 60 ){
            System.out.println("you are very old");
        }

        sc.close();
         
    }
    
}
