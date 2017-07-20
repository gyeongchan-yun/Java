public class Lion extends Animal implements Predator {
    public String getFood() {
        return "banana";
    }

    public void bark() {
        System.out.print("lion roar");
    }

}