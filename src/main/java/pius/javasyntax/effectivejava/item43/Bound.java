package pius.javasyntax.effectivejava.item43;

public class Bound {

    private  int stored ;

    public Bound(int stored) {
        this.stored = stored;
    }

    public int getStored() {
        return stored;
    }

    public void add(Bound bound) {
        stored += bound.stored;
    }
}
