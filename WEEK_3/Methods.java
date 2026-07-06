package WEEK_3;

public class Methods {
    // public static void main(String[] args) {
        
    //     // method = a block of reusable code that is executed when called ()

    //     String name = "Yuvi";
    //     int age = 22;

    //     happyBirthday(name , age);

    // } 
    // static void happyBirthday(String name, int age){

    //     System.out.println("Happy Birthday to you");
    //     System.out.printf("Happy Birthday dear %s\n" , name);
    //     System.out.printf("You are %d years old\n" , age);
    //     System.out.println("Happy Birthday to you");

    // }
    


    //PROGRAM 2

    // public static void main(String[] args) {
        
    //     double result = square(3);
    //     System.out.println(result);
    // }
    // // static double square(double number){
    // //     return number * number;
    // }


    //PROGRAM 3 : OVERLOADED METHODS
    // Methods that share the same name but diff parameters
    //Each method has diff signatures so it is possible to create methods of same name
    //methods can have same name but must have diff paremeters

    public static void main(String[] args) {
        
        System.out.println(add(1, 2, 3));

    }
    static double add(double a, double b){
        return a+b;
    }
    static double add(double a, double b, double c){
        return a+b+c;
    }
}
