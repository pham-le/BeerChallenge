/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.11
 * Generated at: 2017-04-22 06:26:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1486512802000L));
    _jspx_dependants.put("jar:file:/Users/JANNETTE/Documents/workspace/BeerChallenge/target/tomcat.8080/webapps/expanded/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153410282000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Beer Challenge - Welcome!</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<h1>Beer Challenge - POWER HOUR!</h1>\n");
      out.write("\t<h2>Introduction</h2>\n");
      out.write("\t<p>Power Hour is a popular party game where player(s) drink a shot\n");
      out.write("\t\tof beer (or any liquid) every minute within one hour (i.e. 60 shots).\n");
      out.write("\t\tThis game can be played with any amount of players, and each player\n");
      out.write("\t\tcan drop out at any time. Please play at your own discretion.</p>\n");
      out.write("\t\t\n");
      out.write("\t<p><a href=\"/scoreboard\">Scoreboard</a></p>\n");
      out.write("\n");
      out.write("\t<h2>Setup</h2>\n");
      out.write("\t<p>Each player must have:</p>\n");
      out.write("\t<ol>\n");
      out.write("\t\t<li>One shot glass that holds 1.5 oz. of liquid.</li>\n");
      out.write("\t\t<li>~7.5 cans of 12 oz. beers (60 shots x 1.5 oz. = 90 oz. of\n");
      out.write("\t\t\tbeer, which is 7.5 cans of 12 oz. beers, or 5.6 pints of beer)</li>\n");
      out.write("\t</ol>\n");
      out.write("\n");
      out.write("\t<h2>Rules</h2>\n");
      out.write("\t<p>After setting up your team's information (team name, number of\n");
      out.write("\t\tplayers, and player names), you will be presented with a timer. Once\n");
      out.write("\t\tevery player is ready, press the \"Start\" button under the timer to\n");
      out.write("\t\tbegin the clock and start playing! The \"Stop\" button will stop the\n");
      out.write("\t\tgame indefinitely.</p>\n");
      out.write("\t<p>Once a player drinks their shot, the player must click the\n");
      out.write("\t\tbutton with their name on it, and that time will be recorded. Clicking\n");
      out.write("\t\tthese buttons indicate which players have passed the round.</p>\n");
      out.write("\t<p>If a player fails to drink their shot and click their button\n");
      out.write("\t\twithin that minute, it will be game over for that player. If no one is\n");
      out.write("\t\table to finish their shots, meaning that none of the buttons have been\n");
      out.write("\t\tpressed, then it is game over for the whole team and the timer will\n");
      out.write("\t\tstop.</p>\n");
      out.write("\t<p>Once the game is over, click the \"Submit Scores\" button each\n");
      out.write("\t\tplayers times to the score board.</p>\n");
      out.write("\n");
      out.write("\t<h2>Start the challenge!</h2>\n");
      out.write("\t<p>Please enter a team name (3 or more characters) and the amount\n");
      out.write("\t\tof players:</p>\n");
      out.write("\t<form action=\"/home\" method=\"POST\">\n");
      out.write("\t\t<label name=\"teamName\">Team Name: </label><input name=\"teamName\"\n");
      out.write("\t\t\ttype=\"text\" /> </br> <label name=\"numPeople\">Team Count: </label><input\n");
      out.write("\t\t\tname=\"numPeople\" type=\"number\" /> </br> <input type=\"submit\" /> <font\n");
      out.write("\t\t\tcolor=red>");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("</font>\n");
      out.write("\t</form>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f0_reused = false;
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent(null);
      // /WEB-INF/views/home.jsp(56,13) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorMessage}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      _jspx_th_c_005fout_005f0_reused = true;
    } finally {
      if (!_jspx_th_c_005fout_005f0_reused) {
        _jspx_th_c_005fout_005f0.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_c_005fout_005f0);
      }
    }
    return false;
  }
}
