package com.spiring.foodcart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FoodcartDbUtil {

	public static List<Food> getFoodList() throws ClassNotFoundException, SQLException
	{
		ArrayList<Food> food=new ArrayList<>();
		
		//load mysql driver
		Class.forName("com.mysql.jdbc.driver");
		
		//get connection
		Connection con=DriverManager.getConnection("jdbc://mysql://localhost:3306/food", "root","Swara@12262");
		
		//create statement
		Statement st = con.createStatement();
		
		ResultSet rs= st.executeQuery("select * from foodcart");
		
		while(rs.next())
		{
			
			int id  = rs.getInt(1);
			String item =rs.getString(2);
			int price  = rs.getInt(3);
			System.out.println(id+ " "+ item+" "+price);
			food.add(new Food(id, item, price));
		}
		return food;
	}
}
