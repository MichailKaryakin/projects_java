package tinyProject;

import java.util.List;

public class EmployeeList {
    List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public boolean existsInList(String nameAndInitials, List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            String nameIncluded = employee.getNameAndInitials();
            if (java.util.Objects.equals(nameAndInitials, nameIncluded)) {
                return true;
            }
        }
        return false;
    }
}
