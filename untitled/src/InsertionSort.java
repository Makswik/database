public class InsertionSort {
    public static void insertionSort(database[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            database key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].dataReadingSpeed() > key.dataReadingSpeed()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        database[] arr = new database[3];
        arr[0] = new database("Red", 5);
        arr[1] = new database("Blue", 2);
        arr[2] = new database("Green", 7);

        System.out.println("Before sorting:");
        for (database item : arr) {
            System.out.println("Color: " + item.getColor() + ", Data Reading Speed: " + item.dataReadingSpeed());
        }

        insertionSort(arr);

        System.out.println("\nAfter sorting:");
        for (database item : arr) {
            System.out.println("Color: " + item.getColor() + ", Data Reading Speed: " + item.dataReadingSpeed());
        }
    }
}