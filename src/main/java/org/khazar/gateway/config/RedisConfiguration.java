package org.khazar.gateway.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

@Configuration
public class RedisConfiguration {

    @Bean
    public KeyResolver redisKeyResolver() {

        return exchange -> Mono.just("userKey");
    }
}