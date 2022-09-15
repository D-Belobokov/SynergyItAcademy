package Lesson16_3_3.Test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class TestA {
    public static void main(String[] args) {
        ArrayList<Cat> catsList = new ArrayList();
        catsList.add(new Cat(" Barsik ", 4));
        catsList.add(new Cat(" Rygik ", 5));
        catsList.add(new Cat(" Pushok ", 7));

        List<Cat> friendsTemp = new ArrayList<>();
        friendsTemp.add(new Cat(" Kesha ", 12));
        friendsTemp.add(new Cat(" Murzik ", 10));
        friendsTemp.add(new Cat(" Musya ", 11));

        Random random = new Random();

        for (int i = 0; i < catsList.size(); i ++){
            int r = random.nextInt(friendsTemp.size());
            catsList.get(i).friends.add(friendsTemp.get(r));
        }

        Iterator iteratorList = catsList.iterator();
        while (iteratorList.hasNext()) {
            System.out.println(iteratorList.next());
        }
    }
}
