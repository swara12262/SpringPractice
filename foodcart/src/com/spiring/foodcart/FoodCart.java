package com.spiring.foodcart;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FoodCart")
public class FoodCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//get data from db
	//redirect to view
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		ArrayList<Food> foodItems =new ArrayList<>();
		try {
			foodItems = (ArrayList<Food>) FoodcartDbUtil.getFoodList();
			request.setAttribute("foodItems", foodItems);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("show-food.jsp");
		dispatcher.forward(request, response);
	}

}
