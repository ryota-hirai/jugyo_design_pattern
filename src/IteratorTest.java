import java.util.Collections;

public class IteratorTest {
    public static void main(String[] args) {
        GameListAggregate gameListAggregate = new GameListAggregate();
        Iterator iterator = gameListAggregate.createIterator();

        gameListAggregate.add(new Game("Data1", 3700));
        gameListAggregate.add(new Game("Data2", 3700));
        gameListAggregate.add(new Game("Data3", 5400));
        gameListAggregate.add(new Game("Data4", 5200));

        gameListAggregate.sort();

        iterator.first();
        while (!iterator.isDone()) {
            Game game = (Game)iterator.getItem();
            System.out.println("{" + game.getName() + ", " + game.getPrice() + "}");
            iterator.next();
        }
    }
}
