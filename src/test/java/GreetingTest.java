import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingTest {
    Greeting greeting;
    @BeforeEach
    void setUp() {
        greeting = new Greeting();
        System.out.println("In Before Each...");
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorldNoName());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorldWithName(" Carol"));
    }
}