public class Greeting {

    private static final String HELLO = "Hello";
    private static final String WORLD = "World";

    public String helloWorldNoName() {
        return HELLO + "" + WORLD;
    }

    public String helloWorldWithName(String name) {
        return HELLO + "" + name;
    }

}
