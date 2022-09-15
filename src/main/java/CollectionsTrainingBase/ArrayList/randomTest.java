package CollectionsTrainingBase.ArrayList;

import java.util.Random;

public class randomTest {
    public static void main(String[] args) {
        Random random = new Random();
       // int x = random.nextInt(100);
        for (int i = 0; i < 10; i ++){
            int x = random.nextInt(100);
            System.out.println(x);
        }
    }
}
