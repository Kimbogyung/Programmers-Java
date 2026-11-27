class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        int[] num = new int [3];
        for (int i = 0; i < box.length; i++) {
            num[i] = box[i] / n;
        }
        for (int i = 0; i < num.length; i++) {
            answer *= num[i];
        }
        return answer;
    }
}