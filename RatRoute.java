import java.util.*;
public class RatRoute {
    public int myCheeseRow;
    public int myCheeseCol;
    public char[][]myBoard;

    public int numRoutes(String[] enc) {
        // fill in this method (and others you can write)
        int ratRow = 0;
        int ratCol = 0;
        myBoard = new char[enc.length][enc[0].length()];
        for(int r = 0; r<myBoard.length; r++){
            for(int c = 0; c<myBoard[0].length;c++){
                myBoard[r][c] = enc[r].charAt(c);
                if(myBoard[r][c] == 'R'){
                    ratRow = r;
                    ratCol = c;
                }
                if (myBoard[r][c]=='C'){
                    myCheeseRow = r;
                    myCheeseCol = c;
                }
            }
        }
        return moveCount(ratRow,ratCol);
    }


    private int moveCount(int r, int c){
        if(r<0||c<0||r>=myBoard.length||c>=myBoard[0].length){
            return 0;
        }
        if(myBoard[r][c]=='X'){
            return 0;
        }
        if(r==myCheeseRow&&c==myCheeseCol){
            return 1;
        }

        int dn = cheeseDistance(r,c);
        int[] dRow = {-1,0,0,1};
        int[] dCol = {0,-1,1,0};
        int total = 0;
        for(int k = 0; k<4; k++){
            int nr = r+dRow[k];
            int nc = c+dCol[k];
            if(cheeseDistance(nr,nc)<dn){
                total = total + moveCount(nr,nc);
            }
        }
        return total;
    }

    private int cheeseDistance(int r, int c){
        return Math.abs(myCheeseRow-r)+Math.abs(myCheeseCol-c);
    }



}