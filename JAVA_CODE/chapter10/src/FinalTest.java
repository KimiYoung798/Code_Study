public class FinalTest {
    public static void main(String[] args) {
        final int i = 10;
        test(i);
    }

    public static void test(final int i) {
        System.out.println(i);
    }
}
