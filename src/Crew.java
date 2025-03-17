import java.util.ArrayList;
import java.util.List;

public class Crew {
    private String id;
    private List workers;

    public Crew(String id, List<CrewWorker> workers) {
        setId(id);
        setWorkers(workers);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setWorkers(List<CrewWorker> workers) {
        this.workers = workers;
    }

    public void addWorker(CrewWorker worker) {
        if(worker != null) {
            this.workers.add(worker);
        } else {
            throw new NullPointerException();
        }
    }
}
