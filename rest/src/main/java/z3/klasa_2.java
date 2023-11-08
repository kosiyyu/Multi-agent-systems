package z3;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;

public class klasa_2 extends Agent {
    private class CustomBehaviour extends Behaviour {
        @Override
        public void action() {
            System.out.println("wykonuje");
        }

        @Override
        public boolean done() {
            return false;
        }
    }

    protected void setup() {
        System.out.println("startuje");
        addBehaviour(new CustomBehaviour());
    }

    @Override
    protected void takeDown() {
        System.out.println("zaraz sie usune");
    }
}

