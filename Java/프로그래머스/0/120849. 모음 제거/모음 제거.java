class Solution {
    public String solution(String my_string) {
        String answer = "";
        char [] gather = new char [] {'a', 'e', 'i', 'o', 'u'};
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            boolean isCheck = false;
            
            for (int j = 0; j < gather.length; j++) {
                if (c == gather[j]) {
                    isCheck = true;
                }
            }
            if (!isCheck) {
                answer += c;
            }
        }
        return answer;
    }
}