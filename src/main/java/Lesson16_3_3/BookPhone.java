package Lesson16_3_3;

import java.util.*;

public class BookPhone {
    final static int bookSize = 100;
    Abonent[]bookArr;
   List list;
   Set set;
   Map map;

   void addArr(){
        bookArr = new Abonent[bookSize];
       for(int v = 0; v < bookSize; v ++){
           bookArr[v] = new Abonent();
       }
   }

    void addList(){
       list = new ArrayList<>();

       for (int i = 0; i < bookSize;i ++){
           list.add(new Abonent());
           }
       for (int j = 0; j < bookSize; j ++){
            Random random = new Random();
            int rf = random.nextInt(bookSize);

           }
       }


      // Random random = new Random();

     /*  for (int f = 0;f < 5; f ++){
           int ra = random.nextInt(bookSize);
           Abonent abonentSecond = (Abonent) list.get(ra);
           int rf = random.nextInt(bookSize);
           abonentSecond.listFriends.set(rf,list);
           list.set(ra,abonentSecond);

       }

      */

    void addSet(){
        set = new HashSet<>();
        for (int j = 0; j < bookSize;j ++){
            set.add(new Abonent());
        }
    }
    void addMap(){
       map = new HashMap();
       for (int k = 0; k < bookSize; k ++){
           map.put(k,new Abonent());
       }
    }

    @Override
    public String toString() {
        return "BookPhone{" +
                "bookArr=" + Arrays.toString(bookArr) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                '}';
    }
}
