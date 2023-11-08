package z3;

import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;

public class klasa_8 extends Agent {

    @Override
    protected void setup() {
        System.out.println("startuje");
        addBehaviour(new TickerBehaviour(this, 2000) {
            @Override
            protected void onTick() { System.out.println("maly tick"); }
        });
        TickerBehaviour duzyTick = new TickerBehaviour(this, 5000) {
            @Override
            protected void onTick() { System.out.println("duzy tick"); }
        };
        addBehaviour(duzyTick);
        addBehaviour(new TickerBehaviour(this, 50000) {
            @Override
            protected void onTick() {
                removeBehaviour(duzyTick);
                System.out.println("usunieto duzy tick");
            }
        });
        addBehaviour(new TickerBehaviour(this, 100000) {
            @Override
            protected void onTick() { doDelete(); }
        });
    }
    @Override
    protected void takeDown() { System.out.println("zaraz się usune"); }
}
