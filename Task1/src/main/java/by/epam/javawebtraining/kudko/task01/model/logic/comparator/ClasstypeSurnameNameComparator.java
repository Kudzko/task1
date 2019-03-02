package by.epam.javawebtraining.kudko.task01.model.logic.comparator;

import by.epam.javawebtraining.kudko.task01.model.entity.Employee;
import by.epam.javawebtraining.kudko.task01.model.entity.Manager;

import java.util.Comparator;

public class ClasstypeSurnameNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if ((o1 != null) && (o2 != null)){
            if ((o1 instanceof Manager) && (o1 instanceof Employee)){

            }
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public Comparator<Employee> reversed() {
        return null;
    }
}
