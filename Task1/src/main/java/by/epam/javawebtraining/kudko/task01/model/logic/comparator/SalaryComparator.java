package by.epam.javawebtraining.kudko.task01.model.logic.comparator;

import by.epam.javawebtraining.kudko.task01.model.entity.Employee;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if ((o1 != null)&& (o2 != null)){
            Double salaryO1 = o1.getSalary();
            Double salaryO2 = o2.getSalary();
            return  salaryO1.compareTo(salaryO2);

        }else if (((o1 == null) && (o2 != null))){
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public Comparator<Employee> reversed() {
        return new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if ((o1 != null)&& (o2 != null)){
                    Double salaryO1 = o1.getSalary();
                    Double salaryO2 = o2.getSalary();
                    return  salaryO2.compareTo(salaryO1);

                }else if (((o1 == null) && (o2 != null))){
                    return 1;
                }else {
                    return 0;
                }
            }
        };
    }
}
