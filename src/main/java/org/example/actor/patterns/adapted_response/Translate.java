package org.example.actor.patterns.adapted_response;

import akka.actor.typed.ActorRef;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.net.URI;

@AllArgsConstructor(staticName = "of")
@Getter
@EqualsAndHashCode
@ToString
public class Translate implements Command {
    private final URI site;
    private final ActorRef<URI> replyTo;
}
