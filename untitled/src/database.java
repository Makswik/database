public class database {
    private String color;
    private int dataReadingSpeed;

    public database(String color, int dataReadingSpeed) {
        this.color = color;
        this.dataReadingSpeed = dataReadingSpeed;
    }
    public String getColor() {
        return color;
    }
    public void setcolor(String color) {
        this.color = color;
    }
    public  int dataReadingSpeed() {
        return dataReadingSpeed;
    }
    public void setdataReadingSpeed(int dataReadingSpeed) {
        this.dataReadingSpeed = dataReadingSpeed;
    }

}
