import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByDepartment(String department);

    List<Employee> findBySalaryGreaterThan(double salary);

    @Query("SELECT e FROM Employee e WHERE e.name LIKE %:name%")
    List<Employee> findByNameContains(@Param("name") String name);

    @Query("SELECT e FROM Employee e WHERE e.department = :department AND e.salary > :salary")
    List<Employee> findHighEarningEmployeesInDepartment(@Param("department") String department, @Param("salary") double salary);
}
