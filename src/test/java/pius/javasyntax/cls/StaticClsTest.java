package pius.javasyntax.cls;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaticClsTest {

    @Test
    public void hello() {

        StaticCls.Foo foo = new StaticCls.Foo();
        String actual = foo.staticHello();

        Assertions.assertThat(actual).isEqualTo("hello");
    }

}