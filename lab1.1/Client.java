public final class Client extends AbstractPerson {
    final String service;
    final float price;
    public Client(String name, String service, float price) {
        super(name);
        this.service = service;
        this.price = price;
    }

    public String getService() {
        return service;
    }

    public float getPrice() {
        return price;
    }

    public String think() {
        return "Услуга, " + service + ", выполнена неплохо. Но цена " + price + " большевата.";
    }
}
