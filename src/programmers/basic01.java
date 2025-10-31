package programmers;

class basic01 {
    public String basic01(String str1, String str2) {
        String answer = "";
        for(int i = 0; i < str1.length(); i++){

            answer = answer +  str1.charAt(i) + str2.charAt(i);
        }
        return answer;
    }
}
