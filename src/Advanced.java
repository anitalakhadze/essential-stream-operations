import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Advanced {
    enum Gender {
        MALE, FEMALE
    }

    record Employee(String name, int age, int salary, Gender gender) {
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 20, 2000, Gender.MALE);
        Employee employee2 = new Employee("Jane", 28, 2000, Gender.FEMALE);
        Employee employee3 = new Employee("Alex", 38, 2750, Gender.MALE);
        Employee employee4 = new Employee("Mary", 35, 3500, Gender.FEMALE);
        Employee employee5 = new Employee("Pedro", 40, 3100, Gender.MALE);

        List<Employee> employees = List.of(employee1, employee2, employee3, employee4, employee5);

        double summed = employees
                .stream()
                .filter(employee -> employee.gender.equals(Gender.MALE) && employee.age > 25)
                .mapToDouble(Employee::salary)
                .sum();
        assert summed == 2750 + 3100; // We expect here Alex's salary + Pedro's salary

        boolean existsFemaleEmployeeWithName = employees
                .stream()
                .filter(employee -> employee.gender.equals(Gender.FEMALE) && employee.age < 30)
                .anyMatch(employee -> employee.name.equals("Jane"));
        assert existsFemaleEmployeeWithName;

        Integer totalSalaryBudget = employees
                .stream()
                .map(Employee::salary)
                .reduce(0, Integer::sum);
        assert totalSalaryBudget == 2000 + 2000 + 2750 + 3500 + 3100;

        List<Integer> top3HighestSalaries = employees
                .stream()
                .map(Employee::salary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();
        assert List.of(3500, 3100, 2750).equals(top3HighestSalaries);

        Map<Gender, Integer> genderToTotalSalaryMap = employees
                .stream()
                .filter(employee -> employee.age > 20)
                .collect(Collectors.groupingBy(Employee::gender, Collectors.summingInt(Employee::salary)));
        assert genderToTotalSalaryMap.get(Gender.MALE) == 2750 + 3100;
        assert genderToTotalSalaryMap.get(Gender.FEMALE) == 2000 + 3500;
    }

}
