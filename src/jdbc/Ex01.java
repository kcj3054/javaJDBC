package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex01 {

	public static void main(String[] args) {

		try {
			String url="jdbc:mysql://localhost:3306/java";
			String user = "lee";
			String pass = "123456";
			Class.forName("org.gjt.mm.mysql.Driver");
			System.out.println("드라이버 있다");
			DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 없다");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
