public class DatabaseSorter {
    public static void main(String[] args) {
        database[] databases = new database[5];
        databases[0] = new database("Red", 100);
        databases[1] = new database("Green", 75);
        databases[2] = new database("Blue", 50);
        databases[3] = new database("Yellow", 125);
        databases[4] = new database("Purple", 25);

        System.out.println("Before sorting:");
        for (int i = 0; i < databases.length; i++) {
            System.out.println(databases[i].getColor() + " " + databases[i].dataReadingSpeed());
        }

        // Bubble sort
        for (int i = 0; i < databases.length - 1; i++) {
            for (int j = 0; j < databases.length - i - 1; j++) {
                if (databases[j].dataReadingSpeed() > databases[j+1].dataReadingSpeed()) {
                    // Swap databases[j] and databases[j+1]
                    database temp = databases[j];
                    databases[j] = databases[j+1];
                    databases[j+1] = temp;
                }
            }
        }

        System.out.println("After sorting:");
        for (int i = 0; i < databases.length; i++) {
            System.out.println(databases[i].getColor() + " " + databases[i].dataReadingSpeed());
        }
    }
}
