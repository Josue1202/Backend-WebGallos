package com.josue.Backend_WebGallos;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry
                .addMapping("/**")                   // aplica a todas las rutas
                .allowedOrigins("*")                 // o pon tu dominio en vez de "*"
                .allowedMethods("GET","POST","PUT","DELETE","OPTIONS")
                .allowedHeaders("*")                 // si necesitas exponer cabeceras específicas
                .allowCredentials(false)             // o true si manejas cookies/autenticación
                .maxAge(3600);                       // cache de la configuración por 1 hora
    }
}