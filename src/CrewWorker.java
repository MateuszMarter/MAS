public class CrewWorker extends Ext {
    private static int nextID = 1;

    private int id;
    private Job job; //atr opcjonalny
    private final static float baseSalary = 2000;
    private float salary; //atr pochodny

    public CrewWorker(Job job) {
        setId();
        setJob(job);
        setSalary(job);
    }

    private void setSalary(Job job) {
        this.salary = baseSalary + job.getExtraSalary();
    }

    public void setId() {
        this.id = nextID++;
    }

    public void setJob(Job job) {
        this.job = job;
    }


    public int getId() {
        return id;
    }

    public Job getJob() {
        return job;
    }

    public float getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "CrewWorker{" +
                "id=" + id +
                ", job=" + job +
                ", salary=" + salary +
                '}';
    }
}
