package pius.javasyntax.effectivejava.item43;

public class BoundBox {

    private final Bound bound;

    public BoundBox(Bound bound) {
        this.bound = bound;
    }

    public Bound getBound() {
        return bound;
    }

    public void change(Operand operand) {
        operand.apply(bound);
    }
}

interface Operand {
    void apply(Bound bound);
}
