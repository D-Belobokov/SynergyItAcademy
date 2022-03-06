import java.math.BigDecimal;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        BigDecimal score = new BigDecimal("100.50");
        BigDecimal cash = new BigDecimal("10.50");
        System.out.println(score.add(cash));

        Scanner scanner = new Scanner(System.in);
        System.out.println(" жми ");
        String x = scanner.nextLine();
        BigDecimal t = new BigDecimal(x.toString());
        System.out.println(t);

    }
}
