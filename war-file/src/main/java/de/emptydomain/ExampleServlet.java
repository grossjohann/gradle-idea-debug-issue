package de.emptydomain;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="ExampleServlet", urlPatterns = { "/example" }, loadOnStartup = 1)
public class ExampleServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		LibraryExample libraryExample = new LibraryExample();
		libraryExample.doLibraryExample();
		ClassInWarFile classInWarFile = new ClassInWarFile();
		classInWarFile.doWarFile();
		System.err.println("ExampleServlet#doGet");
		resp.getWriter().print("Example.");
	}
}
