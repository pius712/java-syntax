package pius.javasyntax.effectivejava.item43;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnboundTest {

    @Test
    void unboundTest() {

        Unbound unbound = new Unbound(100);
        UnboundBox unboundBox = new UnboundBox(unbound);

        unboundBox.change(Unbound::add);
        System.out.println(unbound.getStored());
    }

}