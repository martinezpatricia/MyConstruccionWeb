package myconstruccion;

import javax.servlet.http.HttpServletResponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@SuppressWarnings({ "unused", "unused", "unused", "serial" })
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        // Conectar a la base de datos y validar el login (esto es un ejemplo simple)
        if (validateLogin(email, password)) {
            response.sendRedirect("dashboard.jsp"); // Redirige al panel de control
        } else {
            response.sendRedirect("index.jsp"); // Redirige a la página de inicio si no es válido
        }
    }

    private boolean validateLogin(String email, String password) {
        // Lógica de validación (deberías hacerlo con la base de datos)
        return "user@example.com".equals(email) && "password123".equals(password);
    }
}

