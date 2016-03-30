import java.io.IOException;import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;import model.DBUtil;
import model.QS3;/**
* Servlet implementation class Studentrecord
*/
@WebServlet("/Studentrecord")
public class Studentrecord extends HttpServlet {
    private static final long serialVersionUID = 1L;    /**
     * @see HttpServlet#HttpServlet()
     */
    public Studentrecord() {
        super();
        // TODO Auto-generated constructor stub
    }    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        QS3 qs3=new QS3();        
        String result = qs3.Studentrecord();
        request.setAttribute("result", result);
        request.getRequestDispatcher("/output.jsp").forward(request, response);
    }
    }
