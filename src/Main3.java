import java.util.Arrays;

public class Main3 {

    // 3번 문제) 지뢰 탐지가 필요해!(3점)
    public char[][] solution(int N, char[][] ary) {
        int[] x = {1, -1, 0, 0, 1, 1, -1, -1};
        int[] y = {0, 0, 1, -1, 1, -1, 1, -1};
        char[][] answer = new char[N][N];
        int num = 0;
        int sum = 0;

        // 배열 가로, 세로 길이만큼 반복
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                // 지뢰이면(숫자) '*'로 출력
                if(Character.isDigit(ary[i][j])) {
                    answer[i][j] = '*';
                }
                // 주변 값 8개 찾아보고, 숫자면 더해서 출력하는데 10이상이면 M으로 출력
                else {
                    answer[i][j] = '0';
                    // 인접한 8개 칸 중 지뢰가 있는지 체크
                    for(int k = 0; k < 8; k++) {
                        int dx = i + x[k];
                        int dy = j + y[k];
                        // 우선 Map 범위 벗어나지 않도록 체크하고
                        if(0 <= dx && dx < N && 0 <= dy && dy < N) {
                            // 주변 값중에 숫자가 있다면
                            if(Character.isDigit(ary[dx][dy])) {
                                // 그 값을 숫자로 바꿔서 num에 저장하고
                                num = Character.getNumericValue(ary[dx][dy]);
                                // 여러개면 값을 더해 sum에 저장한다.
                                sum += num;
                                // sum이 10보다 크면 'M'으로 출력
                                if(sum >= 10) {
                                    answer[i][j] = 'M';
                                }
                                // 그렇지 않으면 num을 더한 값을 출력
                                else answer[i][j] += num;
                            }
                        }
                    }
                    // 8번 다 돌면 sum을 0으로 초기화
                    sum = 0;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main3 method = new Main3();

        int N = 5;
        char[][] chars = {{'1', '.', '.', '.', '.'},
                {'.', '.', '3', '.', '.'},
                {'.', '.', '.', '.', '.'},
                {'.', '4', '.', '.', '.'},
                {'.', '.', '.', '9', '.'}};

        System.out.println(Arrays.deepToString(method.solution(N, chars)));
    }

}
