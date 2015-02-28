package io.advantageous.qbit.events.impl;

import io.advantageous.qbit.events.EventConnector;
import io.advantageous.qbit.message.Event;

import java.util.function.Predicate;

public class ConditionalEventConnector implements EventConnector {

    private final Predicate<Event<Object>> handleEvent;
    private final EventConnector eventConnector;

    public ConditionalEventConnector(Predicate<Event<Object>> handleEvent, EventConnector remoteChannel) {
        this.handleEvent = handleEvent;
        this.eventConnector = remoteChannel;
    }


    @Override
    public void forwardEvent(
            final Event<Object> event) {
        if ( handleEvent.test( event ) ) {
            eventConnector.forwardEvent(event);
        }
    }
}
