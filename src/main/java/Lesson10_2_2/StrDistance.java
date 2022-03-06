package Lesson10_2_2;

public class StrDistance {
    void StrMinMax(String string) {
        String min = "";
        String max = "";
        int tempMin = string.length();
        int tempMax = 0;
        String[] words = string.split(" ");

        for (String word : words) {
            if (word.length() < tempMin) {
                min = word;
                tempMin = word.length();
            }
            if (word.length() > tempMax) {
                max = word;
                tempMax = word.length();
            }
        }
        System.out.println(" min = " + min.length());
        System.out.println(" max = " + max.length());
    }
}

