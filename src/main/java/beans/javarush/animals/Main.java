package beans.javarush.animals;

import beans.javarush.animals.configs.MyConfig;
import beans.javarush.animals.entities.Cat;
import beans.javarush.animals.entities.Dog;
import beans.javarush.animals.entities.Parrot;
import beans.javarush.animals.week.WeekDay;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("beans.javarush.animals");

        Cat cat = context.getBean(Cat.class);
        Dog dog = (Dog) context.getBean("dog");
        Parrot parrot = context.getBean("parrot-kesha",Parrot.class);

        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());

        WeekDay weekDay = context.getBean(WeekDay.class);
        System.out.println("It's " + weekDay.getWeekDayName() + " today!");
    }
}
