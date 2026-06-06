import java.util.Scanner;
public class FitTrack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double weight;
        double height;
        double BMI;

        System.out.print("Height: ");
        height = sc.nextDouble();

        System.out.print("weight: ");
        weight = sc.nextDouble();

        BMI = weight/(height*height);

        System.out.print("BMI: " + BMI);
        
        sc.close();



    

    }

    
}

