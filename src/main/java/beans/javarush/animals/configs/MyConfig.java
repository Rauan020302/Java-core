package beans.javarush.animals.configs;

import beans.javarush.animals.entities.Cat;
import beans.javarush.animals.entities.Dog;
import beans.javarush.animals.entities.Parrot;
import beans.javarush.animals.week.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Configuration
public class MyConfig {

    @Bean
    public Cat getCat(Parrot parrot) {
        Cat cat = new Cat();
        cat.setName(parrot.getName() + "-killer");
        return cat;
    }
    @Bean("dog")
    public Dog getDog() {
        return new Dog();
    }
    @Bean("parrot-kesha")
    public Parrot weNeedMoreParrots() {
        return new Parrot();

    }


    @Bean
    public WeekDay getDay() {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        switch (dayOfWeek) {
            case MONDAY: return new Monday();
            case TUESDAY: return new Tuesday();
            case WEDNESDAY: return new Wednesday();
            case THURSDAY: return new Thursday();
            case FRIDAY: return new Friday();
            case SATURDAY: return new Saturday();
            default: return new Sunday();
        }
    }
}
