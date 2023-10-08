package pius.javasyntax.cls;

public class PrivateNonStatic {
    private final String greet;

    public PrivateNonStatic(String greet) {
        this.greet = greet;
    }

    private class Foo {
        static final String fooGreet = "fooStatic";
        public String hello()  {
            return greet;
        }
        public String fooStaticHello() {
            return fooGreet;
        }
    }

    public class PublicFoo {
        static String fooGreet = "fooStatic";
        public String hello()  {
            return greet;
        }

        public String fooStaticHello(){
            return fooGreet;
        }
    }
}
