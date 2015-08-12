package springmvc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBHelper {
	public static final String url = "jdbc:mysql://localhost/student";
	public static final String name = "com.mysql.jdbc.Driver";
	public static final String user = "root";
	public static final String password = "rootott";
	public Connection conn = null;


	public DBHelper() {
		try {
			Class.forName(name);//指定连接类型
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public Connection getConnection(){
		try {
			 conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	public void close() {
		try {
			this.conn.close();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		DBHelper de=new DBHelper();
		System.out.println(de.getConnection());
		
	}
}
