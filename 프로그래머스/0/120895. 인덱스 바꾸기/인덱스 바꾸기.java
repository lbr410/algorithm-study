class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        char temp = ' ';
        for (int i=0; i<my_string.length(); i++) {
            if (i == num1) {
                temp = my_string.charAt(i);
                sb.append(my_string.charAt(num2));
            } else if (i == num2) {
                sb.append(temp);
            } else {
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}