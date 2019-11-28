public class GridGame {
    char[][] mygrid;

    public int winningMoves(String[] gridInput) {
        int row = 0;
        mygrid = new char[4][4];
        for (String str : gridInput) {
            for (int col = 0; col < 4; col++) {
                mygrid[row][col] = str.charAt(col);
            }
            row++;
        }
        return winCount();
    }

    private boolean canPlace(int row, int col) {
        if (mygrid[row][col] == 'X') return false;

        int[] rowDelta = {0, 0, 1, -1};
        int[] colDelta = {1, -1, 0, 0};

        for (int i = 0; i < 4; i++) {
            int r = row + rowDelta[i];
            int c = col + colDelta[i];
            if (inBound(r, c)) {
                if (mygrid[r][c] == 'X')
                    return false;
            }
        }

        return true;
    }

    private boolean inBound(int row, int col) {
        return row >= 0 && row < 4 && col >= 0 && col < 4;
    }

    private int winCount() {
        int winCount = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (canPlace(row, col)) {
                    mygrid[row][col] = 'X';
                    if (winCount() == 0) {
                        winCount++;
                    }
                    mygrid[row][col] = '.';
                }
            }
        }
        return winCount;
    }
}