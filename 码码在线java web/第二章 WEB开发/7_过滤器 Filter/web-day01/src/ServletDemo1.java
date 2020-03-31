import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Map;

public class ServletDemo1 extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //tomcat 默认iso-8859-1编码
        String name = request.getParameter("nameP");
        String pwd = request.getParameter("pwdP");

//        String p = request.getContextPath(); //获取工程名
//        String x = request.getRequestURI(); //请求的资源路径
//        String a = request.getRequestURL().toString(); //浏览器访问全路径
//        String y = request.getRemoteAddr(); //远程服务器地址
//        String z = request.getRemoteHost(); //远程服务器host
//        Map<String, String[]> map = request.getParameterMap(); //获取所有的输入参数键值对
//        System.out.println(name + "------" + pwd);

//        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Demo1Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Hello " +name +", 欢迎菜鸟学习servlet </h2>");
            out.println("<h2>the time right now is:"+new Date()+"</h2>");
            out.println("</body>");
            out.println("</html>");

        }finally {
            out.close(); //关闭输出流
        }

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //get请求 是没有办法改变编码
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");

        System.out.println(name + "------" + pwd);
    }
}
