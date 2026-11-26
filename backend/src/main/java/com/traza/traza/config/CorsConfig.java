
package com.traza.traza.config;

// Importamos las clases necesarias para configurar Spring
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// Indicamos que esta clase contiene configuraciones de Spring
@Configuration
public class CorsConfig {

    // Registramos la configuración de CORS como un componente de Spring
    @Bean
    public WebMvcConfigurer corsConfigurer() {

        // Creamos una configuración personalizada para las peticiones HTTP
        return new WebMvcConfigurer() {

            // Método que permite configurar las reglas de CORS
            @Override
            public void addCorsMappings(CorsRegistry registry) {

                // Aplicamos estas reglas a todos los endpoints de la API
                registry.addMapping("/**")

                        // Permitimos peticiones desde el frontend Angular
                        // que se ejecuta en el puerto 4200
                        .allowedOrigins("http://localhost:4200")

                        // Permitimos los métodos HTTP que utiliza nuestra API
                        .allowedMethods(
                                "GET",
                                "POST",
                                "PUT",
                                "PATCH",
                                "DELETE",
                                "OPTIONS"
                        )

                        // Permitimos cualquier cabecera HTTP
                        .allowedHeaders("*");
            }
        };
    }
}
