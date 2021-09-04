package org.example.console;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter {

    void write(String message){
        System.out.println(message);
    }
}
