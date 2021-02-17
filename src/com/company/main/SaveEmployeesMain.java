package com.company.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SaveEmployeesMain {
    public static void main(String[] args) {
        // Grab employees
//        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
//        ConsoleLogger consoleLogger = new ConsoleLogger();
//
//        EmployeeRepository repository = new EmployeeRepository(employeeFileSerializer);
//        List<Employee> employees = repository.findAll();
//
//        // Save all
//        for (Employee e : employees){
//            try {
//                repository.save(e);
//                consoleLogger.writeInfo("Saved employee " + e.toString());
//            } catch (IOException exception) {
//                consoleLogger.writeError("Error saving employee", exception);
//            }
//        }
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManagerFactory.close();
    }
}
