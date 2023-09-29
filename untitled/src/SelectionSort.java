public class SelectionSort {
    public static void selectionSort(database[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].dataReadingSpeed() < arr[minIndex].dataReadingSpeed()) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            database temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        // Создаем массив объектов database
        database[] databases = new database[]{
                new database("Red", 100),
                new database("Blue", 50),
                new database("Green", 75),
        };

        // Выводим массив до сортировки
        System.out.println("Массив до сортировки:");
        for (database db : databases) {
            System.out.println("Цвет: " + db.getColor() + ", Скорость чтения данных: " + db.dataReadingSpeed());
        }

        // Сортируем массив
        selectionSort(databases);

        // Выводим отсортированный массив
        System.out.println("\nМассив после сортировки:");
        for (database db : databases) {
            System.out.println("Цвет: " + db.getColor() + ", Скорость чтения данных: " + db.dataReadingSpeed());
        }
    }
}