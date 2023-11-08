package z3;

import jade.core.Agent;

public class klasa_1 extends Agent {
    @Override
    protected void setup() {
        System.out.println("startuje");
    }

    @Override
    protected void takeDown() {
        System.out.println("zaraz sie usune");
    }
}
