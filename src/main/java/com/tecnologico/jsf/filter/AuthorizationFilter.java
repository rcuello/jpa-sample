
package com.tecnologico.jsf.filter;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author rcuello
 */
@WebFilter(filterName = "AuthFilter", urlPatterns = { "*.xhtml" })
public class AuthorizationFilter implements Filter{
    public AuthorizationFilter() {
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		try {

			HttpServletRequest reqt = (HttpServletRequest) request;
			HttpServletResponse resp = (HttpServletResponse) response;
			HttpSession ses = reqt.getSession(false);

			String reqURI = reqt.getRequestURI();
                        boolean isLoginPage=reqURI.indexOf("/login.xhtml") >= 0;
                        boolean isLoggedIn=(ses != null && ses.getAttribute("username") != null);
                        boolean isPublicPage=reqURI.indexOf("/public/") >= 0;
                        boolean isResource=reqURI.contains("javax.faces.resource");
                        boolean isDas=reqURI.indexOf("/dashboard.xhtml") >= 0;
                        
			if (isLoginPage || isLoggedIn || isPublicPage || isResource || isDas)
				chain.doFilter(request, response);
			else
				resp.sendRedirect(reqt.getContextPath() + "/login.xhtml");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void destroy() {

	}
}
