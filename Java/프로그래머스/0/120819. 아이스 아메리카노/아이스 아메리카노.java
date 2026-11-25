class Solution {
    public int[] solution(int money) {
        int[] answer = new int [2];
        answer[0] = money/5500;
        int sum = money - 5500 * (money/5500);
        answer[1] = sum;
        return answer;
    }
}