package net.codejava;

import org.glassfish.jersey.internal.inject.AbstractBinder;

public class MyApplicationBinder  extends AbstractBinder {
    @Override
    protected void configure() {
        bind(ActorDAO.class).to(ActorDAO.class);
    }
}