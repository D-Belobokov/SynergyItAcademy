package Lesson16_3_3;
import java.util.*;

public class TelephoneBookRunner {
    public static void main(String[] args) {

        final int sz = 100; // размер массива и коллекций
        Abonent[] arrAbonent = new Abonent[sz];
        List<Abonent> abonentList = new ArrayList<>(sz);
        Set<Abonent> abonentSet = new HashSet<>(sz);
        Map<Integer, Abonent> abonentMap = new HashMap<>(sz);
        Random random = new Random();
        int sizeListFriends = 20;

        List<Abonent> friendsList = new ArrayList<>();        // заполняем лист с друзьями.используем далее для arr,list,set,map
        for (int i = 0; i < sizeListFriends; i++) {
            friendsList.add(new Abonent());
        }

        for (int ar = 0; ar < arrAbonent.length; ar ++){       // заполняем массив абонентами
            arrAbonent[ar] = new Abonent();
        }
        for (int af = 0; af < arrAbonent.length; af ++){
            /* заполням list с друзьями для каждого абонента массива
            далее по анологии заполняем list,set,map
            */
            for (int fr = 0; fr < 3; fr ++) {
                // выборка случайных абонентов в список друзей(случайный индекс)
                int arRand = random.nextInt(sizeListFriends);
                arrAbonent[af].listFriends.add(friendsList.get(arRand));
            }
        }
        //for (Abonent abonent:arrAbonent){
        //    System.out.println(" arr " + abonent);
        //}
        System.out.println("#############################################################");
        for (int f = 0; f < sz; f ++){
            abonentList.add(new Abonent());
        }
        for (int j = 0; j < sz; j++) {
            for(int w = 0; w < 3; w ++ ) {
                int rd = random.nextInt(sizeListFriends);
                abonentList.get(j).listFriends.add(friendsList.get(rd));
            }
        }
        /*
        Iterator iterator = abonentList.iterator();
        while (iterator.hasNext()) {
            System.out.println("List");
            System.out.println(iterator.next());
        }

         */
        System.out.println("##############################################################");
        for (int aset = 0; aset < sz; aset ++ ){
            abonentSet.add(new Abonent());
        }
        Abonent[]aTempSetArr = new Abonent[abonentSet.size()];
        abonentSet.toArray(aTempSetArr); // преобразовали set в массив

        for (int m = 0; m < sz; m ++){          //заполняем map
            abonentMap.put(m,new Abonent());
        }

        for (int ma = 0;ma < sz; ma ++){
            for (int mf = 0; mf < 3; mf ++){
                int mrd = random.nextInt(sizeListFriends);
                abonentMap.get(ma).listFriends.add(friendsList.get(mrd));
            }
        }
        //System.out.println(abonentMap);
        //System.out.println("###############################################################");

        for (int a = arrAbonent.length - 1;a >= 0; a --){     // проход массива в обратром порядке

        }

    }
}


