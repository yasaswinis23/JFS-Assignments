import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployeesByDepartment(String department) {
        return employeeRepository.findByDepartment(department);
    }

    public List<Employee> getEmployeesWithHighSalary(double salary) {
        return employeeRepository.findBySalaryGreaterThan(salary);
    }

    public List<Employee> searchEmployeesByName(String name) {
        return employeeRepository.findByNameContains(name);
    }

    public List<Employee> getHighEarningEmployeesInDepartment(String department, double salary) {
        return employeeRepository.findHighEarningEmployeesInDepartment(department, salary);
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
