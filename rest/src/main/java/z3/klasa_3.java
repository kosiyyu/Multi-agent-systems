package z3;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;

public class klasa_3 extends Agent {
    private class CyclicalBehaviour extends CyclicBehaviour {
        @Override
        public void action() {
            System.out.println("wykonuje");
        }
    }

    @Override
    protected void setup() {
        System.out.println("startuje");
        addBehaviour(new CyclicalBehaviour());
    }

    @Override
    protected void takeDown() {
        System.out.println("zaraz sie usune");
    }
}
