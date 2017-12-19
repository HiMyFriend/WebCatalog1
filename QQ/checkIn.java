package Servlets;

import JClass.Client;
import JClass.WebCatalog;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@WebServlet("/sighup")
public class checkIn extends HttpServlet {
    static public boolean checkI = true;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String first_name = request.getParameter("first_name") + " ";
        String last_name = request.getParameter("last_name") + " ";
        String email = request.getParameter("email") + " ";
        String phone = request.getParameter("phone") + " ";
        String password = request.getParameter("password") + " ";
        String client = first_name + last_name + email + phone + password;
        if (WebCatalog.checkIn(Client.addClient(client))){
            checkI = true;
            FileWriter writer = new FileWriter("C:\\Users\\pashi\\IDEAProject\\WebCatalog\\database\\client.txt", true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write("\n" + client + WebCatalog.id);
            bufferWriter.close();
            response.sendRedirect("/");
        }
        else{
            checkI = false;
            response.sendRedirect("/jspIn/registration.jsp");
        }
    }
}
