/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-10-23 06:11:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/DISHA/eclipse-workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Employee_Task_Management_System/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098691290000L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1697868698502L));
  }

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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Register</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("            background-image: url('https://images.pexels.com/photos/3184639/pexels-photo-3184639.jpeg?cs=srgb&dl=pexels-fauxels-3184639.jpg&fm=jpg'); \r\n");
      out.write("            background-size: cover;\r\n");
      out.write("            background-repeat: no-repeat;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("        }\r\n");
      out.write("        .container {\r\n");
      out.write("            max-width: 600px;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            background: #fff;\r\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("            border-radius: 8px;\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("        .form-group {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: space-between;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        .form-group label, .form-group input, .form-group select {\r\n");
      out.write("            flex: 1;\r\n");
      out.write("        }\r\n");
      out.write("        .form-group label {\r\n");
      out.write("            text-align: left;\r\n");
      out.write("        }\r\n");
      out.write("        input[type=\"text\"], input[type=\"password\"], select {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            border: 1px solid #ccc;\r\n");
      out.write("            border-radius: 4px;\r\n");
      out.write("        }\r\n");
      out.write("        input[type=\"submit\"] {\r\n");
      out.write("            background-color: #007BFF;\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 10px 15px;\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 4px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            transition: background-color 0.3s;\r\n");
      out.write("        }\r\n");
      out.write("        input[type=\"submit\"]:hover {\r\n");
      out.write("            background-color: #0056b3;\r\n");
      out.write("        }\r\n");
      out.write("        a {\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            color: #007BFF;\r\n");
      out.write("        }\r\n");
      out.write("        a:hover {\r\n");
      out.write("            text-decoration: underline;\r\n");
      out.write("        }\r\n");
      out.write("        h2 {\r\n");
      out.write("            color: blue;\r\n");
      out.write("        }\r\n");
      out.write("        .error {\r\n");
      out.write("            color: red;\r\n");
      out.write("        }\r\n");
      out.write("        img {\r\n");
      out.write("            max-width: 100%;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<br> <br>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <h2>Register on Employee Task Management System</h2>\r\n");
      out.write("        <form action=\"RegisterServlet\" method=\"post\" onsubmit=\"return validateForm()\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"Emp_ID\">Employee ID:</label>\r\n");
      out.write("                <input type=\"text\" id=\"Emp_ID\" name=\"Emp_ID\" required placeholder=\"must be numeric\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"First_Name\">First Name:</label>\r\n");
      out.write("                <input type=\"text\" id=\"First_Name\" name=\"First_Name\" required placeholder=\"must be alphabetical\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"Last_Name\">Last Name:</label>\r\n");
      out.write("                <input type=\"text\" id=\"Last_Name\" name=\"Last_Name\" required required placeholder=\"must be alphabetical\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--<div class=\"form-group\">\r\n");
      out.write("                <label for=\"Street\">Street:</label>\r\n");
      out.write("                <input type=\"text\" id=\"Street\" name \"Street\" required>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"City\">City:</label>\r\n");
      out.write("                <input type=\"text\" id=\"City\" name=\"City\" required>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"State\">State:</label>\r\n");
      out.write("                <input type=\"text\" id=\"State\" name=\"State\" required>\r\n");
      out.write("            </div>-->\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"Date_Of_Joining\">Date of Joining:</label>\r\n");
      out.write("                <!-- <input type=\"text\" id=\"Date_of_joining\" name=\"Date_of_joining\" required placeholder=\"yyyy-mm-dd format\">-->\r\n");
      out.write("                 <input type=\"date\" name=\"Date_Of_Joining\" required>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"Phone_No\">Phone Number:</label>\r\n");
      out.write("                <input type=\"text\" id=\"Phone_No\" name=\"Phone_No\" required placeholder=\"must be 10 digit long\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--  <div class=\"form-group\">\r\n");
      out.write("                <label for=\"Alternate_phone\">Alternate Phone Number:</label>\r\n");
      out.write("                <input type=\"text\" id=\"Alternate_phone\" name=\"Alternate_phone\" required>\r\n");
      out.write("            </div>-->\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"Email\">Email:</label>\r\n");
      out.write("                <input type=\"text\" id=\"Email\" name=\"Email\" required placeholder=\"username@example.com\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"Password\">Password:</label>\r\n");
      out.write("                <input type=\"Password\" id=\"Password\" name=\"Password\" required placeholder=\"must be at least 3 characters long\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- <div class=\"form-group\">\r\n");
      out.write("                <label for=\"role\">Role:</label>\r\n");
      out.write("                <select id=\"role\" name=\"role\">\r\n");
      out.write("                    <option value=\"employee\">Employee</option>\r\n");
      out.write("                    <option value=\"admin\">Admin</option>\r\n");
      out.write("                </select>\r\n");
      out.write("            </div> -->\r\n");
      out.write("            <input type=\"submit\" value=\"Register\">\r\n");
      out.write("            <p>Already have an account? <a href=\"login.jsp\">Login</a></p>\r\n");
      out.write("        </form>\r\n");
      out.write("        <p class=\"error\" id=\"error-message\"></p>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("    function validateForm() {\r\n");
      out.write("        var empId = document.getElementById(\"Emp_ID\").value;\r\n");
      out.write("        var firstName = document.getElementById(\"First_Name\").value;\r\n");
      out.write("        var lastName = document.getElementById(\"Last_Name\").value;\r\n");
      out.write("        var email = document.getElementById(\"Email\").value;\r\n");
      out.write("        var password = document.getElementById(\"Password\").value;\r\n");
      out.write("        var phone = document.getElementById(\"Phone_No\").value;\r\n");
      out.write("\r\n");
      out.write("        var errorElement = document.getElementById(\"error-message\");\r\n");
      out.write("        errorElement.innerText = \"\"; \r\n");
      out.write("\r\n");
      out.write("        if (!/^\\d+$/.test(empId)) {\r\n");
      out.write("            errorElement.innerText = \"Employee ID must be numeric.\";\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        if (!/^[A-Za-z]+$/.test(firstName) || !/^[A-Za-z]+$/.test(lastName)) {\r\n");
      out.write("            errorElement.innerText = \"Name must contain only alphabetic characters.\";\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        if (!/^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$/.test(email)) {\r\n");
      out.write("            errorElement.innerText = \"Invalid email format.\";\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        if (password.length < 3) {\r\n");
      out.write("            errorElement.innerText = \"Password must be at least 3 characters long.\";\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        if (phone.length !== 10) {\r\n");
      out.write("            errorElement.innerText = \"Phone must be 10 digits long.\";\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        return true; \r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--  \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Register</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<form action=register method=post>\r\n");
      out.write("		<label> Employee ID: </label>\r\n");
      out.write("		<input type=text name=\"Emp_id\"> <br> <br>\r\n");
      out.write("		<label> First Name : </label>\r\n");
      out.write("		<input type=text name=\"First_Name\"> <br> <br>\r\n");
      out.write("		<label> Last Name: </label>\r\n");
      out.write("		<input type=text name=\"Last_Name\"> <br> <br>\r\n");
      out.write("		<label> Street: </label>\r\n");
      out.write("		<input type=text name=\"Street\"> <br> <br>\r\n");
      out.write("		<label> City :</label>\r\n");
      out.write("		<input type=text name=\"City\"> <br> <br>\r\n");
      out.write("		<label> State: </label>\r\n");
      out.write("		<input type=text name=\"State\"> <br> <br>\r\n");
      out.write("		<label> Date of joining: </label>\r\n");
      out.write("		<input type=text name=\"Date_of_joining\"> <br> <br>\r\n");
      out.write("		<label> Phone Number: </label>\r\n");
      out.write("		<input type=text name=\"Phone_No\"> <br> <br>\r\n");
      out.write("		<label> Alternate Phone Number :</label>\r\n");
      out.write("		<input type=text name=\"Alternate_phone\"> <br> <br>\r\n");
      out.write("		<label> Email:</label>\r\n");
      out.write("		<input type=text name=\"Email\"> <br> <br>\r\n");
      out.write("		<label> password:</label>\r\n");
      out.write("		<input type=\"password\" name=\"password\"> <br> <br>\r\n");
      out.write("		<input type=submit value=\"Register\"> \r\n");
      out.write("		<select name=\"role\">\r\n");
      out.write("    		<option value=\"employee\">Employee</option>\r\n");
      out.write("    		<option value=\"admin\">Admin</option>\r\n");
      out.write("		</select>\r\n");
      out.write("		Already have an account? <a href=\"login.jsp\">Login</a>\r\n");
      out.write("	</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
