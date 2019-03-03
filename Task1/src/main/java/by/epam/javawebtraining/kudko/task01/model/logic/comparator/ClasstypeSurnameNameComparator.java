package by.epam.javawebtraining.kudko.task01.model.logic.comparator;

import by.epam.javawebtraining.kudko.task01.model.entity.*;

import java.util.Comparator;

public class ClasstypeSurnameNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if ((o1 != null) && (o2 != null)) {
            if ((o1 instanceof Manager) && (o2 instanceof Inferior)) {
                return -1;
            } else if ((o1 instanceof Inferior) && (o2 instanceof Manager)) {
                return 1;
            } else {
                if (((o1 instanceof ProjectManager) && (o2 instanceof TeamLead))
                        || (((o1 instanceof Developer) && (o2 instanceof Tester)))) {
                    return -1;
                } else if (((o1 instanceof TeamLead) && (o2 instanceof ProjectManager))
                || ((o1 instanceof Tester) && (o2 instanceof Developer))){
                    return 1;
                }  else {
                    String surnameO1 = o1.getSurname();
                    String surnameO2 = o2.getSurname();
                    if ((surnameO1 != null) && (surnameO2 != null)) {
                        int result = surnameO1.compareTo(surnameO2);
                        if (result != 0) {
                            return result;
                        } else if ((o1.getName() != null) && (o2.getName() != null)) {
                            return o1.getName().compareTo(o2.getName());
                        } else {
                            return 0;
                        }


                    }else {
                        return 0;
                    }

                }
            }
        } else if ((o1 == null) && (o2 != null)) {
            return 1;
        } else if ((o1 != null)&& (o2 == null)) {
            return -1;
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