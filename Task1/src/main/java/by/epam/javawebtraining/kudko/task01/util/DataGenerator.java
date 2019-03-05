package by.epam.javawebtraining.kudko.task01.util;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class DataGenerator {
    public static String generateName (){
        String [] names = {"John","Mike","Bob", "Ben","John", "Tim", "Brad", "Ariana", "John"};
        Random random = new Random();
        return names[random.nextInt(names.length - 1)];
    }

    public static String generateSurname (){
        String [] names = {"Finder","Sigal","Rock", "Bush","Grande", "Swift", "Newman", "Walker", "James","Jonson" };
        Random random = new Random();
        return names[random.nextInt(names.length - 1)];
    }

    public static double generateSalary (){
        return  ThreadLocalRandom.current().nextDouble(10000.0, 30000.0);
    }

    public static double generatePayRange (){
       Random random = new Random();
        return random.nextInt(10);
    }

    public static double generateExperience (int boundOfExperience){
        return  new Random().nextInt(boundOfExperience);
    }


}
