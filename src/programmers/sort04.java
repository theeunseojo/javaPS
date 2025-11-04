package programmers;



import java.util.*;
import java.util.stream.Collectors;


class sort04 {
    public String sort04(int[] numbers) {
        String answer = "";

        // 내림차순
        // 원시 stream -> stream -> string

        answer = Arrays.stream(numbers)
                .mapToObj(num -> num + "")
                .sorted((str1, str2) -> (str2 + str1).compareTo(str1+str2))
                .collect(Collectors.joining());

        // 예외처리 [0,0] -> "00"
        char c1 = answer.charAt(0);
        char c2 = '0';
        if(c1 == c2){
            answer = "0";
        }
        return answer;
    }
}