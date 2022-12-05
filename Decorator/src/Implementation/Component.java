package Implementation;

abstract class Component {
    public abstract void doJob();
}

class ConcreteComponent extends Component {
    @Override
    public void doJob() {
        System.out.println("A concrete component that is closed for modification");
    }
}

abstract class AbstractDecorator extends Component {
    protected Component com;

    public void SetTheComponent(Component c) {
        com = c;
    }

    public void doJob() {
        if (com != null) {
            com.doJob();
        }
    }
}

class ConcreteDecoratorEx1 extends AbstractDecorator {
    public void doJob() {
        super.doJob();
        System.out.println("A concrete decorator ex 1");
    }
}

class ConcreteDecoratorEx2 extends AbstractDecorator {
    public void doJob() {
        System.out.println("More responsibilities");
        super.doJob();
        System.out.println("A concrete decorator ex 2");
    }
}