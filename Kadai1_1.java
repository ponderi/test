package kadai;

public class Kadai1_1 {
	public static void main(String[] args) {
		String question = "電子メールを暗号化するために使用される方式はどれか。";
		String A = "BASE64";
		String B = "GZIP";
		String C = "PNG";
		String D = "S/MIME";
		String correct = "D";
		System.out.println("問." + question);
		System.out.print("選択肢");
		System.out.print(" A:" + A);
		System.out.print(" B:" + B);
		System.out.print(" C:" + C);
		System.out.println(" D:" + D);
		System.out.println("A～Dで入力してください");
		String answer = new java.util.Scanner(System.in).nextLine();

		while(!(answer.equals("A")||answer.equals("B")||answer.equals("C")||answer.equals("D"))) {
			System.out.println("A～Dで入力してください");
			answer = new java.util.Scanner(System.in).nextLine();
		}
		if(answer.equals(correct)) {
			System.out.println("正解！");
		}else {
			System.out.println("不正解！");
		}
	}
}
