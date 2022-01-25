package Test;

import java.util.Random;

public class Engine {
    int num;
    int workTotal;
    int lengthArr;
    int[] eArr;

    public Engine(){
        Random r = new Random();
        num = r.nextInt(100);
        workTotal = r.nextInt(100);
        lengthArr = 2;
        eArr = new int[this.lengthArr];
    }
}
