package Lesson16_3_3;

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
        Set<Abonent> abonentSet = Set.of(abonentArr);
        //преобразовываем массив в Map
        Map<Integer, Abonent> abonentMap = new HashMap<>();
        for (int m = 0; m < abonentArr.length; m++) {
            abonentMap.put(m, abonentArr[m]);
        }
        System.out.println("");
        int randomSearch = random.nextInt(sizeListFriends);
        //случайный абонент для поиска в списках друзей
        Abonent randomAbonent = friendsList.get(randomSearch);
        for (int x = abonentArr.length - 1; x >= 0; x --){
            if(abonentArr[x].listFriends.contains(randomAbonent))
                System.out.println(" в списке друзей абонента " + abonentArr[x] +'\n' + " найден друг " + randomAbonent);
            else System.out.println(" абонент не найден ");
        }
        System.out.println(" ищем по Set ###########################");
        for (Abonent a:abonentSet){
            boolean setFrL = a.listFriends.contains(randomAbonent);
            if (setFrL == true){
                System.out.println(" найден друг " + "\n" + randomAbonent + " у абонента " + a.name);
            }else System.out.println("!!! Ненайден друг " + "\n" + randomAbonent + " у абонента " + a.name);
        }
    }
}
