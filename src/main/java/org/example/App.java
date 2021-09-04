package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//xml
//java base
//annotation

//field
//constructor
//setter

public class App {
    public static void main( String[] args ) {
        ApplicationContext ap = new AnnotationConfigApplicationContext(RootConfiguration.class);

    }
}
