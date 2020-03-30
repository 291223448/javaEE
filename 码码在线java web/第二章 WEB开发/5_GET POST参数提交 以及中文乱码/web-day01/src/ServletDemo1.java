import java.io.IOException;

public class ServletDemo1 extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //tomcat 默认iso-8859-1编码
        String name =new String(request.getParameter("nameP").getBytes("ISO-8859-1"),"utf-8");
        String pwd = request.getParameter("pwdP");

        System.out.println(name+"------"+pwd);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //get请求 是没有办法改变编码
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");

        System.out.println(name+"------"+pwd);
    }
}
