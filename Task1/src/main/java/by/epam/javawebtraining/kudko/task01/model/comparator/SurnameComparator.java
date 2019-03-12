package by.epam.javawebtraining.kudko.task01.model.comparator;

import by.epam.javawebtraining.kudko.task01.model.entity.Employee;

import java.util.Comparator;


public class SurnameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if ((o1.getSurname() != null) && (o2.getSurname() != null)) {
            String surname1 = o1.getSurname();
            String surname2 = o2.getSurname();
            return surname1.compareTo(surname2);
        } else if ( (o1.getSurname() == null) && (o2.getSurname() != null) ) {
            return 1;
        } else if ( (o1.getSurname() != null) && (o2.getSurname()== null) ){
            return -1;
        } else  {
            return 0;
        }
    }
}
