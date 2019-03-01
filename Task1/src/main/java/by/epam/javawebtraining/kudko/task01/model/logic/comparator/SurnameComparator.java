package by.epam.javawebtraining.kudko.task01.model.logic.comparator;

import by.epam.javawebtraining.kudko.task01.model.entity.Employee;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class SurnameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if ((o1.getSurname() != null) && (o2.getSurname()!= null)) {
            String surname1 = o1.getSurname();
            String surname2 = o2.getSurname();
            return surname1.compareTo(surname2);
        }else if (o1.getSurname()==null){
            return 1;
        }else if (o2.getSurname()==null){

        }
        return -10;
    }

//    @Override
//    public Comparator<Employee> reversed() {
//        return null;
//    }
//
//    @Override
//    public Comparator<Employee> thenComparing(Comparator<? super Employee> other) {
//        return null;
//    }
//
//    @Override
//    public <U> Comparator<Employee> thenComparing(Function<? super Employee, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
//        return null;
//    }
//
//    @Override
//    public <U extends Comparable<? super U>> Comparator<Employee> thenComparing(Function<? super Employee, ? extends U> keyExtractor) {
//        return null;
//    }
//
//    @Override
//    public Comparator<Employee> thenComparingInt(ToIntFunction<? super Employee> keyExtractor) {
//        return null;
//    }
//
//    @Override
//    public Comparator<Employee> thenComparingLong(ToLongFunction<? super Employee> keyExtractor) {
//        return null;
//    }
//
//    @Override
//    public Comparator<Employee> thenComparingDouble(ToDoubleFunction<? super Employee> keyExtractor) {
//        return null;
//    }
}
