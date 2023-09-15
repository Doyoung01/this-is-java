import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        boolean run = true;

        int balance = 0;

        Scanner scanner = new Scanner(System.in);
        String number, money;
        int total = 0;

        while(run) {
            System.out.println("------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------");
            System.out.print("선택> ");

            number = scanner.nextLine();
            int num = Integer.valueOf(number);

            if (num == 1) {
                System.out.print("예금액> ");
                money = scanner.nextLine();
                total += Integer.valueOf(money);
            } else if (num == 2) {
                System.out.print("출금액> ");
                money = scanner.nextLine();
                total -= Integer.valueOf(money);
            } else if (num == 3)  System.out.println("잔고> " + total);
            else if (num == 4) {
                System.out.println();
                break;
            }
        }
        System.out.println("프로그램 종료");
    }
}