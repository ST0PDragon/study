/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.73
 * Generated at: 2022-02-24 18:14:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin.category;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.project.duo.domain.Category;
import java.util.List;
import com.project.duo.domain.Admin;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/views/admin/category/../../inc/bottom_link.jsp", Long.valueOf(1640595534000L));
    _jspx_dependants.put("/WEB-INF/views/admin/category/../../inc/footer.jsp", Long.valueOf(1640526080000L));
    _jspx_dependants.put("/WEB-INF/views/admin/category/../../inc/head_link.jsp", Long.valueOf(1640526578000L));
    _jspx_dependants.put("/WEB-INF/views/admin/category/../../inc/sidebar.jsp", Long.valueOf(1645555590492L));
    _jspx_dependants.put("/WEB-INF/views/admin/category/../../inc/navbar.jsp", Long.valueOf(1645555500516L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.project.duo.domain.Category");
    _jspx_imports_classes.add("com.project.duo.domain.Admin");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	List<Category> categoryList =(List)request.getAttribute("categoryList");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <title>AdminLTE 3 | Dashboard</title>\r\n");
      out.write("	\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("  <!-- Google Font: Source Sans Pro -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback\">\r\n");
      out.write("  <!-- Font Awesome -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/admin/plugins/fontawesome-free/css/all.min.css\">\r\n");
      out.write("  <!-- Ionicons -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css\">\r\n");
      out.write("  <!-- Tempusdominus Bootstrap 4 -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/admin/plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css\">\r\n");
      out.write("  <!-- iCheck -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/admin/plugins/icheck-bootstrap/icheck-bootstrap.min.css\">\r\n");
      out.write("  <!-- JQVMap -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/admin/plugins/jqvmap/jqvmap.min.css\">\r\n");
      out.write("  <!-- Theme style -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/admin/dist/css/adminlte.min.css\">\r\n");
      out.write("  <!-- overlayScrollbars -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/admin/plugins/overlayScrollbars/css/OverlayScrollbars.min.css\">\r\n");
      out.write("  <!-- Daterange picker -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/admin/plugins/daterangepicker/daterangepicker.css\">\r\n");
      out.write("  <!-- summernote -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/admin/plugins/summernote/summernote-bs4.min.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"hold-transition sidebar-mini layout-fixed\">\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Preloader -->\r\n");
      out.write("  <div class=\"preloader flex-column justify-content-center align-items-center\">\r\n");
      out.write("    <img class=\"animation__shake\" src=\"/resources/admin/dist/img/AdminLTELogo.png\" alt=\"AdminLTELogo\" height=\"60\" width=\"60\">\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <!-- Navbar -->\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("  <nav class=\"main-header navbar navbar-expand navbar-white navbar-light\">\r\n");
      out.write("    <!-- Left navbar links -->\r\n");
      out.write("    <ul class=\"navbar-nav\">\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" data-widget=\"pushmenu\" href=\"#\" role=\"button\"><i class=\"fas fa-bars\"></i></a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item d-none d-sm-inline-block\">\r\n");
      out.write("        <a href=\"index3.html\" class=\"nav-link\">Home</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item d-none d-sm-inline-block\">\r\n");
      out.write("        <a href=\"/admin/logout\" class=\"nav-link\">Logout</a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("    <!-- Right navbar links -->\r\n");
      out.write("    <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("      <!-- Navbar Search -->\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" data-widget=\"navbar-search\" href=\"#\" role=\"button\">\r\n");
      out.write("          <i class=\"fas fa-search\"></i>\r\n");
      out.write("        </a>\r\n");
      out.write("        <div class=\"navbar-search-block\">\r\n");
      out.write("          <form class=\"form-inline\">\r\n");
      out.write("            <div class=\"input-group input-group-sm\">\r\n");
      out.write("              <input class=\"form-control form-control-navbar\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("              <div class=\"input-group-append\">\r\n");
      out.write("                <button class=\"btn btn-navbar\" type=\"submit\">\r\n");
      out.write("                  <i class=\"fas fa-search\"></i>\r\n");
      out.write("                </button>\r\n");
      out.write("                <button class=\"btn btn-navbar\" type=\"button\" data-widget=\"navbar-search\">\r\n");
      out.write("                  <i class=\"fas fa-times\"></i>\r\n");
      out.write("                </button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("\r\n");
      out.write("      <!-- Messages Dropdown Menu -->\r\n");
      out.write("      <li class=\"nav-item dropdown\">\r\n");
      out.write("        <a class=\"nav-link\" data-toggle=\"dropdown\" href=\"#\">\r\n");
      out.write("          <i class=\"far fa-comments\"></i>\r\n");
      out.write("          <span class=\"badge badge-danger navbar-badge\">3</span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <div class=\"dropdown-menu dropdown-menu-lg dropdown-menu-right\">\r\n");
      out.write("          <a href=\"#\" class=\"dropdown-item\">\r\n");
      out.write("            <!-- Message Start -->\r\n");
      out.write("            <div class=\"media\">\r\n");
      out.write("              <img src=\"/resources/admin/dist/img/user1-128x128.jpg\" alt=\"User Avatar\" class=\"img-size-50 mr-3 img-circle\">\r\n");
      out.write("              <div class=\"media-body\">\r\n");
      out.write("                <h3 class=\"dropdown-item-title\">\r\n");
      out.write("                  Brad Diesel\r\n");
      out.write("                  <span class=\"float-right text-sm text-danger\"><i class=\"fas fa-star\"></i></span>\r\n");
      out.write("                </h3>\r\n");
      out.write("                <p class=\"text-sm\">Call me whenever you can...</p>\r\n");
      out.write("                <p class=\"text-sm text-muted\"><i class=\"far fa-clock mr-1\"></i> 4 Hours Ago</p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Message End -->\r\n");
      out.write("          </a>\r\n");
      out.write("          <div class=\"dropdown-divider\"></div>\r\n");
      out.write("          <a href=\"#\" class=\"dropdown-item\">\r\n");
      out.write("            <!-- Message Start -->\r\n");
      out.write("            <div class=\"media\"> \r\n");
      out.write("              <img src=\"/resources/admin/dist/img/user8-128x128.jpg\" alt=\"User Avatar\" class=\"img-size-50 img-circle mr-3\">\r\n");
      out.write("              <div class=\"media-body\">\r\n");
      out.write("                <h3 class=\"dropdown-item-title\">\r\n");
      out.write("                  John Pierce\r\n");
      out.write("                  <span class=\"float-right text-sm text-muted\"><i class=\"fas fa-star\"></i></span>\r\n");
      out.write("                </h3>\r\n");
      out.write("                <p class=\"text-sm\">I got your message bro</p>\r\n");
      out.write("                <p class=\"text-sm text-muted\"><i class=\"far fa-clock mr-1\"></i> 4 Hours Ago</p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Message End -->\r\n");
      out.write("          </a>\r\n");
      out.write("          <div class=\"dropdown-divider\"></div>\r\n");
      out.write("          <a href=\"#\" class=\"dropdown-item\">\r\n");
      out.write("            <!-- Message Start -->\r\n");
      out.write("            <div class=\"media\">\r\n");
      out.write("              <img src=\"/resources/admin/dist/img/user3-128x128.jpg\" alt=\"User Avatar\" class=\"img-size-50 img-circle mr-3\">\r\n");
      out.write("              <div class=\"media-body\">\r\n");
      out.write("                <h3 class=\"dropdown-item-title\">\r\n");
      out.write("                  Nora Silvester\r\n");
      out.write("                  <span class=\"float-right text-sm text-warning\"><i class=\"fas fa-star\"></i></span>\r\n");
      out.write("                </h3>\r\n");
      out.write("                <p class=\"text-sm\">The subject goes here</p>\r\n");
      out.write("                <p class=\"text-sm text-muted\"><i class=\"far fa-clock mr-1\"></i> 4 Hours Ago</p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Message End -->\r\n");
      out.write("          </a>\r\n");
      out.write("          <div class=\"dropdown-divider\"></div>\r\n");
      out.write("          <a href=\"#\" class=\"dropdown-item dropdown-footer\">See All Messages</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("      <!-- Notifications Dropdown Menu -->\r\n");
      out.write("      <li class=\"nav-item dropdown\">\r\n");
      out.write("        <a class=\"nav-link\" data-toggle=\"dropdown\" href=\"#\">\r\n");
      out.write("          <i class=\"far fa-bell\"></i>\r\n");
      out.write("          <span class=\"badge badge-warning navbar-badge\">15</span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <div class=\"dropdown-menu dropdown-menu-lg dropdown-menu-right\">\r\n");
      out.write("          <span class=\"dropdown-item dropdown-header\">15 Notifications</span>\r\n");
      out.write("          <div class=\"dropdown-divider\"></div>\r\n");
      out.write("          <a href=\"#\" class=\"dropdown-item\">\r\n");
      out.write("            <i class=\"fas fa-envelope mr-2\"></i> 4 new messages\r\n");
      out.write("            <span class=\"float-right text-muted text-sm\">3 mins</span>\r\n");
      out.write("          </a>\r\n");
      out.write("          <div class=\"dropdown-divider\"></div>\r\n");
      out.write("          <a href=\"#\" class=\"dropdown-item\">\r\n");
      out.write("            <i class=\"fas fa-users mr-2\"></i> 8 friend requests\r\n");
      out.write("            <span class=\"float-right text-muted text-sm\">12 hours</span>\r\n");
      out.write("          </a>\r\n");
      out.write("          <div class=\"dropdown-divider\"></div>\r\n");
      out.write("          <a href=\"#\" class=\"dropdown-item\">\r\n");
      out.write("            <i class=\"fas fa-file mr-2\"></i> 3 new reports\r\n");
      out.write("            <span class=\"float-right text-muted text-sm\">2 days</span>\r\n");
      out.write("          </a>\r\n");
      out.write("          <div class=\"dropdown-divider\"></div>\r\n");
      out.write("          <a href=\"#\" class=\"dropdown-item dropdown-footer\">See All Notifications</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" data-widget=\"fullscreen\" href=\"#\" role=\"button\">\r\n");
      out.write("          <i class=\"fas fa-expand-arrows-alt\"></i>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" data-widget=\"control-sidebar\" data-controlsidebar-slide=\"true\" href=\"#\" role=\"button\">\r\n");
      out.write("          <i class=\"fas fa-th-large\"></i>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </nav>\r\n");
      out.write("\r\n");
      out.write("  <!-- /.navbar -->\r\n");
      out.write("\r\n");
      out.write("  <!-- Main Sidebar Container -->\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("\r\n");

	Admin admin = (Admin)session.getAttribute("admin");

      out.write("\r\n");
      out.write("  <aside class=\"main-sidebar sidebar-dark-primary elevation-4\">\r\n");
      out.write("    <!-- Brand Logo -->\r\n");
      out.write("    <a href=\"/\" class=\"brand-link\" target=\"_blank\">\r\n");
      out.write("      <img src=\"/resources/admin/dist/img/AdminLTELogo.png\" alt=\"AdminLTE Logo\" class=\"brand-image img-circle elevation-3\" style=\"opacity: .8\">\r\n");
      out.write("      <span class=\"brand-text font-weight-light\">상점 바로가기</span>\r\n");
      out.write("    </a>\r\n");
      out.write("\r\n");
      out.write("    <!-- Sidebar -->\r\n");
      out.write("    <div class=\"sidebar\">\r\n");
      out.write("      <!-- Sidebar user panel (optional) -->\r\n");
      out.write("      <div class=\"user-panel mt-3 pb-3 mb-3 d-flex\">\r\n");
      out.write("        <div class=\"image\">\r\n");
      out.write("          <img src=\"/resources/admin/dist/img/user2-160x160.jpg\" class=\"img-circle elevation-2\" alt=\"User Image\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"info\">\r\n");
      out.write("          <a href=\"#\" class=\"d-block\">");
//=admin.getName() 
      out.write("님 접속 중..</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- SidebarSearch Form -->\r\n");
      out.write("      <div class=\"form-inline\">\r\n");
      out.write("        <div class=\"input-group\" data-widget=\"sidebar-search\">\r\n");
      out.write("          <input class=\"form-control form-control-sidebar\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("          <div class=\"input-group-append\">\r\n");
      out.write("            <button class=\"btn btn-sidebar\">\r\n");
      out.write("              <i class=\"fas fa-search fa-fw\"></i>\r\n");
      out.write("            </button>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- Sidebar Menu -->\r\n");
      out.write("      <nav class=\"mt-2\">\r\n");
      out.write("        <ul class=\"nav nav-pills nav-sidebar flex-column\" data-widget=\"treeview\" role=\"menu\" data-accordion=\"false\">\r\n");
      out.write("          <!-- Add icons to the links using the .nav-icon class\r\n");
      out.write("               with font-awesome or any other icon font library -->\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          <!-- 주메뉴 begin -->\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a href=\"#\" class=\"nav-link\">\r\n");
      out.write("              <i class=\"nav-icon fas fa-copy\"></i>\r\n");
      out.write("              <p>\r\n");
      out.write("                상품관리\r\n");
      out.write("                <i class=\"fas fa-angle-left right\"></i>\r\n");
      out.write("                <span class=\"badge badge-info right\">6</span>\r\n");
      out.write("              </p>\r\n");
      out.write("            </a>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            <!-- 자식메뉴 begin -->\r\n");
      out.write("            <ul class=\"nav nav-treeview\">\r\n");
      out.write("              <li class=\"nav-item\">\r\n");
      out.write("                <a href=\"/admin/category/list\" class=\"nav-link\">\r\n");
      out.write("                  <i class=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("                  <p>카테고리</p>\r\n");
      out.write("                </a>\r\n");
      out.write("              </li> \r\n");
      out.write("            </ul>\r\n");
      out.write("            <!-- 자식메뉴 end -->\r\n");
      out.write("            \r\n");
      out.write("            <!-- 자식메뉴 begin -->\r\n");
      out.write("            <ul class=\"nav nav-treeview\">\r\n");
      out.write("              <li class=\"nav-item\">\r\n");
      out.write("                <a href=\"/admin/product/list\" class=\"nav-link\">\r\n");
      out.write("                  <i class=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("                  <p>상품</p>\r\n");
      out.write("                </a>\r\n");
      out.write("              </li>\r\n");
      out.write("            </ul> \r\n");
      out.write("            <!-- 자식메뉴 end -->\r\n");
      out.write("            \r\n");
      out.write("          </li>\r\n");
      out.write("          <!-- 주메뉴 end -->\r\n");
      out.write("\r\n");
      out.write("          <!-- 주메뉴 begin -->\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a href=\"#\" class=\"nav-link\">\r\n");
      out.write("              <i class=\"nav-icon fas fa-copy\"></i>\r\n");
      out.write("              <p>\r\n");
      out.write("                회원관리\r\n");
      out.write("                <i class=\"fas fa-angle-left right\"></i>\r\n");
      out.write("                <span class=\"badge badge-info right\">6</span>\r\n");
      out.write("              </p>\r\n");
      out.write("            </a>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            ");
for(int i=0;i<3;i++){
      out.write("\r\n");
      out.write("            <!-- 자식메뉴 begin -->\r\n");
      out.write("            <ul class=\"nav nav-treeview\">\r\n");
      out.write("              <li class=\"nav-item\">\r\n");
      out.write("                <a href=\"/resources/admin/pages/layout/top-nav.html\" class=\"nav-link\">\r\n");
      out.write("                  <i class=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("                  <p>Top Navigation</p>\r\n");
      out.write("                </a>\r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <!-- 자식메뉴 end -->\r\n");
      out.write("            ");
} 
      out.write("\r\n");
      out.write("          </li>\r\n");
      out.write("          <!-- 주메뉴 end -->\r\n");
      out.write("          <!-- 주메뉴 begin -->\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a href=\"#\" class=\"nav-link\">\r\n");
      out.write("              <i class=\"nav-icon fas fa-copy\"></i>\r\n");
      out.write("              <p>\r\n");
      out.write("                주문관리\r\n");
      out.write("                <i class=\"fas fa-angle-left right\"></i>\r\n");
      out.write("                <span class=\"badge badge-info right\">6</span>\r\n");
      out.write("              </p>\r\n");
      out.write("            </a>\r\n");
      out.write("             \r\n");
      out.write("            \r\n");
      out.write("            ");
for(int i=0;i<3;i++){
      out.write("\r\n");
      out.write("            <!-- 자식메뉴 begin -->\r\n");
      out.write("            <ul class=\"nav nav-treeview\">\r\n");
      out.write("              <li class=\"nav-item\">\r\n");
      out.write("                <a href=\"/resources/admin/pages/layout/top-nav.html\" class=\"nav-link\">\r\n");
      out.write("                  <i class=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("                  <p>Top Navigation</p>\r\n");
      out.write("                </a>\r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <!-- 자식메뉴 end -->\r\n");
      out.write("            ");
} 
      out.write("\r\n");
      out.write("          </li>\r\n");
      out.write("          <!-- 주메뉴 end -->\r\n");
      out.write("          \r\n");
      out.write("        </ul>\r\n");
      out.write("      </nav>\r\n");
      out.write("      <!-- /.sidebar-menu -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.sidebar -->\r\n");
      out.write("  </aside>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  <!-- Content Wrapper. Contains page content -->\r\n");
      out.write("  <div class=\"content-wrapper\">\r\n");
      out.write("    <!-- Content Header (Page header) -->\r\n");
      out.write("    <div class=\"content-header\">\r\n");
      out.write("      <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"row mb-2\">\r\n");
      out.write("          <div class=\"col-sm-6\">\r\n");
      out.write("            <h1 class=\"m-0\">카테고리 목록</h1>\r\n");
      out.write("          </div><!-- /.col -->\r\n");
      out.write("          <div class=\"col-sm-6\">\r\n");
      out.write("            <ol class=\"breadcrumb float-sm-right\">\r\n");
      out.write("              <li class=\"breadcrumb-item\"><a href=\"#\">Home</a></li>\r\n");
      out.write("              <li class=\"breadcrumb-item active\">Dashboard v1</li>\r\n");
      out.write("            </ol>\r\n");
      out.write("          </div><!-- /.col -->\r\n");
      out.write("        </div><!-- /.row -->\r\n");
      out.write("      </div><!-- /.container-fluid -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.content-header -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Main content -->\r\n");
      out.write("    <section class=\"content\">\r\n");
      out.write("      <div class=\"container-fluid\">\r\n");
      out.write("        <!-- Small boxes (Stat box) -->\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"col-12\">\r\n");
      out.write("          \r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("              <div class=\"card-header\">\r\n");
      out.write("                <h3 class=\"card-title\">Expandable Table Tree</h3>\r\n");
      out.write("              </div>\r\n");
      out.write("              <!-- ./card-header -->\r\n");
      out.write("              <div class=\"card-body p-0\">\r\n");
      out.write("                <table class=\"table table-hover\">\r\n");
      out.write("                  <tbody>\r\n");
      out.write("\r\n");
      out.write("					");
for(Category category  : categoryList){ 
      out.write("	\r\n");
      out.write("                    <tr data-widget=\"expandable-table\" aria-expanded=\"true\">\r\n");
      out.write("                      <td>\r\n");
      out.write("                        ");
if(category.getDepth()>0){
      out.write("\r\n");
      out.write("                        	<i class=\"expandable-table-caret fas fa-caret-right fa-fw\" style=\"margin-left:");
      out.print(20*category.getDepth());
      out.write("px\"></i>\r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                        <a href=\"/admin/category/detail?category_id=");
      out.print(category.getCategory_id());
      out.write('"');
      out.write('>');
      out.print(category.getCategory_name() );
      out.write("</a>\r\n");
      out.write("                      </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");
} 
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td>\r\n");
      out.write("						<button type=\"button\" class=\"btn btn-info\" onClick=\"location.href='/admin/category/registform';\">카테고리 등록</button>                      \r\n");
      out.write("                      </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                  </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("              </div>\r\n");
      out.write("              <!-- /.card-body -->\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <!-- /.card -->\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <!-- /.row (main row) -->\r\n");
      out.write("      </div><!-- /.container-fluid -->\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- /.content -->\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- /.content-wrapper -->\r\n");
      out.write("  \r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("  <footer class=\"main-footer\">\r\n");
      out.write("    <strong>Copyright &copy; 2014-2021 <a href=\"https://adminlte.io\">AdminLTE.io</a>.</strong>\r\n");
      out.write("    All rights reserved.\r\n");
      out.write("    <div class=\"float-right d-none d-sm-inline-block\">\r\n");
      out.write("      <b>Version</b> 3.2.0-rc\r\n");
      out.write("    </div>\r\n");
      out.write("  </footer>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  <!-- Control Sidebar -->\r\n");
      out.write("  <aside class=\"control-sidebar control-sidebar-dark\">\r\n");
      out.write("    <!-- Control sidebar content goes here -->\r\n");
      out.write("  </aside>\r\n");
      out.write("  <!-- /.control-sidebar -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ./wrapper -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery -->\r\n");
      out.write("<script src=\"/resources/admin/plugins/jquery/jquery.min.js\"></script>\r\n");
      out.write("<!-- jQuery UI 1.11.4 -->\r\n");
      out.write("<script src=\"/resources/admin/plugins/jquery-ui/jquery-ui.min.js\"></script>\r\n");
      out.write("<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->\r\n");
      out.write("<!-- Bootstrap 4 -->\r\n");
      out.write("<script src=\"/resources/admin/plugins/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<!-- ChartJS -->\r\n");
      out.write("<script src=\"/resources/admin/plugins/chart.js/Chart.min.js\"></script>\r\n");
      out.write("<!-- Sparkline -->\r\n");
      out.write("<script src=\"/resources/admin/plugins/sparklines/sparkline.js\"></script>\r\n");
      out.write("<!-- JQVMap -->\r\n");
      out.write("<script src=\"/resources/admin/plugins/jqvmap/jquery.vmap.min.js\"></script>\r\n");
      out.write("<script src=\"/resources/admin/plugins/jqvmap/maps/jquery.vmap.usa.js\"></script>\r\n");
      out.write("<!-- jQuery Knob Chart -->\r\n");
      out.write("<script src=\"/resources/admin/plugins/jquery-knob/jquery.knob.min.js\"></script>\r\n");
      out.write("<!-- daterangepicker -->\r\n");
      out.write("<script src=\"/resources/admin/plugins/moment/moment.min.js\"></script>\r\n");
      out.write("<script src=\"/resources/admin/plugins/daterangepicker/daterangepicker.js\"></script>\r\n");
      out.write("<!-- Tempusdominus Bootstrap 4 -->\r\n");
      out.write("<script src=\"/resources/admin/plugins/tempusdominus-bootstrap-4/js/tempusdominus-bootstrap-4.min.js\"></script>\r\n");
      out.write("<!-- Summernote -->\r\n");
      out.write("<script src=\"/resources/admin/plugins/summernote/summernote-bs4.min.js\"></script>\r\n");
      out.write("<!-- overlayScrollbars -->\r\n");
      out.write("<script src=\"/resources/admin/plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js\"></script>\r\n");
      out.write("<!-- AdminLTE App -->\r\n");
      out.write("<script src=\"/resources/admin/dist/js/adminlte.js\"></script>\r\n");
      out.write("<!-- AdminLTE for demo purposes -->\r\n");
      out.write("<!-- <script src=\"/resources/admin/dist/js/demo.js\"></script> -->\r\n");
      out.write("<!-- AdminLTE dashboard demo (This is only for demo purposes) -->\r\n");
      out.write("<script src=\"/resources/admin/dist/js/pages/dashboard.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("  $.widget.bridge('uibutton', $.ui.button)\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
}
