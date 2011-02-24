public class TestIntegerLiterals {

    public void test() {
        
        final int large = 1_000_000;
        System.out.println(large);
        
        final int binary = 0b1011;
        System.out.println(binary);

    }

    public static void main(final String[] args) {
        new TestIntegerLiterals().test();
    }
}
