public class ClientTest {
    private static String service = "Продажа";
    private static float price = 234;
    private static String name = "Sara";
    public static void main(String[] args) {
        Client client = new Client(name, service, price);
        System.out.println("Услуга: " + client.getService());
        System.out.println("Цена: " + client.getPrice());
        System.out.println(client.think());
    }

}
