package by.epam.javawebtraining.kudko.task01.model.logic.comparator;

import by.epam.javawebtraining.kudko.task01.model.entity.*;

import java.util.Comparator;

public class ComparatorCreator {
    public static Comparator<Employee> createCompararor(TypeComparator typeOfComparator) {
        Comparator<Employee> comparator;
        switch (typeOfComparator) {
            case SurnameComparator:
                comparator = new SurnameComparator();
                break;
            case SalaryComparator:
                comparator = new SalaryComparator();
                break;
            case ClasstypeSurnameNameComparator:
                comparator = new ClasstypeSurnameNameComparator();
                break;
            default:
                comparator = null;
                break;
        }

        return comparator;
    }
//// ТАК ВООБЩЕ МОЖНО ДЕЛАТЬ ЧТОБЫ ИСПОЛЬЗОВАТЬ ОДИН МЕТОД ДЛЯ СОРТИРОВКИ И ПРОСТО ЕМУ ПЕРЕДАВАТЬ
//    // РАЗНЫЕ ОБЪЕКТЫ КОМПАРАТОРОВ?????????????
// public  enum TypeComparator {
//        SurnameComparator, SalaryComparator, ClasstypeSurnameNameComparator;
//    }
    //  где лучше в таких случаях создвавать перечисления в отдельном классе или можно внурти?
    // или это зависит от того планируется перечисление использловать где-то еще или нет?
}
