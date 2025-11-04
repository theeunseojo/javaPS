package programmers;

import java.util.Arrays;

class basic02 {
    public String[] basic02(String[] strings, int n) {
        String[] answer = {};

        answer =  Arrays.stream(strings)
                .sorted((str1, str2) -> {
                    char c1 = str1.charAt(n);
                    char c2 = str2.charAt(n);

                    // 오름차순 정렬

                    if(c1 == c2){
                        return str1.compareTo(str2);
                    }
                    else{
                        return c1 - c2;
                    }
                })
                .toArray(String[] :: new);


        return answer;
    }
}