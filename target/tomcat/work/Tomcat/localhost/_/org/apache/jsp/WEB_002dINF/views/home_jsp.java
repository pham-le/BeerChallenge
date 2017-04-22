/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-04-22 21:34:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("\n");
      out.write("\t<p>\n");
      out.write("\t\t<a href=\"/scoreboard\">Scoreboard</a>\n");
      out.write("\t</p>\n");
      out.write("\n");
      out.write("\t<h2>Setup</h2>\n");
      out.write("\t<p>Each player must have:</p>\n");
      out.write("\t<ul>\n");
      out.write("\t\t<li>One shot glass that holds 1.5 oz. of liquid.</li>\n");
      out.write("\t\t<li>~7.5 cans of 12 oz. beers (60 shots x 1.5 oz. = 90 oz. of\n");
      out.write("\t\t\tbeer, which is 7.5 cans of 12 oz. beers, or 5.6 pints of beer)</li>\n");
      out.write("\t</ul>\n");
      out.write("\n");
      out.write("\t<h2>Rules</h2>\n");
      out.write("\t<ol>\n");
      out.write("\t\t<li>After setting up your team's information (team name, number of\n");
      out.write("\t\t\tplayers, and player names), you will be presented with a timer. Once\n");
      out.write("\t\t\tevery player is ready, press the \"Start\" button under the timer to\n");
      out.write("\t\t\tbegin the clock and start playing! The \"Stop\" button will stop the\n");
      out.write("\t\t\tgame indefinitely.</li>\n");
      out.write("\t\t<li>Once a player drinks their shot, the player must click the\n");
      out.write("\t\t\tbutton with their name on it, and that time will be recorded. Clicking\n");
      out.write("\t\t\tthese buttons indicate which players have passed the round.</li>\n");
      out.write("\t\t<li>At each minute mark, players who have successfully indicated\n");
      out.write("\t\t\tthat they have drank their shot will have their button reactivated for\n");
      out.write("\t\t\tthe next round.</li>\n");
      out.write("\t\t<li>If a player fails to drink their shot (i.e click their button)\n");
      out.write("\t\t\twithin that minute, it will be game over for that player. If no one is\n");
      out.write("\t\t\table to finish their shots, meaning that none of the buttons have been\n");
      out.write("\t\t\tpressed, then it is game over for the whole team and the timer will\n");
      out.write("\t\t\tstop.</li>\n");
      out.write("\t\t<li>Once the game is over, click the \"Submit Scores\" button each\n");
      out.write("\t\t\tplayers times to the score board.</li>\n");
      out.write("\t</ol>\n");
      out.write("\n");
      out.write("\t<h2>Start the challenge!</h2>\n");
      out.write("\t<p>Please enter a team name (3 or more characters) and the amount\n");
      out.write("\t\tof players:</p>\n");
      out.write("\t<form action=\"/\" method=\"POST\">\n");
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
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
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
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent(null);
    // /WEB-INF/views/home.jsp(63,13) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorMessage}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }
}
