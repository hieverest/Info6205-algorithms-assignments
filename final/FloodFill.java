import java.util.Arrays;

public class FloodFill {

    int[][] screen =   {{1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 0, 0},
                        {1, 0, 0, 1, 1, 0, 1, 1},
                        {1, 2, 2, 2, 2, 0, 1, 0},
                        {1, 1, 1, 2, 2, 0, 1, 0},
                        {1, 1, 1, 2, 2, 2, 2, 0},
                        {1, 1, 1, 1, 1, 2, 1, 1},
                        {1, 1, 1, 1, 1, 2, 2, 1},
                        };


    public void floodFill(int x, int y, int newColor) {
        floodFillUtil(this.screen, x, y, this.screen[y][x], newColor);
    }

    public void floodFillUtil(int[][] screen, int x, int y, int prevC, int newC) {
        if (y >= screen.length || x >= screen[0].length || y <0 || x<0) return; 
        if (screen[y][x] != prevC) return;
        
        screen[y][x] = newC;
        floodFillUtil(screen, x+1, y, prevC, newC);
        floodFillUtil(screen, x-1, y, prevC, newC);
        floodFillUtil(screen, x, y+1, prevC, newC);
        floodFillUtil(screen, x, y-1, prevC, newC);
    }
    public static void main(String[] args) {
        FloodFill test = new FloodFill();
        test.floodFill(4, 4, 3);
        for(int r = 0; r < test.screen.length; r++) {
            for (int c = 0; c < test.screen[0].length; c++) {
                System.out.print(test.screen[r][c] + " ");
            }
            System.out.println();
        }
    }
}