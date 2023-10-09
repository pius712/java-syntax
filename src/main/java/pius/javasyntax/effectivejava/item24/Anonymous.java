package pius.javasyntax.effectivejava.item24;

public class Anonymous {

    private final String greet;

    public Anonymous(String greet) {
        this.greet = greet;
    }


    static String fnForFoo(IAnonymous anonymous) {
        return anonymous.apply();
    }
}
