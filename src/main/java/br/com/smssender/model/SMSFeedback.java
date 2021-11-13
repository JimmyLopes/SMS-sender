package br.com.smssender.model;

import org.springframework.stereotype.Component;

@Component
public class SMSFeedback {

    private String toNumber;
    private String message;

    public String getToNumber() {
        return toNumber;
    }

    public void setToNumber(String toNumber) {
        this.toNumber = toNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
