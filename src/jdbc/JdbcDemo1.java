package jdbc;
import java.sql.*;
public class JdbcDemo1 {
	public static void main(String[] args) throws SQLException {
		Connection con = null ;
		Statement st = null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newjob","root","root");
			//System.out.println("Connected");
			st = con.createStatement();
			/*st.execute("create table employee (eno int(3), ename varchar(10), salary float(4))");
			System.out.println("Table Created");*/
			//st.executeUpdate("insert into employee values (111,'Raj',8000.0),(222,'Ramu',6000.0),(333,'Ramya',9000.0)");
			/*st.executeUpdate("insert into employee values (222,'Ramu',6000.0)");
			st.executeUpdate("insert into employee values (222,'Ramu',6000.0)");
			System.out.println("Inserted");*/
			/*int n = st.executeUpdate("update employee set salary = 5000.0");
			System.out.println(n+" records updated");*/
			/*int n = st.executeUpdate("delete from employee");
			System.out.println(n+" records deleted");*/
			ResultSet rs = st.executeQuery("select * from employee");
			
			  while (rs.next()) {
			  System.out.println(rs.getInt("eno")+" "+rs.getString("ename")+" "+rs.getFloat
			  (3));//3 is column no (salary) }
			 
			
			  
			  }
		 }catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			st.close();
			con.close();
		}
	}

}
