package Lesson8.Enum;

public enum Koff {
    CEL_FAR(1.8),
    CEL_KEL(273.15),
    KEL_FAR(273.15),
    FAR_KEL(459.67);

    public final double calc;

    private Koff(double calc){
        this.calc = calc;
    }
}

