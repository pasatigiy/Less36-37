package org.example.console;

import org.example.service.CalculatorService;
import org.springframework.stereotype.Component;

@Component
public class CalculatorAction {

    private final ConsoleReader consoleReader;
    private final ConsoleWriter consoleWriter;
    private final CalculatorService calculatorService;

    public CalculatorAction(ConsoleReader consoleReader, ConsoleWriter consoleWriter, CalculatorService calculatorService) {
        this.consoleReader = consoleReader;
        this.consoleWriter = consoleWriter;
        this.calculatorService = calculatorService;
    }

    public void run(){

//        consoleWriter.write("Enter number 1");
//        double num1 = consoleReader.readDouble();
//        consoleWriter.write("Enter number 2");
//        double num2 = consoleReader.readDouble();
//        consoleWriter.write("Choose operation 1 - Sum");
//        String operation = consoleReader.readString();
//        double result = calculatorService.calc(num1, num2, operation);
//        consoleWriter.write("Result " + result);
        calculatorService.test();
    }
}
