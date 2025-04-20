public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        boolean[][] mines = new boolean[m + 2][n + 2];
        
        int minesPlaced = 0;
        while (minesPlaced < k) {
            int x = 1 + (int) (Math.random() * m);
            int y = 1 + (int) (Math.random() * n);
            if (!mines[x][y]) {
                mines[x][y] = true;
                minesPlaced++;
            }
        }
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (mines[i][j]) {
                    System.out.print("*  ");
                } else {
                    int count = 0;
                    for (int x = i - 1; x <= i + 1; x++) {
                        for (int y = j - 1; y <= j + 1; y++) {
                            if (mines[x][y]) {
                                count++;
                            }
                        }
                    }
                    System.out.print(count + "  ");
                }
            }
            System.out.println();
        }
    }
}