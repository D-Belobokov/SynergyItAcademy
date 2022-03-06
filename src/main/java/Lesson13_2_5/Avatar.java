package Lesson13_2_5;

import java.math.BigDecimal;

public class Avatar {
    String fio;
    BigDecimal score = BigDecimal.valueOf(0);

    public Avatar(){
        this.fio = fio;
        this.score = score;
    }

    public Avatar(String fio,BigDecimal score){
        this.fio = fio;
        this.score = score;
    }
     public BigDecimal insite(BigDecimal v){
             score = score.add(v);
         System.out.println(" на вашем счете " + score);
         return score;
     }
}
