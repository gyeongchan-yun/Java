class Updator {
    public void update(Counter obj){
        obj.count++;
    }
}

public class Counter{
    int count = 0;

    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println("before update: "+ myCounter.count);

        Updator myUpdator = new Updator();
        myUpdator.update(myCounter);
        System.out.println("after update: "+ myCounter.count);
    }
}