package com.company.persistence;


import com.company.personnel.Employee;
import com.company.personnel.FullTimeEmployee;
import com.company.personnel.PartTimeEmployee;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


public class EmployeeRepository {
    private EmployeeFileSerializer serializer;

    public EmployeeRepository(EmployeeFileSerializer serializer) {
        this.serializer = serializer;
    }

    public List<Employee> findAll() {

        // Employees are kept in memory for simplicity
        Employee liza = new FullTimeEmployee("Liza Ceban", 2000);
        Employee dan = new FullTimeEmployee("Dan Mazur", 920);

        Employee stefan = new PartTimeEmployee("Stefan Popescu", 800);
        Employee maria = new PartTimeEmployee("Maria Ivanov", 920);

        return Arrays.asList(liza, dan, stefan, maria);
    }

    public void save(Employee employee) throws IOException {
        String serializedString = this.serializer.serialize(employee);

        Path path = Paths.get(employee.getFullName()
                .replace(" ", "_") + ".rec");
        Files.write(path, serializedString.getBytes());
    }
}
