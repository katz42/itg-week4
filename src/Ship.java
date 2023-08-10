public class Ship implements Flowable{
    @Override
    public void floating() {
        fuel();
        System.out.println("The ship floats across the globe.");
    }

    private void fuel(){
        System.out.println("A ship must be filled with fuel.");
    }
}
