package Lesson13_2_5;

import Lesson13_2_5.Inerface.AvatarInterface;

import java.math.BigDecimal;

public class Avatar implements AvatarInterface {
    private String fio;
    private BigDecimal score = BigDecimal.valueOf(0.0);

    public Avatar(String fio) {
        this.fio = fio;
        this.score = score;
    }

    public Avatar() {
        this.fio = fio;
        this.score = score;
    }

    /**
     * @param size
     * @return score after replenishment(vnesti dengi)
     */
    @Blocked("Операция недоступна")
    @Override
    public final void topUp(BigDecimal size) {            // пополнить счет
        score = score.add(size);
        System.out.println(fio + " на вашем счете " + score);

    }

    @Override
    @Blocked("Операция недоступна")
    public final void takeOff(BigDecimal size) {         // снять со счета
        score = score.subtract(size);
        System.out.println(fio + " на вашем счете " + score);

    }

    public void print() {
        System.out.println(fio + " на вашем счете " + score);
    }
}
