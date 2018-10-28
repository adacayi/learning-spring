package bean_ambiguity_solving_custom_qualifier_java_explicit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Meal dinner(@Cold @Creamy Dessert desert) {
        Dinner dinner = new Dinner();
        dinner.prepareDesert(desert);
        return dinner;
    }

    @Bean
    @Cold
    @Fruity
    public Dessert popsicle() {
        return new Popsicle();
    }

    @Bean
    @Cold
    @Creamy
    public Dessert iceCream() {
        return new IceCream();
    }
}
