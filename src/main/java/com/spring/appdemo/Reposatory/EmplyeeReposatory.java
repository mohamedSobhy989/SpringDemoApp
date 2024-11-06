package com.spring.appdemo.Reposatory;
import com.spring.appdemo.Models.Employee;
import java.util.List;

public interface EmplyeeReposatory {

    public Employee findByID(Long id);
    public List<Employee> findAll();
    public void addEmployee(Employee employee);
    public Employee editEmployee(Employee employee);
    public int deleteEmployee(Long id);

}
