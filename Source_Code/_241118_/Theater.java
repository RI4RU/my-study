package _241119_array;
import java.util.Scanner;
import java.util.Arrays;

public class Theater {

	public static void main(String[] args) {
		// 전체 좌석이 10 좌석인 영화관
		// 사용자가 좌석의 예약 상태를 확인하고 예약을 할 수 있는 프로그램
		// 종료 커맨드) 음수 입력
		Scanner scan = new Scanner(System.in);
		
		boolean[] seat = new boolean[10];
		boolean[] reserve = new boolean[10];
		Arrays.fill(seat, true);
		boolean flag = true;
		
		System.out.println("좌석은 1번부터 10번까지 있습니다.");
		System.out.println("프로그램을 종료하시려면 0을 입력해주세요.");
		while (flag) {
			System.out.println("예매현황: " + Arrays.toString(seat));
			System.out.print("예약할 좌석의 번호를 입력하세요: ");
			int input = scan.nextInt();
			if (input <= 0) {
				flag = false;
			} else if (input > seat.length) {
				System.out.println("예약에 실패하였습니다. 유효하지 않은 좌석입니다.");
			} else if(seat[input-1]) {
				seat[input-1] = false;
				System.out.println(input + "번 자리가 예약되었습니다");
			} else {
				System.out.println("예약에 실패하였습니다. 이미 예약된 좌석입니다.");
			}
			if (Arrays.equals(seat, reserve)) {
				flag = false;
				System.out.println("모든 좌석이 예매되었습니다.");
			}
		}
		
		System.out.println("예매 프로그램이 종료되었습니다.");
	}
}
