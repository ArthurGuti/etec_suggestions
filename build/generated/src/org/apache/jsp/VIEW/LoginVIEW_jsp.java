package org.apache.jsp.VIEW;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginVIEW_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <!-- <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sugestao jsp</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <form action=\"../LoginSERVLET\" method=\"GET\">\n");
      out.write("            \n");
      out.write("            E-Mail\n");
      out.write("            <input type=\"text\" name=\"email\">\n");
      out.write("            <br>\n");
      out.write("            Senha\n");
      out.write("            <input type=\"password\" name=\"senha\">\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" name=\"btncadest\" value=\"Login\">\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html> -->\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <!-- <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> -->\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Login</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/stylesLogin.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"modal\" action=\"../LoginSERVLET\" method=\"GET\"> \n");
      out.write("        <h1 class=\"titulo\"> Login Etec</h1>\n");
      out.write("        <input\n");
      out.write("            class=\"textField\" \n");
      out.write("            type=\"email\" \n");
      out.write("            name=\"email\"\n");
      out.write("            autocomplete=\"off\" \n");
      out.write("            placeholder=\"Email...\"\n");
      out.write("            title=\"Campo para inserir o email de login do funcionário\" \n");
      out.write("        ></input> \n");
      out.write("        <br>\n");
      out.write("        <input \n");
      out.write("            class=\"textField\" \n");
      out.write("            type=\"password\" \n");
      out.write("            name=\"senha\"\n");
      out.write("            autocomplete=\"off\" \n");
      out.write("            placeholder=\"Senha...\"\n");
      out.write("            title=\"Campo para inserir a senha de login do funcionário\" \n");
      out.write("            required=\"\"\n");
      out.write("        ></input> \n");
      out.write("        <br>    \n");
      out.write("        <button \n");
      out.write("            title=\"Botão de ação para cancelar\" \n");
      out.write("            class=\"botao\" \n");
      out.write("            id=\"cancelar\" \n");
      out.write("            onclick=\"trocarTela\"\n");
      out.write("        >\n");
      out.write("            Cancelar\n");
      out.write("        </button>\n");
      out.write("        <button \n");
      out.write("            title=\"Botão de ação para Logar\" \n");
      out.write("            class=\"botao\" \n");
      out.write("            id=\"salvar\" \n");
      out.write("            onclick=\"\"\n");
      out.write("            type=\"submit\" \n");
      out.write("            name=\"btncadest\" \n");
      out.write("            value=\"Login\"\n");
      out.write("        >\n");
      out.write("            Salvar\n");
      out.write("        </button>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"imagem\">\n");
      out.write("        <img title=\"Imagem ilustrativa indicando a criação do cadastro\" href=\"../images/login.svg\"/>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("        let tituloElemento = document.getElementById(\"titulo2\")\n");
      out.write("\n");
      out.write("        tituloElemento.onclick = trocarTela\n");
      out.write("    </script> \n");
      out.write("</body>\n");
      out.write("</html>");
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
