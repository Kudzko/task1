package by.epam.javawebtraining.kudko.task01.model.entity;

import by.epam.javawebtraining.kudko.task01.model.custom_exceptions.ExitOutOfBoundException;

public class Department {
    private Employee[] department;
    int counter;

{
    System.out.println("Hello from Department initialization");
    counter  = -1;
}

    public Department() {

        department = new Employee[10];
        System.out.println("Hello from Department default constructor");
    }

    public Department(Employee[] department) {
        this.department = department;
        System.out.println("Hello from Department custom constructor");

    }

    public void addEmployee(Employee employee){
    if((counter < department.length) && (department[counter] != null)){
        department[++counter] = employee;
    }else {
        System.out.println("department is full");
        Employee [] tempDepartment;
        tempDepartment = department;
        department = new  Employee[2*department.length];
        for (int i=0; i< tempDepartment.length; i++){
            department [i] = tempDepartment[i];
        }
        department[++counter] = employee;
        System.out.println("department is increased two times");
    }
    }

    public Employee getEmployee (int i) throws ExitOutOfBoundException {
    if ( i >= department.length){
        throw new ExitOutOfBoundException();
    }
    return department [i];
    }

    public void deleteEmployee (int i) throws ExitOutOfBoundException {
        if ( i >= department.length){
            throw new ExitOutOfBoundException();
        }
        department [i] = null;
        counter--;
        Employee tmpEmployee = department [i];
        for (int j = i; j<department.length; j++){
            department [j] = department [j+1];
            department [j+1] = tmpEmployee;
        }
    }
}
