package kadai;

import java.util.Scanner;

public class Kadai1_1 {
	public static void main(String[] args) {
		String question = "電子メールを暗号化するために使用される方式はどれか。";
		String A = "BASE64";
		String B = "GZIP";
		String C = "PNG";
		String D = "S/MIME";
		String correct = "D";
		String message = "A～Dで入力してください";
		String answer = null;
		Scanner sc = new Scanner(System.in);

		System.out.println("問." + question);
		System.out.print("選択肢");
		System.out.print(" A:" + A);
		System.out.print(" B:" + B);
		System.out.print(" C:" + C);
		System.out.println(" D:" + D);
		System.out.println(message);

		while(true) {
			try {
			answer = sc.nextLine();
			// 入力が正しければ
			if(answer.equals("A")||answer.equals("B")||answer.equals("C")||answer.equals("D")) {
				if(answer.equals(correct)) {
					System.out.println("正解！");
				}else {
					System.out.println("不正解！");
				}
				break;
			}

			System.out.println(message);
			sc.next();
			}catch(Exception e) {
				System.out.println(message);
				sc.next();
			}
		}
		sc.close();


//		while(!(answer.equals("A")||answer.equals("B")||answer.equals("C")||answer.equals("D"))) {
//			System.out.println(message);
//			answer = new java.util.Scanner(System.in).nextLine();
//		}
//		if(answer.equals(correct)) {
//			System.out.println("正解！");
//		}else {
//			System.out.println("不正解！");
//		}
	}
}
