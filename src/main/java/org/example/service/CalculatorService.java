package org.example.service;

import org.example.Logging;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;
//aspect
//advice
//pointcut



@Component
public class CalculatorService {

    @Logging
    public void test(){

    }

    public double calc(double a, double b, String operation){
        switch (operation){
            case "sum":
                return a+b;
        }
        return 0;
    }
}
