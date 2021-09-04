package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class RootConfiguration {

//    @Bean
//    public Cat cat(){
//        return new Cat("Test Cat");
//    }
//
//    @Bean
//    public Dog dog(){
//        return new Dog("Test Dog");
//    }
//
//    @Bean
//    public User user(Cat cat, Dog dog){
//        return new User(cat, dog);
//    }
}
