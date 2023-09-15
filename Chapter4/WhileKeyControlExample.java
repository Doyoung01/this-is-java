import java.io.IOException;
public class WhileKeyControlExample {
    public static void main(String[] args) throws IOException {
        boolean run = true;
        int speed = 0;
        int keyCord = 0;

        while(run) {
            // Enter키가 입력되면 캐리지리턴(13)과 라인피드(10)가 입력되므로 이 값을 제외)
            // 캐리지 리턴(CR) : 문자의 새 줄을 시작하는 데 쓰이는 제어 문자나 그 구조
            // 라인피드(LF) : 커서의 위치를 아랫줄로 이동
            if(keyCord != 13 && keyCord != 10) {
                System.out.println("----------------------");
                System.out.println("1.증속 | 2.감속 | 3.중지");
                System.out.println("----------------------");
                System.out.println("선택: ");
            }

            keyCord = System.in.read();

            if (keyCord == 49) {
                speed++;
                System.out.println("현재 속도=" + speed);
            } else if (keyCord == 50) {
                speed--;
                System.out.println("현재 속도=" + speed);
            } else if (keyCord == 51) {
                run = false;
            }
        }
        System.out.println("프로그램 종료!");
    }
}