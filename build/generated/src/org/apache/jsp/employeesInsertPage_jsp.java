package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class employeesInsertPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>TimeSheet - Cadastro de Funcionários</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Cadastro de Funcionários</h1>\r\n");
      out.write("        <form action=\"EmployeesController\">\r\n");
      out.write("            ID<input type=\"number\" name=\"idEmployee\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"\" required/><br>\r\n");
      out.write("            Nome<input type=\"text\" name=\"employeeName\" min=\"3\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Digite o Nome do Funcionário\" required/><br>\r\n");
      out.write("            SAP<input type=\"text\" name=\"sAPCCName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Digite a área do Funcionário\"/><br>\r\n");
      out.write("            WS<input type=\"text\" name=\"ws\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Digite o Tipo de Horário Funcionário\"/><br>\r\n");
      out.write("            Nº CARTÃO<input type=\"text\" name=\"idCard\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Digite o Nº do Cartão NFC\"/><br>\r\n");
      out.write("            ESTADO DO CARTÃO\r\n");
      out.write("            <select name=\"idCardState\">\r\n");
      out.write("                <option value=\"1\" selected>Cartão Activo</option>\r\n");
      out.write("                <option value=\"2\">Cartão Desactivo</option>\r\n");
      out.write("            </select><br>\r\n");
      out.write("            <textarea name=\"description\"></textarea>\r\n");
      out.write("            <input type=\"hidden\" name=\"action\" value=\"insert\"/>\r\n");
      out.write("            <input type=\"submit\">\r\n");
      out.write("            <input type=\"reset\">\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
