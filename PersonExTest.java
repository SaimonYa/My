public class PersonExTest {
    private static int age=20;
    private static float height=45;
    private static String name="Sara";

    public static void main(String[] args) {
        PersonEx person = new PersonEx();
        person.setGender(PersonEx.Gender.FEMALE);
        System.out.println("Гендер: "+ person.getGender().getStrvalue());
        try {
            person.setAge(age);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Возраст: " + person.getAge());
        try {
            person.setHeight(height);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Рост: " + person.getHeight());
        try {
            person.setName(name);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Имя: " + person.getName());
        System.out.println(person);
        age=200;
        height=200;
        name="";
        try {
            person.setAge(age);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        try {
            person.setHeight(height);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            person.setName(name);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
