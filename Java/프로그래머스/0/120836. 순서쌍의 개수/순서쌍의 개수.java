class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                for (int j = 1; j <= n; j++) {
                    if(i*j == n) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}