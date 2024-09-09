class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array.length; j++) {
                int temp = 0;
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        answer = array[array.length/2];
        return answer;
    }
}