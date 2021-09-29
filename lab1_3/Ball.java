public class Ball {
    private int volume;
    private String color;

    public Ball(int volume, String color) {
        this.volume = volume;
        this.color = color;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        return "Объем: " + this.volume + ", цвет: " + this.color;
    }
}
