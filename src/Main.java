public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Story story = new Story();
        Fish fish = new Fish();
        Ship ship = new Ship();
        Balloon balloon = new Balloon();

        FloatExecutor floatExecutor = new FloatExecutor();

        floatExecutor.makeFloat(human);
        floatExecutor.makeFloat(story);
        floatExecutor.makeFloat(fish);
        floatExecutor.makeFloat(ship);
        floatExecutor.makeFloat(balloon);
    }
}