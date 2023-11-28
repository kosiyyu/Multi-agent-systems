package z5;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

import java.util.Random;

public class ag_wys_odb extends Agent {
    protected void takeDown() {
        System.out.println("zamykam ag_wys_odb");
    }

    protected void setup() {
        addBehaviour(new CyclicBehaviour(this) {
            public void action() {
                int randomNumer = new Random().nextInt(2);

                ACLMessage msg = new ACLMessage(randomNumer == 0 ? ACLMessage.CFP : ACLMessage.REQUEST);
                msg.addReceiver(getAID("BOT"));
                msg.setContent("Wiadomość");

                send(msg);

                ACLMessage receivedMsg = receive();
                if (receivedMsg != null) {
                    System.out.println("Odebrano wiadomość: " + receivedMsg.getContent());

                    if (receivedMsg.getPerformative() == ACLMessage.INFORM) {
                        doDelete();

                    } else {
                        reset();
                    }
                } else {
                    block();
                }
            }
        });
    }
}