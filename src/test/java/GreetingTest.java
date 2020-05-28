import org.junit.jupiter.api.*;

class GreetingTest {
    Greeting greeting;

    @BeforeAll
    public static void beforeClass(){
        System.out.println("Before - I am only called once");
    }
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

    @AfterEach
    void tearDown() {
        System.out.printf("In After Each.......");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("AfterAll - I only called once");
    }
}