package com.test.spring.echo;

public class DefaultEchoMessage implements EchoService{

    private final String echoFormat;

    public DefaultEchoMessage(String echoFormat){
        this.echoFormat = null != echoFormat ? echoFormat : "%s";
    }

    @Override
    public String getMessage(String message) {
        return String.format(this.echoFormat, message);
    }
}
