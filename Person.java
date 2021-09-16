public class Person {
    private int age;
    private float height;
    private String name;
    private boolean now;
    static final int AGE=100;
    static final float HEIGHT=50.3f;

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public boolean setAge(int age) {
        this.age = age;
        if (age>AGE)
            now = false;
        else
            now=true;
        return now;
    }

    public float getHeight() {
        return height;
    }

    public boolean setHeight(float height) {
        this.height = height;
        if (height>HEIGHT)
            now = false;
        else
            now=true;
        return now;
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        this.name = name;
        if (name.isEmpty())
            now = false;
        else
            now=true;
        return now;
    }
    void info() {
        System.out.printf("age=%d, streit=%f, name=%s", age, height, name);
    }
    boolean valid() {
        return now;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}
