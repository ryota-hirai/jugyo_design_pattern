class GameListIterator implements Iterator {
    private final GameListAggregate aggregate;
    private int current;

    public GameListIterator(GameListAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public void first() {
        current = 0;
    }

    @Override
    public void next() {
        current = current + 1;
    }

    @Override
    public boolean isDone() {
        return current >= aggregate.getNumberOfStock();
    }

    @Override
    public Object getItem() {
        return aggregate.getAt(current);
    }
}
