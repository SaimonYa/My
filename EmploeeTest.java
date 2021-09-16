public class EmploeeTest {
    private static String department = "Продаж";
    private static String position = "Продавец";
    private static String name = "Sara";
    public static void main(String[] args) {
        Emploee emp = new Emploee(name, department, position);
        System.out.println("Отдел: " + emp.getDepartment());
        System.out.println("Должность: " + emp.getPosition());
        System.out.println(emp.think());
    }
}
