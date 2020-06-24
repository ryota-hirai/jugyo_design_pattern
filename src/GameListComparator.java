import java.util.Comparator;

class GameListComparator implements Comparator<Game> {

    @Override
    public int compare(Game o1, Game o2) {
        return o1.getPrice() < o2.getPrice() ? -1 : 1;
    }
}
