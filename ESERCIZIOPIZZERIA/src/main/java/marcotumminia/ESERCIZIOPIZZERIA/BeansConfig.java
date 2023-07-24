package marcotumminia.ESERCIZIOPIZZERIA;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class BeansConfig {

	@Bean
	String Hello() {
		return "Ciao Mondo";
	}

    @Bean
    public Pizza margherita() {
        return new Pizza("Margherita", 4.50, 130, List.of("pomodoro", "mozzarella"), Size.GRANDE);
    }

    @Bean
    public Pizza prosciutto() {
        return new Pizza("Prosciutto", 5.00, 150, List.of("pomodoro", "mozzarella", "prosciutto"), Size.GRANDE);
    }

    @Bean
    public Pizza hawaiiPizza() {
        return new Pizza("Hawaii Pizza", 6.00, 160, List.of("pomodoro", "mozzarella", "prosciutto", "ananas"), Size.NORMALE);
    }

    @Bean
    public Drink cocacola() {
        return new Drink("CocaCola", 2.50, 150);
    }

    @Bean
    public Drink fanta() {
        return new Drink("Fanta", 2.50, 130);
    }

    @Bean
    public Merchandise tshirt() {
        return new Merchandise("Nike T-Shirt", 15.00);
    }

    @Bean
    public Merchandise tazza() {
        return new Merchandise("Maison Tazza", 10.00);
    }
}
