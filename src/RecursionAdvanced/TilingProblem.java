package RecursionAdvanced;

public class TilingProblem {
    public static int placeTile(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        int horizontalPlacement = placeTile(n - 1, m);
        int verticalPlacement = placeTile(n - m, m);
        return horizontalPlacement + verticalPlacement;
    }

    public static void main(String[] args) {
        int count = placeTile(4, 2);
        System.out.println(count);
    }
}
