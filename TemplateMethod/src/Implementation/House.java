package Implementation;

abstract class House {
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built");
    }

    private void buildWindows() {
        System.out.println("Build glass windows");
    }

    public abstract void buildWalls();
    public abstract void buildPillars();

    private void buildFoundation() {
        System.out.println("Build foundation");;
    }
}

class WoodHouse extends House {
    public void buildWalls() {
        System.out.println("Build wood walls");
    }

    public void buildPillars() {
        System.out.println("Build wood pillars");
    }
}

class GlassHouse extends House {
    public void buildWalls() {
        System.out.println("Build glass walls");
    }

    public void buildPillars() {
        System.out.println("Build glass pillars");
    }
}