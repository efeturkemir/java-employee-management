# Employee Management System

The Employee Management System is a Java application developed using NetBeans that allows users to manage employee records. It connects to an SQL database, enabling users to perform basic CRUD (Create, Read, Update, Delete) operations on employee information. This README provides an overview of the system's functionality, how to set it up, and how to use it.

## Table of Contents

- [Features](#features)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Database Setup](#database-setup)
- [Contributing](#contributing)
- [License](#license)

## Features

1. **Add Employees**: Users can add new employees to the system by providing their details such as name, job title, department, and contact information.

2. **Delete Employees**: Users can delete employee records from the database.

3. **Update Employees**: Users can update the information of existing employees.

4. **Search for Employees**: Users can search for employees based on various criteria like name, department, or job title.

## Getting Started

To run the Employee Management System on your local machine, follow these steps:

1. **Clone the Repository**: 

   ```bash
   git clone https://github.com/efeturkemir/employee-management-system.git
   ```

2. **Open in NetBeans**:

   - Open NetBeans IDE.
   - Select "Open Project" and navigate to the cloned repository's directory.
   - Select the project and open it in NetBeans.

3. **Database Configuration**:

   Before running the application, you need to set up the database. Please refer to the [Database Setup](#database-setup) section for details.

4. **Run the Application**:

   - Build and run the project in NetBeans.

## Usage

Once the application is running, you can interact with it through the graphical user interface (GUI). Here's a brief overview of how to use the Employee Management System:

- **Add Employee**: Click on the "Add Employee" button to open a form where you can enter the employee's details. After entering the details, click "Save" to add the employee to the database.

- **Delete Employee**: Select an employee from the list and click the "Delete" button to remove the employee from the database.

- **Update Employee**: Select an employee from the list and click the "Edit" button to modify their information. After making the necessary changes, click "Save" to update the employee's details.

- **Search for Employee**: Use the search bar to filter employees based on their name, department, or job title. The filtered results will be displayed in the list.

## Database Setup

The Employee Management System uses an SQL database to store employee records. To set up the database:

1. Create a new MySQL database or use an existing one.

2. Update the database connection configuration in the `DatabaseManager.java` file:

   ```java
   String url = "jdbc:mysql://localhost:3306/your_database_name";
   String user = "your_username";
   String password = "your_password";
   ```

3. Ensure you have the MySQL JDBC driver added to your project's dependencies.

4. Run the application, and it will connect to the specified database.

## Contributing

Contributions to this project are welcome! If you have any improvements, bug fixes, or new features to add, please submit a pull request. For major changes, please open an issue first to discuss the proposed changes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
