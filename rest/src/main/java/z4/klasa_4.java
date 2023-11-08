package z4;

import jade.core.behaviours.Behaviour;

public class klasa_4 extends Behaviour {
    private int step = 0;
    public void action() {
        switch (step) {
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
                myAgent.removeBehaviour(this);
                break;
        }
    }
    public boolean done(){
        return  (step == 3);
    }
}
