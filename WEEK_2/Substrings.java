package WEEK_2;

import java.util.Scanner;
public class Substrings {
    public static void main(String[] args){

        
        
        // .substring(start, end) = A  method to extract a portion of a string

        // String email = "Yuvi@gmail.com";
        // String username = email.substring(0, 4);
        // String domain = email.substring(4, 14);


        // String email = "Yuvi@gmail.com";
        // String username = email.substring(0, email.indexOf("@")); //starting index is 0 and exclusive index is @
        // String domain = email.substring(email.indexOf("@") + 1 ); // +1 to exclude the inclusive index that is @


        Scanner sc = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");

        email = sc.nextLine();

        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println("Username: " + username);
            System.out.println("Domain: " + domain);
        }
        else{
            System.out.println("Email must contain @");
        }






    
       sc.close();
        
    }
    
}
