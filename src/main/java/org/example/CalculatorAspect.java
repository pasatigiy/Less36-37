package org.example;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
@Component
public class CalculatorAspect {

    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Pointcut("@annotation(Logging) && args(..)")
    public void calculatorAspect() {

    }

    @Around("calculatorAspect()")
    public Object logging(ProceedingJoinPoint pj) throws Throwable {
        log.log(Level.INFO, "Start");
        Object proceed = pj.proceed();
        log.log(Level.INFO, "Finish");
        return proceed;
    }
}
