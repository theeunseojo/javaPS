package CodeTree;

import java.util.Scanner;
public class dfs02 {

    static int n;
    static int m;
    static boolean[][] visited;
    static int[][] grid;

    public static boolean InRange(int x, int y){
        return x >= 0 && x < n && y >= 0 && y < m;
    }

    public static boolean Cango(int x, int y){
        if(InRange(x,y) && !visited[x][y] && grid[x][y] == 1){
            return true;
        }
        return false;
    }

    public static void DFS(int x, int y){
        int[] dx = new int[]{1,0};
        int[] dy = new int[]{0,1};

        visited[x][y] = true;

        for(int i = 0; i < 2; i++){
            int newX = x + dx[i];
            int newY = y + dy[i];

            if(Cango(newX,newY)){
                DFS(newX,newY);
            }
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.
        visited = new boolean[n][m];

        DFS(0,0);

        int isTrue = visited[n-1][m-1] ? 1 : 0;

        System.out.println(isTrue);


    }
}
