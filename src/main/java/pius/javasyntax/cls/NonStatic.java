package pius.javasyntax.cls;

public class NonStatic {

    private final String greet;

    public NonStatic(String greet) {
        this.greet = greet;
    }

    class Foo {

        public String hello()  {
            return greet;
        }
    }
}
