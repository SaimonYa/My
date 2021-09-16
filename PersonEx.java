public class PersonEx {
    private int age;
    private float height;
    private String name;
    private Gender gender;
    static final int AGE=100;
    static final float HEIGHT=50.3f;
    private Object Exception;


    public enum Gender
    {
        MALE(1,"Men"),
        FEMALE(2, "Women"),
        OTHER(1024, "Other");
        private final int value;
        private final String strvalue;

        Gender(int value, String strvalue) {
            this.value=value;
            this.strvalue=strvalue;
        }
        int getValue() {
            return this.value;
        }
        String getStrvalue() {
            return this.strvalue;
        }

    }
    public PersonEx() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception
    {
        if(age>AGE)
        {
            throw new Exception("Неверный возраст: " + age);
        }
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) throws Exception
    {
        if(height>HEIGHT)
        {
            throw new Exception ("Неверный рост: " + height);
        }
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception
    {
        if(name.isEmpty())
        {
            throw new Exception ("Имя не введено");
        }
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    void info() {
        System.out.printf("age=%d, streit=%f, name=%s", age, height, name);
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
