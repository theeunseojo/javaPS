package programmers;

import java.util.HashMap;

// 프로그래머스 전화번호보목록 -> 나중에 정렬로도 풀어보기
class hash04 {
    public boolean hash04(String[] phone_book) {
        boolean answer = false;
        HashMap<String, Integer> hs = new HashMap<>();

        // 1. hash set 넣어 키값으로 만들기
        for(String num : phone_book){
            hs.put(num, hs.getOrDefault(num, 0));
        }

        // 2. 배열의 원소를 보면서 하나씩 보면서 접두사가 있는지 확인하기
        for(String num : phone_book){
            String str = "";
            for(int i = 0; i < num.length(); i++){
                str = str + num.charAt(i);
                //System.out.println("str : " + str);
                if(hs.containsKey(str) && !str.equals(num)){
                    return false;
                }
            }
        }

        answer = true;
        return answer;
    }
}