/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.53
 * Generated at: 2018-08-30 00:54:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<div class=\"outer-container\" data-genuitec-lp-enabled=\"false\" data-genuitec-file-id=\"wc1-2\" data-genuitec-path=\"/gms/src/main/webapp/WEB-INF/views/common/content.jsp\">\r\n");
      out.write("\t<div class=\"container single-page\">\r\n");
      out.write("\t    <div class=\"row\">\r\n");
      out.write("\t        <div class=\"col-12 col-lg-9\">\r\n");
      out.write("\t            <div class=\"content-wrap\">\r\n");
      out.write("\t                <header class=\"entry-header\">\r\n");
      out.write("\t                    <div class=\"posted-date\">\r\n");
      out.write("\t                        January 30, 2018\r\n");
      out.write("\t                    </div><!-- .posted-date -->\r\n");
      out.write("\t\r\n");
      out.write("\t                    <h2 class=\"entry-title\">How to get dress on a hiking trip</h2>\r\n");
      out.write("\t\r\n");
      out.write("\t                    <div class=\"tags-links\">\r\n");
      out.write("\t                        <a href=\"#\">#winter</a>\r\n");
      out.write("\t                        <a href=\"#\">#love</a>\r\n");
      out.write("\t                        <a href=\"#\">#snow</a>\r\n");
      out.write("\t                        <a href=\"#\">#january</a>\r\n");
      out.write("\t                    </div><!-- .tags-links -->\r\n");
      out.write("\t                </header><!-- .entry-header -->\r\n");
      out.write("\t\r\n");
      out.write("\t                <figure class=\"featured-image\">\r\n");
      out.write("\t                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/3.jpg\" alt=\"\">\r\n");
      out.write("\t                </figure><!-- .featured-image -->\r\n");
      out.write("\t\r\n");
      out.write("\t                <div class=\"entry-content\">\r\n");
      out.write("\t                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent vel tortor facilisis, volutpat nulla placerat, tincidunt mi. Nullam vel orci dui. Suspendisse sit amet laoreet neque. Fusce sagittis suscipit sem a consequat. Proin nec interdum sem. Quisque in porttitor magna, a imperdiet est. </p>\r\n");
      out.write("\t                </div><!-- .entry-content -->\r\n");
      out.write("\t\r\n");
      out.write("\t                <footer class=\"entry-footer flex flex-column flex-lg-row justify-content-between align-content-start align-lg-items-center\">\r\n");
      out.write("\t                    <ul class=\"post-share flex align-items-center order-3 order-lg-1\">\r\n");
      out.write("\t                        <label>Share</label>\r\n");
      out.write("\t                        <li><a href=\"#\"><i class=\"fa fa-pinterest\"></i></a></li>\r\n");
      out.write("\t                        <li><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li>\r\n");
      out.write("\t                        <li><a href=\"#\"><i class=\"fa fa-instagram\"></i></a></li>\r\n");
      out.write("\t                        <li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("\t                        <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("\t                    </ul><!-- .post-share -->\r\n");
      out.write("\t\r\n");
      out.write("\t                    <a class=\"read-more order-2\" href=\"#\">Read more</a>\r\n");
      out.write("\t\r\n");
      out.write("\t                    <div class=\"comments-count order-1 order-lg-3\">\r\n");
      out.write("\t                        <a href=\"#\">2 Comments</a>\r\n");
      out.write("\t                    </div><!-- .comments-count -->\r\n");
      out.write("\t                </footer><!-- .entry-footer -->\r\n");
      out.write("\t            </div><!-- .content-wrap -->\r\n");
      out.write("\t\r\n");
      out.write("\t            <div class=\"pagination\">\r\n");
      out.write("\t                <ul class=\"flex align-items-center\">\r\n");
      out.write("\t                    <li class=\"active\"><a href=\"#\">01.</a></li>\r\n");
      out.write("\t                    <li><a href=\"#\">02.</a></li>\r\n");
      out.write("\t                    <li><a href=\"#\">03.</a></li>\r\n");
      out.write("\t                </ul>\r\n");
      out.write("\t            </div>\r\n");
      out.write("\t        </div><!-- .col -->\r\n");
      out.write("\t\r\n");
      out.write("\t        <div class=\"col-12 col-lg-3\">\r\n");
      out.write("\t            <div class=\"sidebar\">\r\n");
      out.write("\t                <div class=\"about-me\">\r\n");
      out.write("\t                    <h2>I’m Amelia Smith</h2>\r\n");
      out.write("\t\r\n");
      out.write("\t                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent vel tortor facilisis, volutpat nulla placerat, tincidunt mi. Nullam vel orci dui. Suspendisse sit amet laoreet neque. Fusce sagittis suscipit sem a consequat. Proin nec interdum sem. Quisque in porttitor magna.</p>\r\n");
      out.write("\t                </div><!-- .about-me -->\r\n");
      out.write("\t\r\n");
      out.write("\t                <div class=\"recent-posts\">\r\n");
      out.write("\t                    <div class=\"recent-post-wrap\">\r\n");
      out.write("\t                        <figure>\r\n");
      out.write("\t                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/thumb-1.jpg\" alt=\"\">\r\n");
      out.write("\t                        </figure>\r\n");
      out.write("\t\r\n");
      out.write("\t                        <header class=\"entry-header\">\r\n");
      out.write("\t                            <div class=\"posted-date\">\r\n");
      out.write("\t                                January 30, 2018\r\n");
      out.write("\t                            </div><!-- .entry-header -->\r\n");
      out.write("\t\r\n");
      out.write("\t                            <h3><a href=\"#\">My fall in love story</a></h3>\r\n");
      out.write("\t\r\n");
      out.write("\t                        </header><!-- .entry-header -->\r\n");
      out.write("\t                    </div><!-- .recent-post-wrap -->\r\n");
      out.write("\t\r\n");
      out.write("\t                </div><!-- .recent-posts -->\r\n");
      out.write("\t\r\n");
      out.write("\t            </div><!-- .sidebar -->\r\n");
      out.write("\t        </div><!-- .col -->\r\n");
      out.write("\t    </div><!-- .row -->\r\n");
      out.write("\t</div><!-- .container -->\r\n");
      out.write("</div>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}