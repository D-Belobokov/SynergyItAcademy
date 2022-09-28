package Lesson18_3_5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class StreamApiRunner {
    public static void main(String[] args) throws IOException {
        String fileInput = "C:\\Users\\D.Belobokov\\Documents\\Учеба_Java\\text_for_read.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(fileInput);
            // используя bufferedInputStream вместо fileOutputStream сокращаем время выполнения
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int i;
            System.out.println(" * ниже вывод текста для обработки * ");
            while ((i = bufferedInputStream.read()) != -1) {
                System.out.print((char) i);
            }
            bufferedInputStream.close();
            System.out.println("\n" + "**************************************");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(" файл не найден ");
        }
        // получаем string(из прочитанного файла)
        Path path = Path.of(fileInput);
        String textInput = String.valueOf(Files.readAllLines(path));
        // убираем из текста знаки припинания
        String textModify = textInput.replaceAll("\\pP", "");
        /* загружаем текст в мапу, используя пробел как разделитель(метод regex)
           здесь ключ это string(слово из текста), при его повторении плюсуется значение Integer
         */
        Map<String, Integer> textMap = new TreeMap<>();
        for (String s : textModify.split(" ")) {
            textMap.put(s, textMap.getOrDefault(s, 0) + 1);
        }
        // удаляем пробелы в качестве ключа
        textMap.remove("");
        System.out.println(" * вывод количества слов в тексте * ");
        // сортируем мапу
        textMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);


    }
}
