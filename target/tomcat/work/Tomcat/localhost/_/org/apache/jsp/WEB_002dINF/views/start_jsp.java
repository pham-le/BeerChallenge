/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-03-20 20:36:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class start_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<script src=\"/resources/stopwatch.js\"></script>\n");
      out.write("<style>\n");
      out.write("table {\n");
      out.write("\tborder-collapse: collapse;\n");
      out.write("}\n");
      out.write("\n");
      out.write("td, th {\n");
      out.write("\tborder: 1px solid black;\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Start</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<body onload=\"show();createArrays(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${model.numPeople}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(")\">\n");
      out.write("\t<div>\n");
      out.write("\t\t<h2>Timer</h2>\n");
      out.write("\t\t<span id=\"time\"></span>\n");
      out.write("\t</div>\n");
      out.write("\t<input type=\"button\" id=\"start\" value=\"start\"\n");
      out.write("\t\tonclick=\"start();enableAll(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${numPeople}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(");\">\n");
      out.write("\t<input type=\"button\" id=\"stop\" value=\"stop\"\n");
      out.write("\t\tonclick=\"stop();disableAll(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${numPeople}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(")\">\n");
      out.write("\n");
      out.write("\t<h2>Players</h2>\n");
      out.write("\n");
      out.write("\t<div id=\"round\" style=\"color: green\"></div>\n");
      out.write("\t<table>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<th>Player</th>\n");
      out.write("\t\t\t<th>State</th>\n");
      out.write("\t\t\t<th>Scores</th>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('	');
      out.write('	');
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t</table>\n");
      out.write("\n");
      out.write("\t<p>\n");
      out.write("\t\t<a href=\"/scoreboard\">Scoreboard</a>\n");
      out.write("\t</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\tvar playerScores;\n");
      out.write("\t\tvar playerState;\n");
      out.write("\t\t\n");
      out.write("\t\tfunction createArrays(playerCount) {\n");
      out.write("\t\t\tplayerState = new Array(playerCount);\n");
      out.write("\t\t\tplayerScores = new Array(playerCount);\n");
      out.write("\t\t\tfor (var i = 0; i < playerCount; i++) {\n");
      out.write("\t\t\t\tplayerScores[i] = new Array(60);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\n");
      out.write("\t\tfunction disable(playerNum) {\n");
      out.write("\t\t\tvar p = document.getElementById(\"player\" + playerNum);\n");
      out.write("\t\t\tp.setAttribute(\"disabled\", \"disabled\");\n");
      out.write("\t\t\tp.style.color = \"green\";\n");
      out.write("\t\t\tp.style.background = \"#E8E8E8\";\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\tfunction disableAll(numPeople) {\n");
      out.write("\t\t\tdocument.getElementById('start').disabled=true;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tfor(var i = 0; i<numPeople; i++) {\n");
      out.write("\t\t\t\tdisable(i);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\tfunction enable(playerNum) {\n");
      out.write("\t\t\tvar p = document.getElementById(\"player\" + playerNum);\n");
      out.write("\t\t\tp.disabled = false;\n");
      out.write("\t\t\tp.style.color = \"red\";\n");
      out.write("\t\t\tp.style.background = \"white\";\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\tfunction enableAll(numPeople) {\n");
      out.write("\t\t\tfor (var i = 0; i < numPeople; i++) {\n");
      out.write("\t\t\t\tenable(i);\n");
      out.write("\t\t\t\tupdateState(i, \"PLAYING\");\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\tfunction checkPlayers() {\t\n");
      out.write("\t\t\tfor (var i = 0; i<playerState.length; i++) {\n");
      out.write("\t\t\t\t//Player did not click button in time\n");
      out.write("\t\t\t\tif (!document.getElementById(\"player\" + i).disabled && playerState[i] === \"PLAYING\") {\n");
      out.write("\t\t\t\t\tdisable(i);\n");
      out.write("\t\t\t\t\tupdateState(i, \"GAMEOVER\");\n");
      out.write("\t\t\t\t} \n");
      out.write("\t\t\t\t//Player clicked button\n");
      out.write("\t\t\t\telse if (document.getElementById(\"player\" + i).disabled && playerState[i] === \"PLAYING\") {\n");
      out.write("\t\t\t\t\tif (x.getSeconds()/60 + 1 === 60) {\n");
      out.write("\t\t\t\t\t\tupdateState(i, \"WINNER\");\n");
      out.write("\t\t\t\t\t\tdisableAll();\n");
      out.write("\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\tenable(i);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t//check if all players are gameover\n");
      out.write("\t\t\tvar count = 0;\n");
      out.write("\t\t\tfor (var i = 0; i<playerState.length; i++) {\n");
      out.write("\t\t\t\tif (playerState[i] === \"GAMEOVER\") {\n");
      out.write("\t\t\t\t\tcount++;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tif (count==playerState.length) {\n");
      out.write("\t\t\t\tx.stop();\n");
      out.write("\t\t    \tdocument.getElementById(\"round\").innerHTML += \": GAME OVER!\";\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\tfunction updateState(playerNum, state){\n");
      out.write("\t\t\tplayerState[playerNum] = state;\n");
      out.write("\t\t\tvar stateDiv = document.getElementById(\"state\" + playerNum);\n");
      out.write("\n");
      out.write("\t\t\tswitch (state) {\n");
      out.write("\t\t\t\tcase \"PLAYING\":\n");
      out.write("\t\t\t\t\tstateDiv.style.color = \"orange\";\n");
      out.write("\t\t\t\t\tbreak;\n");
      out.write("\t\t\t\tcase \"GAMEOVER\":\n");
      out.write("\t\t\t\t\tstateDiv.style.color = \"red\";\n");
      out.write("\t\t\t\t\tbreak;\n");
      out.write("\t\t\t\tcase \"WINNER\":\n");
      out.write("\t\t\t\t\tstateDiv.style.color = \"green\";\n");
      out.write("\t\t\t\t\tbreak;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tstateDiv.innerHTML = state;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\tfunction updateScore(playerNum) {\n");
      out.write("\t\t\tplayerScores[playerNum][Math.floor(x.time()/60000)] = x.time();\n");
      out.write("\n");
      out.write("\t\t\tvar scoreDiv = document.getElementById(\"score\" + playerNum).innerHTML;\n");
      out.write("\t\t\tscoreDiv = scoreDiv + formatTime(x.time()) + \", \"\n");
      out.write("\t\t\tdocument.getElementById(\"score\" + playerNum).innerHTML = scoreDiv;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t</script>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/views/start.jsp(47,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("count");
    // /WEB-INF/views/start.jsp(47,2) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/start.jsp(47,2) '0'",_el_expressionfactory.createValueExpression("0",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/start.jsp(47,2) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setScope("page");
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/start.jsp(48,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("player");
    // /WEB-INF/views/start.jsp(48,2) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/start.jsp(48,2) '${model.players}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${model.players}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t\t<!-- Player button -->\n");
          out.write("\t\t\t\t<td><input type=\"button\" class=\"players\" id=\"player");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${count}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"\n");
          out.write("\t\t\t\t\tstyle=\"color: green; background: #E8E8E8\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${player}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"\n");
          out.write("\t\t\t\t\tonclick=\"disable(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${count}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(");updateScore(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${count}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(")\" disabled></td>\n");
          out.write("\n");
          out.write("\t\t\t\t<!-- State (---, PLAYING, GAME OVER, WINNER)-->\n");
          out.write("\t\t\t\t<td><div id=\"state");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${count}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">---</div></td>\n");
          out.write("\n");
          out.write("\t\t\t\t<!-- Score (last clicked) -->\n");
          out.write("\t\t\t\t<td><div id=\"score");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${count}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"\n");
          out.write("\t\t\t\t\t\tstyle=\"width: 500px; font-size: 12px\"></div></td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t");
          if (_jspx_meth_c_005fset_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write('\n');
          out.write('	');
          out.write('	');
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/views/start.jsp(62,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setVar("count");
    // /WEB-INF/views/start.jsp(62,3) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/start.jsp(62,3) '${count + 1}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${count + 1}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/start.jsp(62,3) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setScope("page");
    int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
    if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f1);
    return false;
  }
}
