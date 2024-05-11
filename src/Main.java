import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, String> table = new MyHashTable<>();
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(random.nextInt(1000));
            table.put(key, "Value " + i);
        }

        for (int i = 0; i < table.getBucketCount(); i++) {
            int count = table.getBucketSize(i);
            System.out.println("Bucket N" + i + ": " + count + " ");
        }
    }
}
