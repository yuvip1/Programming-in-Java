import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What do you wan to buy ? : ");
        item = scanner.nextLine();

        System.out.print("What quantity you want to buy? : ");
        quantity = scanner.nextInt();

        System.out.print("What is the price? : " + currency);
        price = scanner.nextDouble();

        // System.out.println(currency + "" + price);

        total = price * quantity;

        System.out.println("item: " + item);
        
        System.out.println("price: " + currency + "" + price);
        System.out.println("quantity: " + quantity);
        

        // System.out.println( total);
        System.out.println("total amount: " + currency + "" + total );




        scanner.close();



    }
    
}
