package dao;
import java.sql.*;

import model.Rider;
public class Riderdao {

	String url ="jdbc:postgresql://localhost:5432/riderdb";
	String user="postgres";
	String pass="Dhasur@111";
	
	public void addrider(Rider r)
	{
		String sql="insert into emp values(?,?,?,?)";
		try{
			Connection con =DriverManager.getConnection(url,user,pass);
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, r.getId());
			ps.setString(2, r.getName());
			ps.setInt(3, r.getPhone());
			ps.setString(4, r.getStatus());
			ps.executeUpdate();
			System.out.println("Done");
		}	
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void viewrider()
	{
		String sql="select * from emp";
		try
		{
			Connection con= DriverManager.getConnection(url,user,pass);
			PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt("Id")+" "+rs.getString("Name")+" "+rs.getInt("Phone")+" "+rs.getString("Status"));
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void updaterider(int id,String status)
	{
		String sql="update emp set status=? where id=?";
		try
		{
			Connection con=DriverManager.getConnection(url,user,pass);
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,status);
			ps.setInt(2,id);
			ps.executeUpdate();
			System.out.println("Update done");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void deleterider(int id)
	{
		String sql="delete from emp where id=?";
		try
		{
			Connection con=DriverManager.getConnection(url,user,pass);
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
			System.out.println("Rider deleted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
