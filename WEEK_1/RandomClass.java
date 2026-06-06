import java.util.Random;

public class RandomClass {
    public static void main(String[] args){

        Random random = new Random();

        // int num;

        // num = random.nextInt(1, 10);



        Boolean isHeads;

        isHeads = random.nextBoolean();

        System.out.println(isHeads);

        if(isHeads){
            System.out.println("You Win");

        }
        else{
            System.out.println("You Lose");
        }
        




    }
    
}
