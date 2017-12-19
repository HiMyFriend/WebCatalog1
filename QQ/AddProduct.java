package Servlets;

import JClass.Product;
import JClass.WebCatalog;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import static JClass.Product.addProduct;

@WebServlet(name = "AddProduct", urlPatterns = "/addProduct")
public class AddProduct extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = "\n" + request.getParameter("name") + " ";
        name = name + Integer.parseInt(request.getParameter("price"));
        WebCatalog.products.add(addProduct(name.substring(1,name.length())));
        addProductFile(name);
        request.getRequestDispatcher("Catalogi/CatalogAdmin.jsp").forward(request, response);
    }

    private void addProductFile(String name) throws IOException {
        Files.write(Paths.get("C:/Users/pashi/IDEAProject/WebCatalog/database/products.txt"), name.getBytes(), StandardOpenOption.APPEND);
    }
}
