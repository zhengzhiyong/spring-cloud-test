package com.springcloud.gateway.api.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayRoutes {

    @Bean
    public RouteLocator route163(RouteLocatorBuilder builder){
        return builder.routes()
               .route(r -> r.path("/163/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("http://www.163.com")
                )
                .build();
    }

}
