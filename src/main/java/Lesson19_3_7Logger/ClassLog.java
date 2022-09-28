package Lesson19_3_7Logger;

import Lesson7.Task;
import lombok.AllArgsConstructor;

import java.util.logging.Logger;

@AllArgsConstructor
public class ClassLog extends Thread {
    private final String name;
    private static final Logger loggerClassLog = Logger.getLogger(ClassLog.class.getName());

    @Override
    public void run() {

        System.out.println(" запущен поток " + name + " ID = " + getId());
    }
}
