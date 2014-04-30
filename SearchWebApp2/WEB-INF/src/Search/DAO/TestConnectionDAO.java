package Search.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnectionDAO {

	public String Connection(){

		String name = "";

		try{
			System.out.println("ドライバー接続");
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			System.out.println("ドライバー接続完了");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/testsql?", "root", "");
			System.out.println("接続");
			Statement stmt = con.createStatement();
			System.out.println("接続完了");
			ResultSet rs = stmt.executeQuery("SELECT * from test");

			while(rs.next()){
				name = rs.getString("name");
			}

			rs.close();
			stmt.close();
			con.close();
			System.out.println("切断終了");
		}
		catch (InstantiationException e) {
		// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		catch(SQLException e){
			System.out.println("sqlExceptionError");
		}
		return name;
	}

}
