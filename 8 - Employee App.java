package Anant_Joshi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class CustomEmployeeApp {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<CustomEmployee> employees = new ArrayList<>();

        while (true) {
            clearConsole();
            System.out.println("Employee Management System");
            System.out.println("1) Add New Employee");
            System.out.println("2) Display All Employees");
            System.out.println("3) Edit Employee");
            System.out.println("4) Remove Employee");
            System.out.println("5) Exit");

            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(reader.readLine());

            if (choice == 1) {
                System.out.println("Adding a new employee...");
                addEmployee(reader, employees);
            } else if (choice == 2) {
                System.out.println("Displaying all employees...");
                displayEmployees(employees);
            } else if (choice == 3) {
                System.out.println("Editing an employee...");
                editEmployee(reader, employees);
            } else if (choice == 4) {
                System.out.println("Removing an employee...");
                removeEmployee(reader, employees);
            } else if (choice == 5) {
                System.out.println("Exiting the application...");
                System.exit(0);
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

        }
    }

    private static void clearConsole() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("Error clearing console: " + e.getMessage());
        }
    }

    private static void addEmployee(BufferedReader reader, ArrayList<CustomEmployee> employees) throws Exception {
        System.out.print("Enter Employee Name: ");
        String name = reader.readLine();
        System.out.print("Enter Employee Code: ");
        String code = reader.readLine();
        System.out.print("Enter Employee Salary: ");
        double salary = Double.parseDouble(reader.readLine());
        CustomEmployee employee = new CustomEmployee(name, code, salary);
        employees.add(employee);
        System.out.println("New employee added successfully.");
        reader.readLine(); // Pause
    }

    private static void displayEmployees(ArrayList<CustomEmployee> employees) throws Exception {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            System.out.println("List of Employees:");
            System.out.printf("\n%-10s %-20s %s\n", "CODE", "NAME", "SALARY");
            for (CustomEmployee employee : employees) {
                System.out.printf("%-10s %-20s %.2f\n", employee.getEmployeeCode(), employee.getEmployeeName(), employee.getEmployeeSalary());
            }
        }
        System.out.println();
        System.out.print("Press Enter to continue...");
        System.in.read(); // Pause
    }

    private static void editEmployee(BufferedReader reader, ArrayList<CustomEmployee> employees) throws Exception {
        System.out.print("Enter Employee Code to edit: ");
        String code = reader.readLine();
        boolean found = false;

        for (CustomEmployee employee : employees) {
            if (employee.getEmployeeCode().equals(code)) {
                System.out.print("Enter New Employee Name: ");
                employee.setEmployeeName(reader.readLine());
                System.out.print("Enter New Employee Salary: ");
                employee.setEmployeeSalary(Double.parseDouble(reader.readLine()));
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Employee details updated successfully.");
        } else {
            System.out.println("Employee not found.");
        }
        System.out.print("Press Enter to continue...");
        System.in.read(); // Pause
    }

    private static void removeEmployee(BufferedReader reader, ArrayList<CustomEmployee> employees) throws Exception {
        System.out.print("Enter Employee Code to remove: ");
        String code = reader.readLine();
        boolean removed = false;

        for (CustomEmployee employee : employees) {
            if (employee.getEmployeeCode().equals(code)) {
                employees.remove(employee);
                removed = true;
                break;
            }
        }

        if (removed) {
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee not found.");
        }
        System.out.print("Press Enter to continue...");
        System.in.read(); // Pause
    }
}

class CustomEmployee {
    private String empName;
    private String empCode;
    private double empSalary;

    public CustomEmployee(String name, String code, double salary) {
        this.empName = name;
        this.empCode = code;
        this.empSalary = salary;
    }

    public String getEmployeeName() {
        return empName;
    }

    public void setEmployeeName(String name) {
        this.empName = name;
    }

    public String getEmployeeCode() {
        return empCode;
    }

    public double getEmployeeSalary() {
        return empSalary;
    }

    public void setEmployeeSalary(double salary) {
        this.empSalary = salary;
    }
}