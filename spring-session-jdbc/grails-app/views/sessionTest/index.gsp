<%--
  Created by IntelliJ IDEA.
  User: jitendra
  Date: 16/10/16
  Time: 5:48 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<div id="sessionId">${session.id}</div>
<table>
    <tr>
        <th>Key</th>
        <th>Value</th>
    </tr>
    <g:each in="${Collections.list(session.attributeNames)}" var="key">
        <tr>
            <td id="${key}-key">${key}</td>
            <td id="${key}-value">${session.getAttribute(key)}</td>
        </tr>
    </g:each>
    <tr>
        <g:form controller="sessionTest" action="put" method="post">
            <td>
                <input type="text" name="key"/>
                <input type="text" name="value"/>
            </td>
            <td>
                <input type="submit" value="Save"/>
            </td>
        </g:form>
    </tr>
</table>


</body>
</html>