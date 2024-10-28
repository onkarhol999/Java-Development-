<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add New Job</title>
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
            width: 50%;
            margin-left: auto;
            margin-right: auto;
            border: 1px solid #ddd;
            padding: 20px;
            border-radius: 8px;
        }
        form {
            display: flex;
            flex-direction: column;
        }
        label {
            margin-bottom: 5px;
            font-weight: bold;
        }
        input[type="text"] {
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ddd;
            border-radius: 5px;
        }
        button {
            padding: 10px;
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
  <div class="navbar">
        <a href="/">Home</a>
        <a href="/viewalljobs">View All Jobs</a>
        <a href="/addjob">Add Job</a>
    </div>
    <h1>Add a New Job</h1>

    <!-- Add Job Form -->
    <div class="container">
        <form action="/savejob" method="post">
            <label for="title">Job Title:</label>
            <input type="text" id="title" name="title" required>

            <label for="description">Job Description:</label>
            <input type="text" id="description" name="description" required>

            <label for="location">Location:</label>
            <input type="text" id="location" name="location" required>

            <button type="submit">Add Job</button>
        </form>
    </div>

</body>
</html>
