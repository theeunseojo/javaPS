package programmers;

import java.util.Arrays;

class sort03 {


    public int sort03 (int[][] sizes) {
        int answer = 0;


        // 큰 값들이 가로 위치에 오게 정렬
        for(int[] size : sizes){
            if(size[0] - size[1] < 0){
                int temp = size[0];
                size[0] = size[1];
                size[1] = temp;
            }
        }



        // 가로를 기준으로 정렬 -> 최댓값
        Arrays.sort(sizes, (o1, o2) -> o2[0] - o1[0]);
        int w = sizes[0][0];

        // 세로를 기준으로 정렬 -> 최댓값
        Arrays.sort(sizes, (o1, o2) -> o2[1] - o1[1]);
        int h = sizes[0][1];


        return w * h;
    }
}
