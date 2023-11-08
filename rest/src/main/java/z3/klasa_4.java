package z3;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;

public class klasa_4 extends Agent {
    private class ThreeStepBehaviour extends Behaviour {
        private int step = 0;
        @Override
        public void action() {
            switch (step){
                case 0:
                    System.out.println("pierwszy krok");
                    step++;
                    break;
                case 1:
                    System.out.println("drugi krok");
                    step++;
                    break;
                case 2:
                    System.out.println("trzeci krok");
                    step++;
                    removeBehaviour(this);
                    break;
            }
        }

        @Override
        public boolean done() {
            return false;
        }
    }
    @Override
    protected void setup() {
        System.out.println("startuje");
        addBehaviour(new ThreeStepBehaviour());
    }

    @Override
    protected void takeDown() {
        System.out.println("zaraz sie usune");
    }
}
