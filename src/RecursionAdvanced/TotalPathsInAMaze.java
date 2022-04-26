package RecursionAdvanced;

public class TotalPathsInAMaze {

    public static int countPaths(int i, int j, int n, int m) {

        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        int rightPaths = countPaths(i, j + 1, n, m);
        int downPaths = countPaths(i + 1, j, n, m);
        return rightPaths + downPaths;
    }

    public static void main(String[] args) {
        int totalPath = countPaths(0, 0, 3, 3);
        System.out.println(totalPath);

    }
}
