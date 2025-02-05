public class Request {
    private static final String DIVIDER = "——————————————————————————————————————————————————————";
    public static void greeting () {
        System.out.println(DIVIDER);
        System.out.println("Hello! I'm Luke");
        System.out.println("What can I do for you?");
        System.out.println(DIVIDER);
    }

    public static void main(String[] args) {
        greeting();
    }
}
