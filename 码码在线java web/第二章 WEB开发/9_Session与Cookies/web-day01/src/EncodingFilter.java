import com.sun.deploy.net.HttpRequest;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EncodingFilter implements Filter {
    private String encoding = "UTF-8";

    public void destroy() {
        System.out.println("过滤器销毁了");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        //设置请求编码格式、响应文本和编码格式
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        request.setCharacterEncoding(encoding);
        response.setContentType("text/html;charset="+encoding);
        chain.doFilter(req, resp);  //设计模式  责任链模式
    }

    public void init(FilterConfig config) throws ServletException {
        encoding = config.getInitParameter("Encoding");
        System.out.println("过滤器初始化");
    }

}
