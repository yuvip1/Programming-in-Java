package WEEK_3;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows;  
        int columns;  
        char symbol;  

        System.out.print("Enter rows: ");
        rows = sc.nextInt();
        System.out.print("Enter columns: ");
        columns = sc.nextInt();
        System.out.print("Enter char: ");
        symbol = sc.next().charAt(0);

        for(int j=0; j<rows; j++){
            
                for(int i=0; i<columns; i++){
                    System.out.print(symbol + " ");
            

        }
        System.out.println();
        }
       


    
    }
    
}
