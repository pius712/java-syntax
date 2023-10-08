package pius.javasyntax.cls;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonStaticTest {


    @Test
    public void nonStaticTest() {

        NonStatic.Foo foo = new NonStatic("hello").new Foo();
        String hello = foo.hello();

        Assertions.assertThat(hello).isEqualTo("hello");
    }

    @Test
    public void thisHello() {
        NonStatic.Foo foo = new NonStatic("hello").new Foo();
        String hello = foo.thisHello();
        Assertions.assertThat(hello).isEqualTo("innerHello");
    }

    @Test
    public void justHello() {
        NonStatic.Foo foo = new NonStatic("hello").new Foo();
        String hello = foo.justHello();
        Assertions.assertThat(hello).isEqualTo("innerHello");
    }
}