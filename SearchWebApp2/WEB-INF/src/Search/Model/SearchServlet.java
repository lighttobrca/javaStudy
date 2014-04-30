package Search.Model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Search.DAO.TestConnectionDAO;

public class SearchServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		doPrintWriter(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		doPrintWriter(req, resp);
	}

	protected void doPrintWriter(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		String connection = new TestConnectionDAO().Connection();

		resp.setContentType("text/html; charset=UTF-8");


		 PrintWriter out = resp.getWriter();
		 out.println("<html>");
		 out.println("<body>");
		 out.println("<h1>私の名前</h1>");
		 out.println("<p>MySQLから取得した私の名前は : "+ connection + "です。</p>");
		 out.println("</body>");
		 out.println("</html>");

	}


}
