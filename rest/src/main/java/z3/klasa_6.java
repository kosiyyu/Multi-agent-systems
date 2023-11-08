package z3;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;

import java.util.Scanner;

public class klasa_6 extends Agent {
    private class InputNumberBehaviour extends Behaviour {
        private final Scanner sc = new Scanner(System.in);

        private int number = 0;
        @Override
        public void action() {
            number = sc.nextInt();
            System.out.println("number: " + number);
            if(number < 0){
                System.out.println("usuwanie zachowania");
                myAgent.removeBehaviour(this);
                System.out.println("zachowanie zakonczone");
            }
        }

        @Override
        public boolean done() {
            return false;
        }

        @Override
        public void onStart() {
            System.out.println("zachowanie startuje");
        }
    }
    @Override
    protected void setup() {
        addBehaviour(new InputNumberBehaviour());
    }

    @Override
    protected void takeDown() {
        System.out.println("zaraz sie usune");
    }
}
