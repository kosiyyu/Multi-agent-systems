package z4;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.ParallelBehaviour;

public class klasa_2_5 extends Agent {
    protected void setup() {
        System.out.println("startuje");
        ParallelBehaviour parallelBehaviour = new ParallelBehaviour(ParallelBehaviour.WHEN_ALL);
        parallelBehaviour.addSubBehaviour(new CyclicBehaviour1());
        parallelBehaviour.addSubBehaviour(new CyclicBehaviour2());
        addBehaviour(parallelBehaviour);
    }

    public void takeDown() {
        System.out.println("zaraz się usune");
    }

    private class CyclicBehaviour1 extends Behaviour {
        public void action() {
            System.out.println("cyclic 1");
        }
        public boolean done() {
            return false;
        }
    }
    private class CyclicBehaviour2 extends Behaviour {
        public void action() {
            System.out.println("cyclic 2");
        }
        public boolean done() {
            return false;
        }
    }
}
