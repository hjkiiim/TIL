package org.example.behavioralPattern.mediator.component;

import org.example.behavioralPattern.mediator.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
