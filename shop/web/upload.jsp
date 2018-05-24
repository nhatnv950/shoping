<%-- 
    Document   : upload
    Created on : 2017/11/05, 0:43:15
    Author     : nhatnv950
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <center>
            <form method="post" action="UploadServlet" enctype="multipart/form-data">
                Select file to upload:
                <input type="file" name="uploadFile" />
                <br/><br/>
                <input type="submit" value="Upload" />
            </form>
        </center>
    <jsp:include page="footer.jsp"></jsp:include>

</body>
</html>
