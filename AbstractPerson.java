public abstract class AbstractPerson implements HumanInterface {
    protected String name;
    public AbstractPerson(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract String think();
}

