public class Main2 {

    // 2번 문제) O/X 덧셈(2점)
    public int solution(String s) {
        int answer = 0;
        int count = 0;

        // O가 나오면 count 증가해서 점수에 더하기
        // X가 나오면 count 0으로 리셋하기

        // 문자열 길이만큼 반복
        for(int i = 0; i < s.length(); i++){
            // i번째 글자가 O이면 count 증가하고 점수에 더하기
            if(s.charAt(i) == 'O') {
                count++;
                answer += count;
            }
            // 그렇지 않으면 count 0으로 리셋하기
            else if(s.charAt(i) == 'X') {
                count = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main2 method = new Main2();

        String s = "OXOOOXXXOXOOXOOOOOXO";

        System.out.println(method.solution(s));
    }
}
