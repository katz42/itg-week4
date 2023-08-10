public class Story implements Flowable {
    @Override
    public void floating() {
        creation();
        System.out.println("The story floats into a feed.");
    }

    private void creation(){
        System.out.println("A story must be created by a publicist.");
    }
}