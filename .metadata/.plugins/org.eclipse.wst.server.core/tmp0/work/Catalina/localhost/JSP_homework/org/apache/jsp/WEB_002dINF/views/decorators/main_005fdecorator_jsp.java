/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.59
 * Generated at: 2020-11-06 08:13:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.decorators;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.URLDecoder;

public final class main_005fdecorator_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/D:/workspace_JSP/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/JSP_homework/WEB-INF/lib/sitemesh-2.4.2.jar!/META-INF/sitemesh-decorator.tld", Long.valueOf(1123645892000L));
    _jspx_dependants.put("/WEB-INF/views/include/footer.jsp", Long.valueOf(1604546488372L));
    _jspx_dependants.put("/WEB-INF/views/include/header.jsp", Long.valueOf(1604633753459L));
    _jspx_dependants.put("/WEB-INF/lib/sitemesh-2.4.2.jar", Long.valueOf(1604630246474L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.net.URLDecoder");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdecorator_005ftitle_0026_005fdefault_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody;

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
    _005fjspx_005ftagPool_005fdecorator_005ftitle_0026_005fdefault_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fdecorator_005ftitle_0026_005fdefault_005fnobody.release();
    _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody.release();
    _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("This is a starter template page. Use this page to start your new project from\r\n");
      out.write("scratch. This page gets rid of all links and provides the needed markup only.\r\n");
      out.write("-->\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t\t<meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<title>");
      if (_jspx_meth_decorator_005ftitle_005f0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- Font Awesome Icons -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/bootstrap/plugins/fontawesome-free/css/all.min.css\">\r\n");
      out.write("\t\t<!-- Theme style -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/bootstrap/dist/css/adminlte.min.css\">\r\n");
      out.write("\t\t<!-- Google Font: Source Sans Pro -->\r\n");
      out.write("\t\t<link\r\n");
      out.write("\t\t\thref=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700\"\r\n");
      out.write("\t\t\trel=\"stylesheet\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_decorator_005fhead_005f0(_jspx_page_context))
        return;
      out.write("</head>\r\n");
      out.write("\t<body class=\"hold-transition sidebar-mini\">\r\n");
      out.write("\t\t<div class=\"wrapper\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t<!-- Navbar -->\r\n");
      out.write("\t\t\t<nav\r\n");
      out.write("\t\t\t\tclass=\"main-header navbar navbar-expand navbar-white navbar-light\">\r\n");
      out.write("\t\t\t\t<!-- Left navbar links -->\r\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav\">\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" data-widget=\"pushmenu\"\r\n");
      out.write("\t\t\t\t\t\thref=\"#\" role=\"button\"><i class=\"fas fa-bars\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item d-none d-sm-inline-block\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"index3.html\" class=\"nav-link\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item d-none d-sm-inline-block\"><a href=\"#\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"nav-link\">Contact</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t<!-- SEARCH FORM -->\r\n");
      out.write("\t\t\t\t<form class=\"form-inline ml-3\">\r\n");
      out.write("\t\t\t\t\t<div class=\"input-group input-group-sm\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"form-control form-control-navbar\" type=\"search\"\r\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group-append\">\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"btn btn-navbar\" type=\"submit\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fas fa-search\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t<!-- Right navbar links -->\r\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("\t\t\t\t\t<!-- Messages Dropdown Menu -->\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item dropdown\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\"> <i class=\"far fa-comments\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"badge badge-danger navbar-badge\">3</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dropdown-menu dropdown-menu-lg dropdown-menu-right\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-item\"> <!-- Message Start -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/resources/bootstrap/dist/img/user1-128x128.jpg\" alt=\"User Avatar\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"img-size-50 mr-3 img-circle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3 class=\"dropdown-item-title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tBrad Diesel <span class=\"float-right text-sm text-danger\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"fas fa-star\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"text-sm\">Call me whenever you can...</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"text-sm text-muted\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"far fa-clock mr-1\"></i> 4 Hours Ago\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div> <!-- Message End -->\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-item\"> <!-- Message Start -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/resources/bootstrap/dist/img/user8-128x128.jpg\" alt=\"User Avatar\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"img-size-50 img-circle mr-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3 class=\"dropdown-item-title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tJohn Pierce <span class=\"float-right text-sm text-muted\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"fas fa-star\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"text-sm\">I got your message bro</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"text-sm text-muted\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"far fa-clock mr-1\"></i> 4 Hours Ago\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div> <!-- Message End -->\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-item\"> <!-- Message Start -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/resources/bootstrap/dist/img/user3-128x128.jpg\" alt=\"User Avatar\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"img-size-50 img-circle mr-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3 class=\"dropdown-item-title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tNora Silvester <span class=\"float-right text-sm text-warning\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"fas fa-star\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"text-sm\">The subject goes here</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"text-sm text-muted\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"far fa-clock mr-1\"></i> 4 Hours Ago\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div> <!-- Message End -->\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-item dropdown-footer\">See All\r\n");
      out.write("\t\t\t\t\t\t\t\tMessages</a>\r\n");
      out.write("\t\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t\t<!-- Notifications Dropdown Menu -->\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item dropdown\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\"> <i class=\"far fa-bell\"></i> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"badge badge-warning navbar-badge\">15</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dropdown-menu dropdown-menu-lg dropdown-menu-right\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"dropdown-header\">15 Notifications</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-item\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fas fa-envelope mr-2\"></i> 4 new messages <span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"float-right text-muted text-sm\">3 mins</span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-item\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fas fa-users mr-2\"></i> 8 friend requests <span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"float-right text-muted text-sm\">12 hours</span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-item\"> <i class=\"fas fa-file mr-2\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t3 new reports <span class=\"float-right text-muted text-sm\">2\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdays</span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-item dropdown-footer\">See All\r\n");
      out.write("\t\t\t\t\t\t\t\tNotifications</a>\r\n");
      out.write("\t\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\t\tdata-widget=\"control-sidebar\" data-slide=\"true\" href=\"#\"\r\n");
      out.write("\t\t\t\t\t\trole=\"button\"><i class=\"fas fa-th-large\"></i></a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t\t<!-- /.navbar -->\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t<!-- Main Sidebar Container -->\r\n");
      out.write("\t\t\t<aside class=\"main-sidebar sidebar-dark-primary elevation-4\">\r\n");
      out.write("\t\t\t\t<!-- Brand Logo -->\r\n");
      out.write("\t\t\t\t<a href=\"index3.html\" class=\"brand-link\"> <img\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/resources/bootstrap/dist/img/AdminLTELogo.png\" alt=\"AdminLTE Logo\"\r\n");
      out.write("\t\t\t\t\tclass=\"brand-image img-circle elevation-3\" style=\"opacity: .8\">\r\n");
      out.write("\t\t\t\t\t<span class=\"brand-text font-weight-light\">AdminLTE 3</span>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t<!-- Sidebar -->\r\n");
      out.write("\t\t\t\t<div class=\"sidebar\">\r\n");
      out.write("\t\t\t\t\t<!-- Sidebar user panel (optional) -->\r\n");
      out.write("\t\t\t\t\t<div class=\"user-panel mt-3 pb-3 mb-3 d-flex\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"image\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/resources/bootstrap/dist/img/user2-160x160.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"img-circle elevation-2\" alt=\"User Image\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"info\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"d-block\">Alexander Pierce</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t<!-- Sidebar Menu -->\r\n");
      out.write("\t\t\t\t\t<nav class=\"mt-2\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav nav-pills nav-sidebar flex-column\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-widget=\"treeview\" role=\"menu\" data-accordion=\"false\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Add icons to the links using the .nav-icon class\r\n");
      out.write("\t               with font-awesome or any other icon font library -->\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item has-treeview menu-open\"><a href=\"#\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"nav-link active\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"nav-icon fas fa-tachometer-alt\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tStarter Pages <i class=\"right fas fa-angle-left\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"nav nav-treeview\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"#\" class=\"nav-link active\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>Active Page</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"#\" class=\"nav-link\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>Inactive Page</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"#\" class=\"nav-link\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"nav-icon fas fa-th\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tSimple Link <span class=\"right badge badge-danger\">New</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t\t<!-- /.sidebar-menu -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- /.sidebar -->\r\n");
      out.write("\t\t\t</aside>");
      if (_jspx_meth_decorator_005fbody_005f0(_jspx_page_context))
        return;
      out.write("<!-- Control Sidebar -->\r\n");
      out.write("\t\t\t<aside class=\"control-sidebar control-sidebar-dark\">\r\n");
      out.write("\t\t\t\t<!-- Control sidebar content goes here -->\r\n");
      out.write("\t\t\t\t<div class=\"p-3\">\r\n");
      out.write("\t\t\t\t\t<h5>Title</h5>\r\n");
      out.write("\t\t\t\t\t<p>Sidebar content</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</aside>\r\n");
      out.write("\t\t\t<!-- /.control-sidebar -->\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t<!-- Main Footer -->\r\n");
      out.write("\t\t\t<footer class=\"main-footer\">\r\n");
      out.write("\t\t\t\t<!-- To the right -->\r\n");
      out.write("\t\t\t\t<div class=\"float-right d-none d-sm-inline\">Anything you want</div>\r\n");
      out.write("\t\t\t\t<!-- Default to the left -->\r\n");
      out.write("\t\t\t\t<strong>Copyright &copy; 2014-2019 <a\r\n");
      out.write("\t\t\t\t\thref=\"https://adminlte.io\">AdminLTE.io</a>.\r\n");
      out.write("\t\t\t\t</strong> All rights reserved.\r\n");
      out.write("\t\t\t</footer>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- ./wrapper -->\r\n");
      out.write("\t\r\n");
      out.write("\t\t<!-- REQUIRED SCRIPTS -->\r\n");
      out.write("\t\r\n");
      out.write("\t\t<!-- jQuery -->\r\n");
      out.write("\t\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/bootstrap/plugins/jquery/jquery.min.js\"></script>\r\n");
      out.write("\t\t<!-- Bootstrap 4 -->\r\n");
      out.write("\t\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/bootstrap/plugins/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\t\t<!-- AdminLTE App -->\r\n");
      out.write("\t\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/bootstrap/dist/js/adminlte.min.js\"></script>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_decorator_005ftitle_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  decorator:title
    com.opensymphony.module.sitemesh.taglib.decorator.TitleTag _jspx_th_decorator_005ftitle_005f0 = (com.opensymphony.module.sitemesh.taglib.decorator.TitleTag) _005fjspx_005ftagPool_005fdecorator_005ftitle_0026_005fdefault_005fnobody.get(com.opensymphony.module.sitemesh.taglib.decorator.TitleTag.class);
    boolean _jspx_th_decorator_005ftitle_005f0_reused = false;
    try {
      _jspx_th_decorator_005ftitle_005f0.setPageContext(_jspx_page_context);
      _jspx_th_decorator_005ftitle_005f0.setParent(null);
      // /WEB-INF/views/include/header.jsp(18,9) name = default type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_decorator_005ftitle_005f0.setDefault("");
      int _jspx_eval_decorator_005ftitle_005f0 = _jspx_th_decorator_005ftitle_005f0.doStartTag();
      if (_jspx_th_decorator_005ftitle_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fdecorator_005ftitle_0026_005fdefault_005fnobody.reuse(_jspx_th_decorator_005ftitle_005f0);
      _jspx_th_decorator_005ftitle_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_decorator_005ftitle_005f0, _jsp_getInstanceManager(), _jspx_th_decorator_005ftitle_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_decorator_005fhead_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  decorator:head
    com.opensymphony.module.sitemesh.taglib.decorator.HeadTag _jspx_th_decorator_005fhead_005f0 = (com.opensymphony.module.sitemesh.taglib.decorator.HeadTag) _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody.get(com.opensymphony.module.sitemesh.taglib.decorator.HeadTag.class);
    boolean _jspx_th_decorator_005fhead_005f0_reused = false;
    try {
      _jspx_th_decorator_005fhead_005f0.setPageContext(_jspx_page_context);
      _jspx_th_decorator_005fhead_005f0.setParent(null);
      int _jspx_eval_decorator_005fhead_005f0 = _jspx_th_decorator_005fhead_005f0.doStartTag();
      if (_jspx_th_decorator_005fhead_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody.reuse(_jspx_th_decorator_005fhead_005f0);
      _jspx_th_decorator_005fhead_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_decorator_005fhead_005f0, _jsp_getInstanceManager(), _jspx_th_decorator_005fhead_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_decorator_005fbody_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  decorator:body
    com.opensymphony.module.sitemesh.taglib.decorator.BodyTag _jspx_th_decorator_005fbody_005f0 = (com.opensymphony.module.sitemesh.taglib.decorator.BodyTag) _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody.get(com.opensymphony.module.sitemesh.taglib.decorator.BodyTag.class);
    boolean _jspx_th_decorator_005fbody_005f0_reused = false;
    try {
      _jspx_th_decorator_005fbody_005f0.setPageContext(_jspx_page_context);
      _jspx_th_decorator_005fbody_005f0.setParent(null);
      int _jspx_eval_decorator_005fbody_005f0 = _jspx_th_decorator_005fbody_005f0.doStartTag();
      if (_jspx_th_decorator_005fbody_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody.reuse(_jspx_th_decorator_005fbody_005f0);
      _jspx_th_decorator_005fbody_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_decorator_005fbody_005f0, _jsp_getInstanceManager(), _jspx_th_decorator_005fbody_005f0_reused);
    }
    return false;
  }
}