package DependencyInjectionPrinciple;

public class Client {
    private ExampleService service;

    Client() {
        service = new ExampleService();
    }

    public String greet() {
        return "Hello " + service.getName();
    }
}

