public class TestMultiCatchAndRethrow {

    class ExA extends Exception {
    }

    class ExB extends Exception {
    }

    public void testMultiCatch() {

            final int a = 0;
            
            try {
                if (a == 0)  {
                    throw new ExA();
                }
                if (a == 1)  {
                    throw new ExB();
                }
            } catch (ExA|ExB ex) {
                System.out.println(ex.getClass() + " was thrown and caught");
            }

        }

    public void testReThrow() throws ExB {

        final int a = 0;

        try {
            if (a == 0) {
                throw new ExA();
            }
            if (a == 1) {
                throw new ExB();
            }
        } catch (final ExA exa) {
            System.out.println("Exa was caught");
        } catch (final Exception ex) {
            System.out.println(ex.getClass() + " was thrown, caught and rethrown");
            throw ex;
        }

    }

    public static void main(final String[] args) {
        final TestMultiCatchAndRethrow test = new TestMultiCatchAndRethrow();
        test.testMultiCatch();
        try {
            test.testReThrow();
        } catch (final ExB ex) {
            System.out.println(ex.getClass() + " was caught in main");
        }
    }
}
