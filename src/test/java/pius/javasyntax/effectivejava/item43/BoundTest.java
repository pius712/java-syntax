package pius.javasyntax.effectivejava.item43;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoundTest {


    @Test
    void boundTest() {
        BoundBox boundBox = new BoundBox(new Bound(100));

        Bound bound = new Bound(2);

        boundBox.change(bound::add);
        System.out.println(boundBox.getBound().getStored());
        System.out.println(bound.getStored());
    }
}