class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        int temp = 0;
        for (int i=0; i<numbers.length; i++) {
            if (direction.equals("right")) {
                if (i == 0) {
                    temp = numbers[numbers.length-1];
                } else {
                    answer[i] = numbers[i-1];
                    if (i == numbers.length-1) {
                        answer[0] = temp;
                    }
                }  
            } else if (direction.equals("left")) {
                if (i != numbers.length-1) {
                    if (i == 0) {
                        temp = numbers[i];
                    }
                    answer[i] = numbers[i+1];
                } else {
                    answer[i] = temp;
                }
            }
        }
        
        return answer;
    }
}