public class Request {
    private static final String DIVIDER = "——————————————————————————————————————————————————————";
    public static void greeting () {
        System.out.println(DIVIDER);
        System.out.println("Hello! I'm Luke");
        System.out.println("What can I do for you?");
        System.out.println(DIVIDER);
    }

    private static void goodbye() {
        System.out.println("Bye");
        System.out.println("Time to sleep!");
    }

    private static void introduction() {
        System.out.println("I can help you to manage your tasks!");
        System.out.println("I hope that I'm useful to you.");
    }

    public static void main(String[] args) {
        greeting();
        goodbye();
    }

}
