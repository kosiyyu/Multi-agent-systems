package z4;

import jade.core.Agent;
import jade.core.behaviours.SequentialBehaviour;

public class klasa_2_4 extends Agent {
    @Override
    protected void setup() {
        System.out.println("startuje");

        SequentialBehaviour sequentialBehaviour = new SequentialBehaviour();

        for (int i = 0; i < 3; i++) {
            sequentialBehaviour.addSubBehaviour(new klasa_4());
        }
        addBehaviour(sequentialBehaviour);
    }

    @Override
    public void takeDown() {
        System.out.println("zaraz się usunę");
    }

}