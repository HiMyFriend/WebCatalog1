package Servlets;

import JClass.Product;
import JClass.WebCatalog;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Objects;

@WebServlet(name = "DeleteProduct", urlPatterns = "/deleteProduct")
public class DeleteProduct extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Product res = new Product();
        res.price = Integer.parseInt(request.getParameter("price"));
        res.name = request.getParameter("name");
        for(int i = 0; i < WebCatalog.products.size(); i++){
            if((Objects.equals(WebCatalog.products.get(i).name, res.name)) && (WebCatalog.products.get(i).price == res.price)){
                WebCatalog.products.remove(i);
                deleteDatabase(i);
                request.getRequestDispatcher("Catalogi/CatalogAdmin.jsp").forward(request, response);
            }
        }
    }

    private void deleteDatabase(int index) throws IOException {
        StringBuilder res = new StringBuilder(new String());
        for(int i = 0; i < WebCatalog.products.size(); i++){
            res.append(WebCatalog.products.get(i).name).append(" ").append(WebCatalog.products.get(i).price).append("\n");
        }
        String restmp = res.substring(0, res.length()-1);
        FileWriter writer = new FileWriter("C:/Users/pashi/IDEAProject/WebCatalog/database/products.txt");
        writer.write(restmp);
        writer.close();
    }
}
