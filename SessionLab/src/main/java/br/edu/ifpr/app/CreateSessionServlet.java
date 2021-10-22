package br.edu.ifpr.app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class CreateSessionServlet extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Usuario> usuarios = new ArrayList<Usuario>();

		String login = req.getParameter("campo_login");
		String password = req.getParameter("campo_password");
		
		Usuario usuario1 = new Usuario();
		usuario1.login = "admin";
		usuario1.password = "admin";
		usuarios.add(usuario1);

		Usuario usuario2 = new Usuario();
		usuario2.login = "root";
		usuario2.password = "root";
		usuarios.add(usuario2);
		
		for (Usuario usuario : usuarios) {
			
			if(login.equals(usuario.login)) {
				
				if(password.equals(usuario.password)) {
					
					HttpSession session = req.getSession();
					
					session.setAttribute("usuario", "jefferson");
					session.setAttribute("estaLogado", true);
					session.setMaxInactiveInterval(3600);
					
					//System.out.println("/SessionLab/segura");
					
					resp.sendRedirect("/SessionLab/segura");
					
				}
				
				//resp.sendRedirect("/SessionLab/login.jsp?msg=senha incorreta");
				System.out.println("/SessionLab/login.jsp?msg=senha incorreta");

			}
			
			//resp.sendRedirect("/SessionLab/login.jsp?msg=login incorreta");
			System.out.println("/SessionLab/login.jsp?msg=login incorreta");
			
		}
		
		

		
	
	}

}
