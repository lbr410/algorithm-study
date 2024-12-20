import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        answer = IntStream.rangeClosed(1, n)
                .filter(i -> n % i == 0)
                .toArray().length;
        return answer;
    }
}