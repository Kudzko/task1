package by.epam.javawebtraining.kudko.task01.view;

public class ConsolePrinter implements Printable{

    @Override
    public void print(Object o) {
        System.out.println(o);
    }

    @Override
    public void print(String comment, Object o) {
        System.out.println(comment + " " + o);
    }

    @Override
    public void print(String Headcomment) {
        System.out.println(Headcomment);
    }
}
