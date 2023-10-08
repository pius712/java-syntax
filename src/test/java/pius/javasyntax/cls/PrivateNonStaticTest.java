package pius.javasyntax.cls;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrivateNonStaticTest {


    @Test
    public void privateNonStatic()  {

        PrivateNonStatic privateNonStatic = new PrivateNonStatic("hello");

        // public Foo 는 생성 가능
        PrivateNonStatic.PublicFoo publicFoo = privateNonStatic.new PublicFoo();

        Assertions.assertThat(publicFoo.hello()).isEqualTo("hello");
        Assertions.assertThat(publicFoo.fooStaticHello()).isEqualTo("fooStatic");
    }
}