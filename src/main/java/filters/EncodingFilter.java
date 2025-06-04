package filters;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

@WebFilter("/*")
public class EncodingFilter implements Filter{

    /**
     * コンストラクタ
     */
    public EncodingFilter() {
    }
    
    /**
     * @See Filter#destroy()
     */
    public void destroy() {
        
    }
    
    /**
     *  @See Filter#doFilter(
     */

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException{
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        chain.doFilter(request,  response);
    }
    
    /**
     *  @See  Filter#init(FilterConfig)
     */
    public void init(FilterConfig fConfig) throws ServletException{
        
    }
    
}
