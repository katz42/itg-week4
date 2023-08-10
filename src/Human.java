public class Human implements Flowable {
    @Override
    public void floating() {
        coffee();
        System.out.println("A person floats into a room full of people.");
    }

    private void coffee(){
        System.out.println("First coffee.");
    }
}