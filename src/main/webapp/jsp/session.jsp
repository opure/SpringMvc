<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'session.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <body>
    This is my JSP page. 
    <%=basePath%><br>
     <%=path%><br>
     <%= session.getId() %>
     <c:out value="${header['User-Agent']}" />
     <br/>
    <%
    out.getBufferSize();
    out.print(page.getClass());
     %>
     <%=page.toString() %><br>
     <%=request.getCharacterEncoding() %><br>
     <%=request.getMethod() %><br>
     <%=request.getProtocol() %><br>
     <%=request.getQueryString() %><br>
     <%=request.getRequestURI() %><br>
     <%=request.getRemoteHost() %><br>
     <%=request.getServerName() %><br>
     <%=request.getSession() %><br>
     <%=request.getServletPath() %><br>
     <%=session.getServletContext() %>
     <%=session.getAttribute("nihao") %>
     
     <%response.setHeader("refresh", "2"); %>
     <% int number=0;
       Object obj=session.getAttribute("number");
       if(obj==null){
       session.setAttribute("number", String.valueOf(number));
       }
       else{
       number=Integer.parseInt(obj.toString());
       number+=1;
       session.setAttribute("number", String.valueOf(number));
      }
      %><br>
      访问次数：<%=number %>
      
  <c:out value="&lt要显示的数据对象（未使用转义字符）&gt" escapeXml="true" default="默认值"></c:out><br/>
  <c:out value="&lt要显示的数据对象（使用转义字符）&gt" default="默认值"></c:out><br/>
  <c:out value="${null}" escapeXml="false">使用的表达式结果为null，则输出该默认值</c:out><br/>
</body>
</html>
