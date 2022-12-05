package Implementation;

public class Client {
    public static void main(String[] args) {
       ConcreteComponent cc = new ConcreteComponent();
       cc.doJob();

       ConcreteDecoratorEx1 cd1 = new ConcreteDecoratorEx1();
       cd1.SetTheComponent(cc);
       cd1.doJob();

       ConcreteDecoratorEx2 cd2 = new ConcreteDecoratorEx2();
       cd2.SetTheComponent(cc);
       cd2.doJob();
    }
}
