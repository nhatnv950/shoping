package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>contact</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"contact\">\n");
      out.write("                    <h2 class=\" contact-in\">CONTACT</h2>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-6 contact-top\">\n");
      out.write("                        <h3>Info</h3>\n");
      out.write("                        <div class=\"map\">\n");
      out.write("                            <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d37494223.23909492!2d103!3d55!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x453c569a896724fb%3A0x1409fdf86611f613!2sRussia!5e0!3m2!1sen!2sin!4v1415776049771\"></iframe>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas </p>\n");
      out.write("                        <p>Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id </p>\t\t\t\t\n");
      out.write("                        <ul class=\"social \">\n");
      out.write("                            <li><span><i > </i>124 Avenue Street, Los angeles,California </span></li>\n");
      out.write("                            <li><span><i class=\"down\"> </i>+ 00 123 456 7890</span></li>\n");
      out.write("                            <li><a href=\"mailto:info@example.com\"><i class=\"mes\"> </i>info@example.com</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6 contact-top\">\n");
      out.write("                        <h3>Want to work with me?</h3>\n");
      out.write("                        <div>\n");
      out.write("                            <span>Your Name </span>\t\t\n");
      out.write("                            <input type=\"text\" value=\"\" >\t\t\t\t\t\t\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <span>Your Email </span>\t\t\n");
      out.write("                            <input type=\"text\" value=\"\" >\t\t\t\t\t\t\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <span>Subject</span>\t\t\n");
      out.write("                            <input type=\"text\" value=\"\" >\t\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <span>Your Message</span>\t\t\n");
      out.write("                            <textarea> </textarea>\t\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"submit\" value=\"SEND\" >\t\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
