package WEEK_4;
import java.util.Arrays;
public class Array {
    public static void main(String [] args){
        
        String[] fruits = {"Apple", "Orange", "Grapes"};
        
        System.out.println(fruits[0]); //for printing assigned index of an array
        
        int NumFruits = fruits.length; //to get length of an array
        System.out.println(NumFruits);

        for(int i=0; i<fruits.length; i++){
            System.out.println(fruits[i]);
        }

        Arrays.fill(fruits, "Pine"); //to replace all the elements in an array with specific element
        
        for(String fruit : fruits){
            System.out.println(fruit); //enhanced for loop for each loop
        }
        
        Arrays.sort(fruits); //to sort alphabetically
        
    }
    
}
