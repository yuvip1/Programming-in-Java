public class PrintF {

    /*  "%flags", + variablename
    for String = %s
    for char = %c
    for int = %d
    for double = %f
    for boolean = %b */

    public static void main(String[] args){

        // String name = "Yuvraj";
        // char surname = 'P';
        // int age = 21;
        // double height = 5.4;
        // boolean isEmployed =false;

        // System.out.printf("Hello I'm %s\n", name);
        // System.out.printf("My surname starts with %c\n", surname);
        // System.out.printf("My age is %d\n", age);
        // System.out.printf("My height is %f\n", height);
        // System.out.printf("Am I employed? %b\n", isEmployed);


        //Presicion (between % and f)
        /* 
        // .1%s precises the decimal to 1 digit 
        // + = output a plus (to show  +ve sign)
        // , = to group 
        // ( = to show -ve number enclosed in ()
        // space = display a -ve sign if negative, space if positive
        */
        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.15;

        System.out.printf("%(.1f\n", price1);
        System.out.printf("%(.1f\n", price2);
        System.out.printf("%(.1f\n", price3);
        

    }
    
}
