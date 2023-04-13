public class Main {

    // 1번 문제) 잔돈을 구해보자!(1점)
    public int solution(int num) {
        int answer = 0;
        int change = 0;
        // 1000원에서 num을 빼 잔돈을 구한다
        // 잔돈이 0보다 클때, 500원보다 크면 500원을 빼고
        // 100원보다 크면 100원을 빼고, 50원보다 크면 50원을 빼고
        // 10원보다 크면 10원을 뺀다.
        // 그렇지 않으면 반복문 나가고 answer를 리턴한다.

        change = 1000 - num;

        while(change > 0) {
            if(change >= 500) {
                change = change - 500;
                answer++;
            }
            else if(change >= 100) {
                change = change - 100;
                answer++;
            }
            else if(change >= 50) {
                change = change - 50;
                answer++;
            }
            else if(change >= 10) {
                change = change - 10;
                answer++;
            }
            else
                break;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();

        int num1 = 160;

        System.out.println(method.solution(num1));
    }
}
