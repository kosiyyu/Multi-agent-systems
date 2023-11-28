package z5;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class ag_odb extends Agent {

    protected void setup() {
        addBehaviour(new CyclicBehaviour(this) {
            public void action() {
                ACLMessage msg = receive();
                if (msg != null) {
                    if (msg.getPerformative() == ACLMessage.REQUEST) {
                        System.out.println("Odebrano wiadomość typu REQUEST: " + msg.getContent());
                        ACLMessage reply = msg.createReply();
                        reply.setPerformative(ACLMessage.INFORM);
                        reply.setContent("wykonałem");
                        send(reply);
                    } else if (msg.getPerformative() == ACLMessage.CFP) {
                        System.out.println("Odebrano wiadomość typu CFP: " + msg.getContent());
                        ACLMessage reply = msg.createReply();
                        reply.setPerformative(ACLMessage.REQUEST);
                        reply.setContent("raz jeszcze");
                        send(reply);
                    } else {
                        System.out.println("Odebrano wiadomość innego typu: " + msg.getContent());
                        ACLMessage reply = msg.createReply();
                        reply.setPerformative(ACLMessage.NOT_UNDERSTOOD);
                        reply.setContent("Nie zrozumiałem");
                        send(reply);
                    }
                } else {
                    block();
                }
            }
        });
    }
}