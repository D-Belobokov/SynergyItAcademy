package Test;

public class Main {
    public static void main(String[] args) {
       TestMetod sfg1 = new TestMetod(5,4);
       TestMetod sfg2 = new TestMetod(3,9);

       TestMetod mylti = new TestMetod();
       mylti = sfg1.sum(sfg2);
        System.out.println(mylti.x);
    }
}
