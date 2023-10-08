package pius.javasyntax.cls;

public class NonStatic {

    private final String greet;

    public NonStatic(String greet) {
        this.greet = greet;
    }

    class Foo {

        private String greet = "innerHello";
        public String hello()  {

            return NonStatic.this.greet;
        }

        public String thisHello() {
            return this.greet;
        }

        public String justHello() {
            return greet;
        }
    }
}
