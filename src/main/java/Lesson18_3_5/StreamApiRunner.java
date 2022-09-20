package Lesson18_3_5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

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
        }catch (IOException e){
            e.printStackTrace();
            System.out.println(" файл не найден ");
        }
        // получаем string(из прочитанного файла)
        Path path = Path.of(fileInput);
        String textInput = String.valueOf(Files.readAllLines(path));
        String textForModify = textInput.replaceAll("[\\.\\,]","");

        //System.out.println(textInput);
        String[]textArr = textForModify.split(" ");
        Stream streamArr = Arrays.stream(textArr);
        streamArr.forEach(System.out::println);
        Map<Integer,String>mapText = new TreeMap<>();

    }
}
