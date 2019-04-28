package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import controllers.ItemController;
import services.ItemService;

@SpringBootApplication(
	//Configuramos la inyección de depensencias
	scanBasePackageClasses = {
		ItemService.class,
		ItemController.class
	}
)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
            	//Configuramos los origenes para que desde cualquier sitio se puedan hacer peticiones
            	registry.addMapping("/**");
            }
        };
    }
}
