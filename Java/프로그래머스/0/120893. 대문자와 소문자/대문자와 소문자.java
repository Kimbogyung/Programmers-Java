class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isUpperCase(c)) { //대문자면
                char s = Character.toLowerCase(c);
                answer += s;
            }
            else if (Character.isLowerCase(c)) {
                char s = Character.toUpperCase(c);
                answer += s;
            }
        }
        return answer;
    }
}