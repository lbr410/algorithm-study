class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] orders = Integer.toString(order).split("");
        
        for (int i=0; i<orders.length; i++) {
            if (Integer.parseInt(orders[i]) != 0 && Integer.parseInt(orders[i]) % 3 == 0) answer++;
        }
        
        return answer;
    }
}