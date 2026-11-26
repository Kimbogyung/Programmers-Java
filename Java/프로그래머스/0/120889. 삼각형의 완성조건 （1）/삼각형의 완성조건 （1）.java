class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        for (int i = 0; i < sides.length; i++) {
            for (int j = i + 1; j < sides.length; j++) {
                if(sides[j] > sides[i]) {
                    int temp = sides[i];
                    sides[i] = sides [j];
                    sides[j] = temp;
                }
            }
        }
        max = sides[0];
        if (max < (sides[1] + sides[2])) {
            answer = 1;
        }
        else {
            answer = 2;
        }
        
        return answer;
    }
}