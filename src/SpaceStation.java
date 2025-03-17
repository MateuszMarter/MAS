import java.util.ArrayList;
import java.util.List;

public class SpaceStation extends Ext {
    private static int nextID = 1;

    private int id;
    private String name;
    private List<Module> modules;
    private Crew crew;  //atr złożony

    public SpaceStation(int id, String name, List<Module> modules, Crew crew) {
        setId();
        setName(name);
        setModules(modules);
        setCrew(crew);
    }

    public void setId() {
        this.id = nextID++;
    }

    public void setName(String name) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name is required");
        }

        this.name = name;
    }

    public void setModules(List<Module> modules) {
        if(modules == null) {
            this.modules = new ArrayList<Module>();
        } else this.modules = modules;
    }

    public void setCrew(Crew crew) {
        if(crew == null) {
            throw new IllegalArgumentException("Crew is required");
        }

        this.crew = crew;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Module> getModules() {
        return modules;
    }

    public Crew getCrew() {
        return crew;
    }

    @Override
    public String toString() {
        return "SpaceStation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", modules=" + modules +
                ", crew=" + crew +
                '}';
    }
}
