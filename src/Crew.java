import java.util.ArrayList;
import java.util.List;

public class Crew extends Ext {
    private int id;
    private List<CrewWorker> workers; //atr powtarzlny
    private static int nextId = 1; //atr klasowy

    public static int countAllWorkers() {
        List<Crew> list = Ext.getExt(Crew.class);
        int res = 0;

        for (Crew crew : list) {
            res += crew.getWorkers().size();
        }

        return res;
    }

    public Crew(List<CrewWorker> workers) {
        setId();
        setWorkers(workers);
    }

    public void setId() {
        this.id = nextId++;
    }

    public void setWorkers(List<CrewWorker> workers) {
        if(workers == null || workers.isEmpty()) {
            throw new IllegalArgumentException("WE NEED WORKERS");
        }

        this.workers = workers;
    }

    public void addWorker(CrewWorker worker) {
        if(worker != null) {
            this.workers.add(worker);
        } else {
            throw new NullPointerException();
        }
    }


    private String printWorkers() {
        if(workers.isEmpty()) {
            return "[]";
        }

        StringBuilder res = new StringBuilder("[ ");

        for (CrewWorker c : workers) {
            res.append(c);
            res.append(" ");
        }

        res.append("]");

        return String.valueOf(res);
    }

    public int getId() {
        return id;
    }

    public List<CrewWorker> getWorkers() {
        return workers;
    }

    @Override
    public String toString() {
        return "Crew{" +
                "id='" + id + '\'' +
                ", workers=" + printWorkers() +
                '}';
    }

}
