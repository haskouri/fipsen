package org.apache.jsp.pages.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<table width=\"100%\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td align=\"center\">\r\n");
      out.write("<div id=\"content\">\r\n");
      out.write(" <div class=\"gboxtop\"></div>\r\n");
      out.write(" <div class=\"gbox\">\r\n");
      out.write("    <table style=\"width: 95%; height: 1%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td style=\"height: 14px; width: 100%;\" valign=\"top\">\r\n");
      out.write("                 <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                      <tr>\r\n");
      out.write("                          <td style=\"height: 10px; width: 450px;font-size: 10pt;\" valign=\"top\"><b>© Copyright 2009-2010 Fipsen. All Rights Reserved.</b><br />\r\n");
      out.write("                              <span style=\"font-family: Verdana; font-size: 10pt;\">HelpLine::</span>\r\n");
      out.write("                               <span style=\"font-size: 8pt; mso-bidi-font-family: Arial\">\r\n");
      out.write("                               \r\n");
      out.write("                               </span>\r\n");
      out.write("                          </td>\r\n");
      out.write("                          <td align=\"right\" class=\"baseline\" style=\"height: 17px\" valign=\"top\">\r\n");
      out.write("                                <span style=\"font-family: Verdana;font-size: 10pt;\">Developed by <b><a href=\"http://www.intrigueit.com\" target=\"_blank\">Intrigue IT.</a></b></span><br>\r\n");
      out.write("                                <span style=\"font-family: Verdana;font-size: 10pt;\">Version 0.00.00</span>\r\n");
      out.write("                          </td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("   </table>\r\n");
      out.write(" </div>  \r\n");
      out.write("</div>\r\n");
      out.write("</td>\r\n");
      out.write(" </tr> \r\n");
      out.write("</table>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
