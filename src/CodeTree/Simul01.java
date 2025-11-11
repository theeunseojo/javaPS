package CodeTree;

import java.util.Scanner;


public class Simul01 {

    public static int getCoin(int[][] grid, int x, int y){
        int answer = 0;
        for( int i = x; i < x + 3; i++){
            for(int j = y; j < y + 3; j++){
                if(grid[i][j] == 1){
                    answer++;
                }

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int answer = 0;
        for(int x = 0; x <= n - 3; x++){
            for(int y = 0; y <= n - 3; y++){
                int tempAnswer = getCoin(grid, x, y);
                answer = Math.max(answer,tempAnswer);

            }
        }

        System.out.println(answer);
    }
}
