package org.example;

import org.example.console.CalculatorAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Bootstrap {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(RootConfiguration.class);
        CalculatorAction calculatorAction = applicationContext.getBean("calculatorAction", CalculatorAction.class);
        calculatorAction.run();
    }
}
