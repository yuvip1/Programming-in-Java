public class Arithmetic {
    public static void main(String[] args){

        // int x = 10;
        // int y = 5;

        // int z = x + y;

        // System.out.println(z);

        int x = 10;
        int y = 5;

        // x = x + y;
        // x += y;
        // x *= y;

        // x++;
        // x--;

        /* ORDER OF OPERATIONS (PEMDAS)
        P- PARANTHESIS()
        E- EXPONENTS
        M- MULTIPLY
        D- DIVIDE
        A- ADD
        S- SUBTRACT */

        double result = (x + y) - (x +y) / (x * y);
        

        System.out.println(result);



    }
    
}
