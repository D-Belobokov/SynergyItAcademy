package Lesson8.Konverters;

import Lesson8.Enum.Koff;
import Lesson8.Konvert_InFs;

public class Konvert_C_F implements Konvert_InFs {


    @Override
    public double konverter(double rezlt) {
        return rezlt = rezlt * Koff.CEL_FAR.calc + 32;
    }
}
