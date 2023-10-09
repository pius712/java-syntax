package pius.javasyntax.effectivejava.item34;

import jdk.dynalink.Operation;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public enum Planet {
    MERCURY(1, "mercury") {
        @Override
        public String greet() {
            return "I am " + this.name;
        }
    },
    VENUS(3, "venus") {
        @Override
        public String greet() {
            return "I am " + this.name;
        }
    },
    EARTH(5,"earth") {
        @Override
        public String greet() {
            return "I am " + this.name;
        }
    };

    public long age;
    public String name;

    public String extra;
    Planet(long age, String name) {
        this.age = age;
        this.name = name;

    }

    public String hello() {
        return "my name is" + " " + name;
    }

    public abstract String greet();

    private static final Map<String, Planet> stringToEnum =
            Stream.of(values())
                    .collect(
                            toMap(Object::toString, e->e));

    public static Optional<Planet> fromString(String planet) {
        return Optional.ofNullable(stringToEnum.get(planet));
    }
}
