package kadai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Kadai1_3 {
	public static void main(String[] args) {
	    Connection con = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
		String answer = null;
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int number = rand.nextInt(10) + 1;

	    try {
	      con = DriverManager.getConnection("jdbc:mysql://localhost/test?autoReconnect=true&useSSL=false",
	        "root",
	        "password"
	      );
	      pstmt = con.prepareStatement("select * from questions where number = " + number);
　　　　　　　// 藤井君ver
	      //pstmt = con.prepareStatement("select * from questions ORDER BY RAND() LIMIT 1");
	      rs = pstmt.executeQuery();
	      while (rs.next()) {

	    	  System.out.println("問." + rs.getString("number") + rs.getString("question"));
	    	  System.out.println("A : " + rs.getString("A"));
	    	  System.out.println("B : " + rs.getString("B"));
	    	  System.out.println("C : " + rs.getString("C"));
	    	  System.out.println("D : " + rs.getString("D"));

		      while(true) {
				System.out.println("A〜Dの中から選んでください");
				answer = sc.nextLine();
				if(List.of("A","B","C","D").contains(answer)) {
				System.out.println(rs.getString("correct"));
					if(answer.equals(rs.getString("correct"))) {
						System.out.println("正解！！！");
						break;
					} else {
						System.out.println("ざんねん...不正解");
						break;
					}
				} else {
				System.out.println("範囲外の入力がされました");

				}
		      }
		      System.out.println("正解 : " + rs.getString("correct") + "\n");
	      }
	    } catch (SQLException e) {
	      e.printStackTrace();
	    } finally {
	      if (rs != null) {
	        try {
	          rs.close();
	        } catch (SQLException e) {
	          e.printStackTrace();
	        }
	      }
	      if (pstmt != null) {
	        try {
	          pstmt.close();
	        } catch (SQLException e) {
	          e.printStackTrace();
	        }
	      }
	      if (con != null) {
	        try {
	          con.close();
	        } catch (SQLException e) {
	          e.printStackTrace();
	        }
	      }
	    }
	  }
}
