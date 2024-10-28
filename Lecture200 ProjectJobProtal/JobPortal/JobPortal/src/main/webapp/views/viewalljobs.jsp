<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://jakarta.apache.org/taglibs/standard-compat" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>All Jobs</title>
</head>
<body>
    <h1>Available Jobs</h1>
    <c:choose>
        <c:when test="${not empty jobList}">
            <div class="job-list">
                <c:forEach var="job" items="${jobList}">
                    <div class="job-item">
                        <strong>${job.title}</strong><br>
                        Description: ${job.description}<br>
                        Location: ${job.location}<br><br>
                    </div>
                </c:forEach>
            </div>
        </c:when>
        <c:otherwise>
            <p>No jobs available.</p>
        </c:otherwise>
    </c:choose>
    <a href="addjob">Add New Job</a>
</body>
</html>
