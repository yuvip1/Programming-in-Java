package WEEK_2; 

/*using package You can run directly through parent folder
cd ..  to go back to parent folder
in package we use javac WEEK_2\StringMethods.java
java WEEK_2.StringMethods */

public class StringMethods {
    public static void main(String[] args){
        String name = "   Yuvrajjj   ";
        
        int length = name.length();   // .length(); shows the length of characters in a string
        char letter = name.charAt(0); // .charAt(); gives the character at the given index (0), 0 is first index/position)
        int index = name.indexOf("v"); // .indexOf gives the character at given index("")
        int lastIndex = name.lastIndexOf("j"); //.lastIndex(); gives the last index of a letter if there are multiple letters
        
        //PROGRAM 1

        // name = name.toUpperCase(); //this changes all the characters to UPPERCASE
        // name = name.toLowerCase(); //This changes all the characters to lowercase
        // name = name.trim(); //this trims any spaces
        // name = name.replace("rajjj" , "iii"); //this is used to replace

        // System.out.println(name.isEmpty()); //this show whether the string is empty or not


        //PROGRAM 2
        
        // if(name.contains("")){
        //     System.out.println("Your name contains a space");
        // } 
        // else {
        //     System.out.println("Your name does not contain any space");

        // }

        
        System.out.println( length); 
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name);
    }
    
}
