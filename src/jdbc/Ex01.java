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
			System.out.println("����̹� �ִ�");
			DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� ����");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
