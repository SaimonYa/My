public final class Emploee extends AbstractPerson {
    final String department;
    final String position;
    public Emploee(String name, String department, String position) {
        super(name);
        this.department = department;
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }
    public String think() {
        return ("Должность, " + position + ", хороша, но отдел " + department + " не очень.");
    }
}