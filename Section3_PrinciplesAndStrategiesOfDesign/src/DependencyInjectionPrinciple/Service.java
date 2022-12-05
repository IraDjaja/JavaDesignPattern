package DependencyInjectionPrinciple;

public interface Service {
    void write(String message);
}

public class ServiceA implements Service {
    @override
    public void write(String message) {
        System.out.println("Hello World");
    }
}

class Client {
    private Service myService;

    public Client (Service service) {
        this.myService = service;
    }

    public void doSomething() {
        myService.write("This is a message");
    }

    public void setService(Service service) {
        this.myService = service;
    }

    public static void main(String[] args) {
        Service service = new ServiceA();
        Client client = new Client(service);
        client.doSomething();

        client.setService(service);
    }
}