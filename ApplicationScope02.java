package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class applicationScope02
 */
@WebServlet("/applicationScope02")
public class ApplicationScope02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplicationScope02() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		ServletContext application = getServletContext();
		
		//Application01이 먼저 실행되지 않을 경우 예외처리
		try {
			int value = (int) application.getAttribute("value"); // Object값으로 들어가므로 형변환 필요
			value = value + 1; // 2
			application.setAttribute("value", value);
			
			out.println("<h1>value : " + value + "<h1>");
		} catch (NullPointerException e) {
			out.print("value의 값이 설정되지 않았습니다.");
		}
	}
}
