package Lesson13_2_5;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Blocked {
    String value();

    String massage = " операция недоступна ";

}
