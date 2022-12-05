package LiskovSubstitutionPrinciple;

public class Vehicle {
    abstract int getSpeed();
    abstract int getCubicCapacity();
}

public class Car extends Vehicle {
    int getSpeed() {}
    int getCubitCapacity() {}
    boolean sHatchBack() {}
}

public class Bus extends Vehicle {
    int getSpeed() {}
    int getCubitCapacity() {}
    String getEmergencyExitLoc() {}
}

public static void main (String[] args) {
    Vehicle vehicle = new Bus();
    vehicle.getSpeed();
    vehicle = new Car();
    vehicle.getCubicCapacity();
}
