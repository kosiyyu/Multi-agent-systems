package z5;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class ag_pl extends Agent {

    protected void setup() {
        addBehaviour(new CyclicBehaviour(this) {
            public void action() {
                ACLMessage msg = receive();

                if (msg != null && "polski".equals(msg.getUserDefinedParameter("język"))) {
                    System.out.println("Odebrano wiadomość po polsku: " + msg.getContent());
                }
            }
        });
    }
}