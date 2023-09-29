public class HeapSort {
    public void heapSort(int[] arr) {
        int n = arr.length;

        // Построение max-heap (пирамиды)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Извлекаем элементы из пирамиды по одному и помещаем их в конец массива
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Вызываем heapify для уменьшенной пирамиды
            heapify(arr, i, 0);
        }
    }

    // Процедура для построения пирамиды с корнем в вершине i
    void heapify(int arr[], int n, int i) {
        int largest = i; // Инициализируем наибольший элемент как корень
        int left = 2 * i + 1; // Левый потомок
        int right = 2 * i + 2; // Правый потомок

        // Если левый потомок больше корня
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Если правый потомок больше корня
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // Если наибольший элемент не корень
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Рекурсивно heapify поддерево
            heapify(arr, n, largest);
        }
    }

    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        HeapSort heapSort = new HeapSort();
        heapSort.heapSort(arr);

        System.out.println("Отсортированный массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}