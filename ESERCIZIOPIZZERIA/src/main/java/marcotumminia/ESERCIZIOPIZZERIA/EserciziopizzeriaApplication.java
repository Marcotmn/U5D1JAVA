package marcotumminia.ESERCIZIOPIZZERIA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lombok.extern.slf4j.Slf4j;


@SpringBootApplication
@Slf4j
public class EserciziopizzeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EserciziopizzeriaApplication.class, args);
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EserciziopizzeriaApplication.class);

		log.info("Godfather's Pizza - Menu");
		log.info("=========================");
		log.info("Pizze:");
		log.info("------");
		log.info(ctx.getBean("margherita").toString());
		log.info(ctx.getBean("prosciutto").toString());
		log.info(ctx.getBean("hawaiiPizza").toString());

		log.info("Bevande:");
		log.info("--------");
		log.info(ctx.getBean("cocacola").toString());
		log.info(ctx.getBean("fanta").toString());

		log.info("Merchandise:");
		log.info("------------");
		log.info(ctx.getBean("tshirt").toString());
		log.info(ctx.getBean("tazza").toString());

		ctx.close();
	}
}
