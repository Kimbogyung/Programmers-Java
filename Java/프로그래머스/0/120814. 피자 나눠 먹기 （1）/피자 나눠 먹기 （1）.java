class Solution {
    public int solution(int n) {
        int answer = 0;
        int quotient = n / 7;
        if (n > (quotient * 7)) {
            answer = quotient + 1;
        }
        else if (n == (quotient * 7)) {
            answer = quotient;
        }
        else if (n <= 7) {
            answer = 1;
        }
        return answer;
    }
}