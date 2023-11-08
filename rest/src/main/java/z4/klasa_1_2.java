package z4;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;

import java.util.Random;

public class klasa_1_2 extends Agent {

    @Override
    protected void setup() {
        addBehaviour(new A());
    }
}

class A extends Behaviour {
    @Override
    public void action() {
        System.out.println("A");
        myAgent.addBehaviour(new B());
        myAgent.removeBehaviour(this);
    }

    @Override
    public boolean done() {
        return true;
    }
}

class B extends Behaviour {
    @Override
    public void action() {
        Random rand = new Random();
        int num = rand.nextInt(2);
        System.out.println("B");
        System.out.println("Number" + num + " was drawn");
        if (num == 1) {
            myAgent.addBehaviour(new C());
            myAgent.removeBehaviour(this);
        } else {
            myAgent.addBehaviour(new D());
            myAgent.removeBehaviour(this);
        }
    }

    @Override
    public boolean done() {
        return true;
    }
}

class C extends Behaviour {
    @Override
    public void action() {
        System.out.println("C");
        myAgent.addBehaviour(new D());
        myAgent.removeBehaviour(this);
    }

    @Override
    public boolean done() {
        return true;
    }
}

class D extends Behaviour {
    @Override
    public void action() {
        Random rand = new Random();
        int num = rand.nextInt(2);
        System.out.println("Number" + num + " was drawn");
        System.out.println("D");
        if (num == 1) {
            myAgent.addBehaviour(new A());
            myAgent.removeBehaviour(this);
        } else {
            myAgent.addBehaviour(new E());
            myAgent.removeBehaviour(this);
        }
    }

    @Override
    public boolean done() {
        return true;
    }
}

class E extends Behaviour {
    @Override
    public void action() {
        System.out.println("E");
        myAgent.removeBehaviour(this);
    }

    @Override
    public boolean done() {
        return true;
    }
}