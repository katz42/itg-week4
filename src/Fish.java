public class Fish implements Flowable{
    @Override
    public void floating() {
        eat();
        System.out.println("Fish float in the sea.");
    }

    private void eat(){
        System.out.println("First eat.");
    }
}