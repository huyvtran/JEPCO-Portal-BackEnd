package com.lg.JepcoCsPortal.utils;

/**
 *
 * @author abdallah dabbas
 */
public class MessageBody {

    private static MessageBody messageBody = null;

    private int status;

    private String key;

    private Object body;

    private MessageBody() {

    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public static MessageBody getInstance() {
        if (messageBody == null) {
            messageBody = new MessageBody();
        }

        messageBody.setBody(null);

        return messageBody;
    }
}
