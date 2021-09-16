public class PersonTest {
    private static int age=20;
    private static float height=45;
    private static String name="Sara";
    public static void main(String[] args) {
        Person person=new Person();
        person.setAge(age);
        System.out.println("Возраст: " + person.getAge());
        person.setHeight(height);
        System.out.println("Рост: " + person.getHeight());
        person.setName(name);
        System.out.println("Имя: " + person.getName());
        person.info();
        if (person.valid()) System.out.println(person);
        age=200;
        if (!person.setAge(age)) System.out.println("Неверный возраст: " + age);
        height=60;
        if (!person.setHeight(age)) System.out.println("Неверный рост: " + height);
        name="";
        if(name.isEmpty()) System.out.println("Имя не введено");
    }
}



