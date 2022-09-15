package Lesson16_3_3.Test;
import java.util.ArrayList;
import java.util.List;

public class ListCats {
    List CatList;

    ListCats(){
        this.CatList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return  "CatList=" + CatList +
                '\'' +
                '}';
    }
}
