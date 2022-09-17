package helloworld;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbccon {

	public static void main(String[] args) {
		try
		{
			//Class.forName("com.microsft.sqlserver.jdbc.SQLServerDriver");
			DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
			Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost\\sqlexpress;user=LAPTOP-K79MQMVI//hp;password=");
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from CUSTOMERS");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+ rs.getString(2)+"  "+ rs.getInt(3)+" "+ rs.getDouble(4)+"  "+rs.getCharacterStream(5));
				conn.close();
			}
		}catch(Exception  e) {
			System.out.print(e);
		}
			System.out.print("histr");
	}

}





