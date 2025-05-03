package com.jobgenie.myjobapp.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("JobGenie API Documentatiton")
                        .version("1.0")
                        .description("JobGenie REST Api is used to register companies, post their reviews and post job openings in that company "));
    }
}
