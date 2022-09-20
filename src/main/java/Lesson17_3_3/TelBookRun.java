package Lesson17_3_3;

import java.util.*;

public class TelBookRun {
    public static void main(String[] args) {
        int sizeBook = 100;
        int sizeListFriends = 20;
        Random random = new Random();
        Abonent[] abonentArr = new Abonent[sizeBook];
        for (int i = 0; i < abonentArr.length; i++) {
            abonentArr[i] = new Abonent();
        }
        // заполняем лист с друзьями.используем далее для arr,list,set,map
        List<Abonent> friendsList = new ArrayList<>();
        for (int j = 0; j < sizeListFriends; j++) {
            friendsList.add(new Abonent());
        }
        // заполняем список друзей у абонентов. индекс берем рандомно(int randomFriends),
        // дергаем друзей из массива abonentArr

        for (int f = 0; f < abonentArr.length; f++) {
            for (int fl = 0; fl < 5; fl++) {
                int randomFriends = random.nextInt(sizeListFriends);
                abonentArr[f].listFriends.add(friendsList.get(randomFriends));
            }
        }
        //преобразовываем массив в arrayList
        ArrayList<Abonent> abonentList = new ArrayList<>();
        Collections.addAll(abonentList, abonentArr);

        //преобразовываем массив в Set
        Set<Abonent> abonentSet = new LinkedHashSet<>(List.of(abonentArr));

        //преобразовываем массив в Map
        Map<Integer, Abonent> abonentMap = new HashMap<>();
        for (int m = 0; m < abonentArr.length; m++) {
            abonentMap.put(m, abonentArr[m]);
        }
        int randomSearch = random.nextInt(sizeListFriends);
        //случайный абонент для поиска в списках друзей
        Abonent randomAbonent = friendsList.get(randomSearch);

        System.out.println(" ищем по массиву Arr  ###########################");
        long startTimeArr = System.nanoTime();  //  <- точка начала замера времени выполнения метода
        for (Abonent a:abonentArr){
            boolean arrFl = a.listFriends.contains(randomAbonent);
            if(arrFl){
                System.out.println(" у абонента (arr) " + a.name + " в списке друзей НАЙДЕН друг " + "\n" + randomAbonent);
            }else System.out.println( " у абонента(arr) " + a.name + " \n " + " друг отсутствует");
        }
        long endTimeArr = System.nanoTime();

        System.out.println(" ищем по списку List ###########################");
        long startTimeList = System.nanoTime();
        for (Abonent l:abonentList){
            boolean lFl = l.listFriends.contains(randomAbonent);
            if(lFl){
                System.out.println(" у абонента(list) " + l.name + " в списке друзей НАЙДЕН друг " + "\n" + randomAbonent);
            }else System.out.println( " у абонента(list) " + l.name + " \n " + " друг отсутствует");
        }
        long endTimeList = System.nanoTime();

        System.out.println(" ищем по можеству Set ###########################");
        long startTimeSet = System.nanoTime();
        for (Abonent s:abonentSet){
            boolean setFl = s.listFriends.contains(randomAbonent);
            if (setFl){
                System.out.println( " у абонента(set) " + s.name + " в списке друзей НАЙДЕН друг " + "\n" + randomAbonent );
            }else System.out.println( " у абонента(set) " + s.name + " \n " + " друг отсутствует");
        }
        long endTimeSet = System.nanoTime();

        long startTimeMap = System.nanoTime();
        for (Map.Entry m: abonentMap.entrySet()){
            if(abonentMap.containsValue(randomAbonent)){
                System.out.println(" у абонента(map) " + m.setValue(randomAbonent) + " в списке друзей НАЙДЕН друг " + "\n" + randomAbonent);
            }else System.out.println(" у абонента(map) " + m.setValue(randomAbonent) + "\n" + "друг отсутствует ");
        }
        long endTimeMap = System.nanoTime();

        long durationArr = (endTimeArr - startTimeArr) / 1000000;
        long durationList = (endTimeList - startTimeList) / 1000000;
        long durationSet = (endTimeSet - startTimeSet) / 1000000;
        long durationMap = (endTimeMap - startTimeMap) / 1000000;
        System.out.println(" ВРЕМЯ ПОИСКА ПО МАССИВУ = " + durationArr + " ms ");
        System.out.println(" ВРЕМЯ ПОИСКА ПО LIST = " + durationList + " ms ");
        System.out.println(" ВРЕМЯ ПОИСКА ПО SET = " + durationSet + " ms ");
        System.out.println(" ВРЕМЯ ПОИСКА ПО MAP = " + durationMap + " ms ");
    }
}
