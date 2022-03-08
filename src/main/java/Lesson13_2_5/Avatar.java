package Lesson13_2_5;

import java.math.BigDecimal;

public class Avatar {
    public final String fio;
    private BigDecimal score = BigDecimal.valueOf(0.0);

    public Avatar(String fio){
        this.fio = fio;
        this.score = score;
    }
     BigDecimal topUp(BigDecimal size){            // пополнить счет
         score = score.add(size);
         System.out.println(" на вашем счете " + score);
         return score;
     }
     public BigDecimal takeOff(BigDecimal size){
         score = score.subtract(size);
         System.out.println(" на вашем счете " + score);
         return score;
     }
     public void print(){
         System.out.println(score);
     }
}
