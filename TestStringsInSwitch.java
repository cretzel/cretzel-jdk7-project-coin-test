public class TestStringsInSwitch {

    public void test() {
        final String str = "foo";

        switch (str) {
        case "foo":
            System.out.println("mooh");
            break;
        case "bar":
            System.out.println("miau");
            break;
        default:
            break;
        }

    }

    public static void main(final String[] args) {
        new TestStringsInSwitch().test();
    }
}
