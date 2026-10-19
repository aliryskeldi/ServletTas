import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();

        if (name == null || name.trim().isEmpty()) {
            out.println("Қате: Аты бос!");
        } else if (email == null || email.trim().isEmpty()) {
            out.println("Қате: Email бос!");
        } else if (password == null || password.trim().isEmpty()) {
            out.println("Қате: Пароль бос!");
        } else {
            out.println("Сәтті тіркелдіңіз, " + name + "!");
        }
    }
}
