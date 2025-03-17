public class Job {
    private String title;
    private float extraSalary;

    public Job(String title, float extraSalary) {
        this.title = title;
        this.extraSalary = extraSalary;
    }

    public float getExtraSalary() {
        return extraSalary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title is required");
        }

        this.title = title;
    }

    public void setExtraSalary(float extraSalary) {
        if(extraSalary < 0) {
            throw new IllegalArgumentException("Extra salary must be >=0");
        }
    }


}
