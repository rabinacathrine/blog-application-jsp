package controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;

import model.User;

/**
 * Servlet implementation class signupServlet
 */
@WebServlet("/signup")
public class signupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/signupViewjsp.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String confirmPassword=request.getParameter("confirmPassword");
		
		System.out.println(email);
//		System.out.println(password);
//		System.out.println();
		LocalDate date = LocalDate.now();
		User user =new User();
		user.setEmail(email);
		user.setPassword(password);
		UserDAO userdao= new UserDAO();
		user.setDate(date);
		int checkUser=0;
		checkUser = userdao.signup(user);
		if(checkUser!=0)
		{
			System.out.println(user.getEmail());
			System.out.println(user.getPassword());
			System.out.println(user.getDate());
			request.setAttribute("message", "Registration successful");
			RequestDispatcher rd =this.getServletContext().getRequestDispatcher("/WEB-INF/views/signupViewjsp.jsp");
			rd.forward(request, response);
		}
		else
		{
			request.setAttribute("message", "Check Your Credentials");
			RequestDispatcher rd =this.getServletContext().getRequestDispatcher("/WEB-INF/views/signupViewjsp.jsp");
			rd.forward(request, response);
		}
	}

}
