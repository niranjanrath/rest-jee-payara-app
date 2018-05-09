package nl.niranjan.ee.trash;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class MessageB implements Message {

    public MessageB() {
    }

    @Override
    public String get() {
        return "message B";
    }
}
