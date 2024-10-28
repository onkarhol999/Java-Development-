<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Job Added Successfully</title>
    <style>
    .navbar {
                        overflow: hidden;
                        background-color: #333;
                    }
                    .navbar a {
                        float: left;
                        display: block;
                        color: #f2f2f2;
                        text-align: center;
                        padding: 14px 20px;
                        text-decoration: none;
                    }
                    .navbar a:hover {
                        background-color: #ddd;
                        color: black;
                    }
        .card {
            border: 1px solid #ccc;
            border-radius: 5px;
            padding: 20px;
            margin: 20px;
            width: 300px;
            box-shadow: 2px 2px 12px rgba(0,0,0,0.1);
        }
    </style>
</head>
<body>
  <div class="navbar">
        <a href="/">Home</a>
        <a href="/viewalljobs">View All Jobs</a>
        <a href="/addjob">Add Job</a>
    </div>
    <h1>Job Added Successfully!</h1>

    <div class="card">
        <h2>${job.title}</h2>
        <p><strong>Description:</strong> ${job.description}</p>
        <p><strong>Location:</strong> ${job.location}</p>
    </div>
<h2>View All Jobs</h2>
<a href="viewalljobs">View All Jobs</a>
</body>
</html>
