package z4;

import jade.core.Agent;
import jade.core.behaviours.ParallelBehaviour;

public class klasa_2_3 extends Agent {
    @Override
    protected void setup() {
        System.out.println("startuje");
        ParallelBehaviour parallelBehaviour = new ParallelBehaviour(ParallelBehaviour.WHEN_ALL);
        for (int i = 0; i < 3; i++) {
            parallelBehaviour.addSubBehaviour(new klasa_4());
        }
        addBehaviour(parallelBehaviour);
    }

    @Override
    public void takeDown() {
        System.out.println("zaraz sie usune");
    }
}
