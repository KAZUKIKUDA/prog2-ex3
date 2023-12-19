package mob3;
import java.util.Random;

public class Dice {
    private int value;
    Dice(){
        this.value = play();
    }

    int play(){
        Random rand = new Random();
        int number  = rand.nextInt(1,7);
        return number;
    }
    int getValue(){
        return value;
    }
    
}
