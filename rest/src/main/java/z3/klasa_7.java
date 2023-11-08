package z3;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.OneShotBehaviour;

public class klasa_7 extends Agent {
    protected void setup() {
        System.out.println("startuje");
        addBehaviour(new OneShotBehaviour() {
            @Override
            public void action() { System.out.println("pierwsze"); }
        });
        addBehaviour(new GenericBehaviour());
    }
    private class GenericBehaviour extends Behaviour {
        private int step = 0;
        public void action() {
            switch (step) {
                case 0:
                    System.out.println("pierwszy krok");
                    addBehaviour(new OneShotBehaviour() {
                        @Override
                        public void action() { System.out.println("drugie"); }
                    });
                    break;
                case 1:
                    System.out.println("drugi krok");
                    break;
                case 2:
                    System.out.println("trzeci krok");
                    myAgent.removeBehaviour(this);
                    break;
            }
            step++;
        }
        public boolean done() {
            return step == 3;
        }
    }

    @Override
    protected void takeDown() {
        System.out.println("zaraz sie usune");
    }

}