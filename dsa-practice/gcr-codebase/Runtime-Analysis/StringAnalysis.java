public class StringAnalysis {

    static final int ITERATIONS = 1_000_000;

    public static void main(String[] args) {

        // -------- String (O(N^2)) --------
        long start = System.nanoTime();

        String s = "";
        for (int i = 0; i < ITERATIONS; i++) {
            s += "a";
        }

        long end = System.nanoTime();
        System.out.println("String Time: " + (end - start) + " ns");

        // -------- StringBuilder (O(N)) --------
        start = System.nanoTime();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ITERATIONS; i++) {
            sb.append("a");
        }

        end = System.nanoTime();
        System.out.println("StringBuilder Time: " + (end - start) + " ns");

        // -------- StringBuffer (O(N)) --------
        start = System.nanoTime();

        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < ITERATIONS; i++) {
            sbuf.append("a");
        }

        end = System.nanoTime();
        System.out.println("StringBuffer Time: " + (end - start) + " ns");
    }
}
