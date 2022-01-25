package Test;

public class TestMetod {

    int x;
    int y;

    TestMetod(){
        this.x = x;
        this.y = y;
    }

    TestMetod(int x,int y){
        this.x = x;
        this.y = y;
    }
    TestMetod sum(TestMetod w){
        TestMetod rez = new TestMetod();
        rez.x = x + w.x;
        return rez;
    }

}
