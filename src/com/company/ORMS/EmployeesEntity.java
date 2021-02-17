package com.company.ORMS;

import javax.persistence.*;

@Entity
@Table(name = "Employees")
public class EmployeesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmployeeId", insertable = false, nullable = false)
    private Integer employeeId;
    @Column(name = "FirstName", nullable = false)
    private String firstName;
    @Column(name = "LastName", nullable = false)
    private String lastName;
    @Column(name = "MontlyIncome", nullable = false)
    private int monthlyIncome;
    @Column(name = "nbHoursPerWeek", nullable = false)
    private int nbHoursPerWeek;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(int monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public int getNbHoursPerWeek() {
        return nbHoursPerWeek;
    }

    public void setNbHoursPerWeek(int nbHoursPerWeek) {
        this.nbHoursPerWeek = nbHoursPerWeek;
    }

}
