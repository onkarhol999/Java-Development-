<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Job Portal</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        h1 {
            color: #4CAF50;
        }
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
        .container {
            margin-top: 20px;
            display: flex;
            justify-content: space-around;
        }
        .section {
            width: 45%;
            padding: 20px;
            border: 1px solid #ddd;
            text-align: center;
            border-radius: 8px;
        }
        button {
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

    <!-- Navbar -->
    <div class="navbar">
        <a href="/">Home</a>
        <a href="/viewalljobs">View All Jobs</a>
        <a href="/addjob">Add Job</a>
    </div>

    <h1>Welcome to the Job Portal</h1>

    <!-- Main content divided into two sections -->
    <div class="container">
        <!-- View Jobs Section -->
        <div class="section">
            <h2>View Jobs</h2>
            <button onclick="window.location.href='/viewalljobs'">View Jobs</button>
        </div>

        <!-- Add Jobs Section -->
        <div class="section">
            <h2>Add a New Job</h2>
            <button onclick="window.location.href='/addjob'">Add Job</button>
        </div>
    </div>

</body>
</html>
