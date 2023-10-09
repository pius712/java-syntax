package pius.javasyntax.effectivejava.item34;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {

    @Test
    @DisplayName("상수는 enum 클래스의 인스턴스이다.")
    void isConstantInstanceofEnumClass() {
        Boolean isConstantInstanceofEnumClass = Planet.EARTH instanceof Planet;

        Assertions.assertThat(isConstantInstanceofEnumClass).isTrue();
    }

    @Test
    @DisplayName("메서드를 정의할 수 있다.")
    void canDeclareMethod() {
        String hello = Planet.MERCURY.hello();
        Assertions.assertThat(hello).isEqualTo("my name is mercury");
    }

    @Test
    @DisplayName("values로 순회할 수 있다")
    void valuesTest() {
        for (Planet value : Planet.values()) {
            System.out.println(value.toString());
        }
    }

    @Test
    @DisplayName("추상 메서드를 재정의하여 사용할 수 있다")
    void canOverrideAbstract() {
        String greet = Planet.VENUS.greet();

        Assertions.assertThat(greet).isEqualTo("I am venus");
    }

    @Test
    @DisplayName("from string test")
    void fromString() {
        Optional<Planet> earth = Planet.fromString("EARTH");
        Planet planet = earth.get();
        System.out.println(planet);
    }
}