package programmers;

import java.util.HashMap;
import java.util.Map;

class hash03 {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap <String, Integer> map = new HashMap<>();

        for(String cloth[] : clothes){
            map.put(cloth[1], map.getOrDefault(cloth[1],0) + 1);
        }

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            answer = answer * (entry.getValue() + 1);
        }

        return answer - 1;
    }
}
