package CodeTree;

import java.util.Scanner;
import java.util.ArrayList;
public class dfs03 {
    static boolean [][] visited;
    static int [][] grid;
    static int n;

    static boolean Cango(int x, int y){
        if(x < 0 || x >= n || y < 0 || y >= n || visited[x][y] || grid[x][y] == 0){
            return false;
        }
        return true;
    }
    static int dfs(int x, int y){
        int [] dx = {1, 0, -1, 0};
        int [] dy = {0, -1, 0, 1};

        visited[x][y] = true;
        // 자기 자신 세기
        int count = 1;

        for(int i = 0; i < 4; i++){
            int newX = x + dx[i];
            int newY = y + dy[i];
            if(Cango(newX, newY)){
                count = count  + dfs(newX, newY);
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        // Please write your code here.
        visited = new boolean[n][n];
        ArrayList<Integer> costs = new ArrayList<>();

        // 연결그래프 갯수 -> 시작할때
        int graphCount = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(!visited[i][j] && grid[i][j] == 1){
                    graphCount++;

                    // 요소 갯수 -> 시작점에서부터 시작해서 지나간 방문 횟수
                    int count = dfs(i,j);
                    costs.add(count);

                }
            }
        }

        // 최종출력
        System.out.println(graphCount);
        costs.stream()
                .sorted()
                .forEach(cost -> System.out.println(cost));

    }
}
