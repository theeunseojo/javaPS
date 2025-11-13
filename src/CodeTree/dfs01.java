package CodeTree;

import java.util.Scanner;

public class dfs01 {

    public class Main {
        static int n;
        static boolean[] visited = new boolean[n+1];
        static int[][] graph = new int[n+1][n+1];
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            int m = sc.nextInt();
            int[] u = new int[m];
            int[] v = new int[m];
            for (int i = 0; i < m; i++) {
                u[i] = sc.nextInt();
                v[i] = sc.nextInt();
            }

            visited = new boolean[n+1];
            graph = new int[n+1][n+1];
            // Please write your code here.
            for(int i = 0; i < m; i++){
                int row = u[i];
                int col = v[i];

                graph[row][col] = 1;
                graph[col][row] = 1;
            }

            dfs(1);


            int answer = 0;

            for(int i = 2; i <= n; i++){
                if(visited[i]){
                    answer++;
                }
            }

            System.out.println(answer);

        }
        public static void dfs(int vertex){
            for(int curr = 1; curr <= n; curr++){
                if( (graph[vertex][curr] == 1) && (!visited[curr])){
                    visited[curr] = true;
                    dfs(curr);
                }
            }
        }

    }

}
