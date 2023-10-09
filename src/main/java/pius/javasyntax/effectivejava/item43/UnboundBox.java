package pius.javasyntax.effectivejava.item43;

public class UnboundBox {

    private final Unbound bound;

    public UnboundBox(Unbound bound) {
        this.bound = bound;
    }

    public Unbound getBound() {
        return bound;
    }

    public void change(UnboundOperand operand) {
        operand.apply(bound);
    }
}

interface UnboundOperand {
    void apply(Unbound unbound);
}