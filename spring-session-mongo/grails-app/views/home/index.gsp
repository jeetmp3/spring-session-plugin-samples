<%--
  Created by IntelliJ IDEA.
  User: jitendra
  Date: 15/10/16
  Time: 1:37 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
    <table width="100%">
        <tr>
            <td colspan="2">
                <form action="${g.createLink(controller: 'home', action: 'index')}" method="post">
                    <input type="text" placeholder="key" name="key"/>
                    <input type="text" placeholder="value" name="value"/>
                    <input type="submit" value="Submit"/>
                </form>
            </td>
        </tr>
        <g:each in="${session.attributeNames}" var="key">
            <tr>
                <td>${key}</td>
                <td>${session.getAttribute(key)}</td>
            </tr>
        </g:each>
    </table>
</body>
</html>