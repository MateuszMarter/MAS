public class Module extends Ext {
    private int id;
    private String name;
    private float size;
    private static int nextId = 1;

    public Module(String name, float size) {
        super();
        setName(name);
        setSize(size);
        setId();
    }

    private void setId() {
        this.id = nextId++;
    }

    public void setName(String name) {
        if(name != null && !name.isBlank()){
            this.name = name;
        } else  {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    public void setSize(float size) {
        if(size > 0) {
            this.size = size;
        } else {
            throw new IllegalArgumentException("Size must be >0");
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSize() {
        return size;
    }


    @Override
    public String toString() {
        return "Module{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
