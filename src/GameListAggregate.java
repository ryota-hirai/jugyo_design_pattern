import java.util.ArrayList;
import java.util.Collections;

class GameListAggregate implements Aggregate {
    private final ArrayList<Game> list = new ArrayList<Game>();
    private int numberOfStock;

    @Override
    public Iterator createIterator() {
        return new GameListIterator(this);
    }

    public void add(Game game) {
        list.add(numberOfStock, game);
        numberOfStock = numberOfStock + 1;
    }
    public void sort() {
        Collections.sort(list, new GameListComparator());
    }

    public Object getAt(int number) {
        return list.get(number);
    }

    public int getNumberOfStock() {
        return numberOfStock;
    }

}
