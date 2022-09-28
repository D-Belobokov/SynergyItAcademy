package Lesson19_3_7Logger;

import java.io.IOException;
import java.util.logging.Logger;

public class MyLoggerRun {

    private static final Logger logger = Logger.getLogger(MyLoggerRun.class.getName());
    public static void main(String[] args) throws IOException {

        logger.warning(" warning");

        Thread t1 = new ClassLog(" поток 1 ");
        Thread t2 = new ClassLog(" поток 2 ");
        Thread t3 = new ClassLog(" поток 3 ");

        t1.start();
        t2.start();
        t3.start();



    }
}
