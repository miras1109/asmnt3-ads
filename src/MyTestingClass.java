import java.util.Random;

public class MyTestingClass {
    private int number;

    public MyTestingClass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int hashCode() {
        return number % 100;
    }


}
