package Lesson8.Konverters;

import Lesson8.Enum.Koff;
import Lesson8.Konvert_InFs;

public class Konvert_F_K implements Konvert_InFs {

    @Override
    public double konverter(double rezlt) {
        return rezlt = ((rezlt + Koff.FAR_KEL.calc) * 5) / 9;
    }
}
