public class Balloon implements Flowable {
    @Override
    public void floating() {
        helium();
        System.out.println("Balloons slowly float upward.");
    }

    private void helium(){
        System.out.println("All balloons must be filled with helium.");
    }
}