package pius.javasyntax.effectivejava.item43;

public class Unbound {


    private  int stored ;

    public Unbound(int stored) {
        this.stored = stored;
    }

    public int getStored() {
        return stored;
    }

    public void add(int a) {
        stored += 1 + 10;
    }
}
