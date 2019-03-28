package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Model.Product;
import Model.Cart;
import Dao.ProductDAO;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Content Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 ProductDAO productDAO = new ProductDAO();
            ArrayList<Product> listProduct = productDAO.getAllListProduct();
        
      out.write("\n");
      out.write("        <!---->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <div class=\"content-top\">\n");
      out.write("                    <h3 class=\"future\">Sản Phẩm</h3>\n");
      out.write("                    <div class=\"content-top-in\">\n");
      out.write("                        ");
 for (Product p : listProduct) {
      out.write(" \n");
      out.write("                        <div class=\"col-md-3 md-col\">\n");
      out.write("                            <div class=\"col-md\">\n");
      out.write("                                <a href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write("\"><img  src=\"");
      out.print(p.getProductImage());
      out.write("\" alt=\"\" /></a>\t\n");
      out.write("                                <div class=\"top-content\">\n");
      out.write("                                    <h5><a href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write('"');
      out.write('>');
      out.print(p.getProductName());
      out.write("</a></h5>\n");
      out.write("                                    <div class=\"white\">\n");
      out.write("                                        <a href=\"CartServlet?command=plus&productID=");
      out.print(p.getProductID());
      out.write("\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2 \">Thêm vào giỏ hàng</a>\n");
      out.write("                                        <p class=\"dollar\"><span class=\"in-dollar\">$</span><span>");
      out.print(p.getProductPrice());
      out.write("</span></p>\n");
      out.write("                                        <div class=\"clearfix\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\t\t\t\t\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!---->\n");
      out.write("                <div class=\"content-middle\">\n");
      out.write("                    <h3 class=\"future\">Nhãn hiệu</h3>\n");
      out.write("                    <div class=\"content-middle-in\">\n");
      out.write("                        <ul id=\"flexiselDemo1\">\t\t\t\n");
      out.write("                            <li><img src=\"images/ap2.png\"/></li>\n");
      out.write("                            <li><img src=\"images/converse.png\"/></li>\n");
      out.write("                            <li><img src=\"images/ap.png\"/></li>\n");
      out.write("                            <li><img src=\"images/ap1.png\"/></li>\n");
      out.write("                            <li><img src=\"images/ap3.png\"/></li>\n");
      out.write("                            <li><img src=\"images/nike.png\"/></li>\n");
      out.write("                            <li><img src=\"images/vans.png\"/></li>\n");
      out.write("                            <li><img src=\"images/puma.png\"/></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <script type=\"text/javascript\">\n");
      out.write("                            $(window).load(function () {\n");
      out.write("                                $(\"#flexiselDemo1\").flexisel({\n");
      out.write("                                    visibleItems: 4,\n");
      out.write("                                    animationSpeed: 1000,\n");
      out.write("                                    autoPlay: true,\n");
      out.write("                                    autoPlaySpeed: 3000,\n");
      out.write("                                    pauseOnHover: true,\n");
      out.write("                                    enableResponsiveBreakpoints: true,\n");
      out.write("                                    responsiveBreakpoints: {\n");
      out.write("                                        portrait: {\n");
      out.write("                                            changePoint: 480,\n");
      out.write("                                            visibleItems: 1\n");
      out.write("                                        },\n");
      out.write("                                        landscape: {\n");
      out.write("                                            changePoint: 640,\n");
      out.write("                                            visibleItems: 2\n");
      out.write("                                        },\n");
      out.write("                                        tablet: {\n");
      out.write("                                            changePoint: 768,\n");
      out.write("                                            visibleItems: 3\n");
      out.write("                                        }\n");
      out.write("                                    }\n");
      out.write("                                });\n");
      out.write("\n");
      out.write("                            });\n");
      out.write("                        </script>\n");
      out.write("                        <script type=\"text/javascript\" src=\"js/jquery.flexisel.js\"></script>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!---->\n");
      out.write("                <div class=\"content-bottom\">\n");
      out.write("                    <h3 class=\"future\">Khuyến mãi</h3>\n");
      out.write("                    <div class=\"content-bottom-in\">\n");
      out.write("                        <ul id=\"flexiselDemo2\">\t\n");
      out.write("                            ");
 for (Product p : listProduct) {
      out.write(" \n");
      out.write("                            <li> \n");
      out.write("                                <div class=\"col-md men\">\n");
      out.write("                                    <a href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write("\" class=\"compare-in \"><img  src=\"");
      out.print(p.getProductImage());
      out.write("\" alt=\"\" />\n");
      out.write("                                        <div class=\"compare in-compare\">  \n");
      out.write("                                        </div></a>\n");
      out.write("                                    <div class=\"top-content bag\">\n");
      out.write("                                        <h5><a href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write('"');
      out.write('>');
      out.print(p.getProductName());
      out.write("</a></h5>\n");
      out.write("                                        <div class=\"white\">\n");
      out.write("                                            <a href=\"CartServlet?command=plus&productID=");
      out.print(p.getProductID());
      out.write("\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">Thêm giỏ hàng</a>\n");
      out.write("                                            <p class=\"dollar\"><span class=\"in-dollar\">$</span><span>");
      out.print(p.getProductPrice());
      out.write("</span></p>\n");
      out.write("                                            <div class=\"clearfix\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\t\t\t\t\t\t\t\n");
      out.write("                                </div>  \n");
      out.write("                            </li>\n");
      out.write("                             ");
 }
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                        <script type=\"text/javascript\">\n");
      out.write("                            $(window).load(function () {\n");
      out.write("                                $(\"#flexiselDemo2\").flexisel({\n");
      out.write("                                    visibleItems: 4,\n");
      out.write("                                    animationSpeed: 1000,\n");
      out.write("                                    autoPlay: true,\n");
      out.write("                                    autoPlaySpeed: 3000,\n");
      out.write("                                    pauseOnHover: true,\n");
      out.write("                                    enableResponsiveBreakpoints: true,\n");
      out.write("                                    responsiveBreakpoints: {\n");
      out.write("                                        portrait: {\n");
      out.write("                                            changePoint: 480,\n");
      out.write("                                            visibleItems: 1\n");
      out.write("                                        },\n");
      out.write("                                        landscape: {\n");
      out.write("                                            changePoint: 640,\n");
      out.write("                                            visibleItems: 2\n");
      out.write("                                        },\n");
      out.write("                                        tablet: {\n");
      out.write("                                            changePoint: 768,\n");
      out.write("                                            visibleItems: 3\n");
      out.write("                                        }\n");
      out.write("                                    }\n");
      out.write("                                });\n");
      out.write("\n");
      out.write("                            });\n");
      out.write("                        </script>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
