package Lesson13_2_5.Inerface;

import Lesson13_2_5.Blocked;

import java.math.BigDecimal;

public interface AvatarInterface {
    @Blocked("!")
    void topUp(BigDecimal size);

    @Blocked("!")
    void takeOff(BigDecimal size);
}



