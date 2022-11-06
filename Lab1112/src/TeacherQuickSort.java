class TeacherQuickSort {
    static void quickSort(int keys[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(keys, begin, end);

            quickSort(keys, begin, partitionIndex - 1);
            quickSort(keys, partitionIndex + 1, end);
        }
    }

    static int partition(int keys[], int begin, int end) {
        int pivot = keys[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (keys[j] <= pivot) {
                i++;

                int swapTemp = keys[i];
                keys[i] = keys[j];
                keys[j] = swapTemp;
            }
        }

        int swapTemp = keys[i + 1];
        keys[i + 1] = keys[end];
        keys[end] = swapTemp;

        return i + 1;
    }

    static void sort(int keys[]) {
        quickSort(keys, 0, keys.length - 1);
    }
}