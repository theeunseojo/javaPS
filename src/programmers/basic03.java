package programmers;

class basic03 {

    boolean isDecimal(int num){

        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }

    public int basic03(int n) {
        int answer = 0;


        for(int i = 2; i <= n; i++){
            if(isDecimal(i)){
                answer++;
            }

        }

        return answer;
    }
}