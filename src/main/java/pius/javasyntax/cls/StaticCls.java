package pius.javasyntax.cls;

public class StaticCls {

    private final String greet;

    private static final String staticGreet = "hello";
    public StaticCls(String greet) {
        this.greet = greet;
    }

    static class Foo {
        public String hello() {
            return "";
//            return g
        }

        public String staticHello() {
            return staticGreet;
        }
    }
}
