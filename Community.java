package HwAbstract;

public abstract class Community {
    private String name;
    private String manager;
    private int population;

    public Community(String name, String manager, int population) {
        this.name = name;
        this.manager = manager;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
