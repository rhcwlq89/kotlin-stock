package com.example.stock

import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Configuration {
    @Bean
    fun databaseInitializer(userRepository: UserRepository) = ApplicationRunner {
        userRepository.save(User("smaldini", "Stéphane", "Maldini"))
    }
}