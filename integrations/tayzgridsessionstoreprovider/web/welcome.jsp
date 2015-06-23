<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome to test case of session synchronization!</h1>
		<br>
        Session is <%=session.isNew() ? "New" : "Not New" %><br>
        <%
            printAttributes(out, session);
        %>
    </body>
</html>

<%!
	void printAttributes(JspWriter out, HttpSession session) throws java.io.IOException
	{
		boolean hasAtt = false;
		java.util.Enumeration  names = session.getAttributeNames();
		while (names.hasMoreElements())
		{
			hasAtt = true;
			String name = (String)names.nextElement();
			String val = (String)session.getAttribute(name);
			out.println(name + "&nbsp;:&nbsp;" + val + "<br>");
		}
		if (!hasAtt)
		{
			out.println("No attributes in session");
		}
	}
 %>