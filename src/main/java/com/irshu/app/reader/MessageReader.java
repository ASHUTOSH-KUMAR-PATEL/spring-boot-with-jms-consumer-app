package com.irshu.app.reader;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReader {

    @JmsListener(destination = "sample")
    public void readMessage(String message){
        System.out.println("Data at consumer => "+message);
    }
}
