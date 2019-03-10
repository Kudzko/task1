package by.epam.javawebtraining.kudko.task01.view;

public class ConsolePrinter implements Printable{

    @Override
    public void print(Object o) {
        System.out.println(o);
    }

    @Override
    public void print(String additionalInfo, Object o) {
        System.out.println(additionalInfo);
        System.out.println(o);
    }
}
