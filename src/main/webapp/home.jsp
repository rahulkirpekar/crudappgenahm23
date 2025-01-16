<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Management Application</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 0;
        }

        .header {
            background-color: #007BFF;
            color: white;
            padding: 20px 0;
            text-align: center;
        }

        .header h1 {
            margin: 0;
            font-size: 2.5em;
        }

        .container {
            display: flex;
            justify-content: center;
            flex-wrap: wrap;
            padding: 20px;
        }

        .card {
            background-color: white;
            border: 1px solid #ddd;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            margin: 10px;
            width: 250px;
            text-align: center;
            padding: 20px;
            transition: transform 0.2s;
        }

        .card:hover {
            transform: scale(1.05);
        }

        .card h3 {
            margin: 0 0 10px;
            font-size: 1.2em;
            color: #007BFF;
        }

        .card p {
            margin: 10px 0;
            color: #555;
        }

        .card a {
            display: inline-block;
            padding: 10px 20px;
            background-color: #007BFF;
            color: white;
            text-decoration: none;
            border-radius: 4px;
            font-weight: bold;
        }

        .card a:hover {
            background-color: #0056b3;
        }

        .footer {
            background-color: #f4f4f9;
            text-align: center;
            padding: 10px;
            font-size: 0.9em;
            color: #555;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <div class="header">
        <h1>Student Management Application</h1>
    </div>

    <div class="container">
        <div class="card">
            <h3>Register Student</h3>
            <p>Add new students to the database.</p>
            <a href="registration.jsp">Go</a>
        </div>

        <div class="card">
            <h3>View Students</h3>
            <p>View the list of all registered students.</p>
            <a href="viewStudents.html">Go</a>
        </div>

        <div class="card">
            <h3>Edit Student</h3>
            <p>Modify details of existing students.</p>
            <a href="editStudent.html">Go</a>
        </div>

        <div class="card">
            <h3>Delete Student</h3>
            <p>Remove students from the database.</p>
            <a href="deleteStudent.html">Go</a>
        </div>
    </div>

    <div class="footer">
        &copy; 2024 Student Management Application. All Rights Reserved.
    </div>
</body>
</html>
