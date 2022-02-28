package Lesson10_2_2;

public class Main {
    public static void main(String[] args) {
        String test = " я куплю тебе змею или черепаху ";
        String[] words = test.split(" ");
        for (String word:words){
            System.out.println(word);
        }
    }
}
