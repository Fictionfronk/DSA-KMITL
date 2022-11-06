class StudentQuickSort {
    public static void quickSort(int[] keys, int begin, int end) {
        int partitionIndex;
        if (begin < end) {
            partitionIndex = partition(keys, begin, end);
            quickSort(keys, begin, partitionIndex - 1);
            quickSort(keys, partitionIndex + 1, end);
        }
    }

    public static int partition(int[] keys, int begin, int end) {
        int middleIndex = (begin + end) / 2;
        if (keys[middleIndex] <= keys[begin]) swap(keys, middleIndex, begin);
        if (keys[end] <= keys[begin]) swap(keys, end, begin);
        if (keys[end] <= keys[middleIndex]) swap(keys, end, middleIndex);
        swap(keys, middleIndex, end - 1);
        int pivot = keys[end];
        int i = begin - 1;
        for (int j = begin; j < end; j++) {
            if (keys[j] <= pivot) {
                swap(keys, ++i, j);
            }
        }
        swap(keys, i + 1, end);
        return i + 1;
    }


    public static void swap(int[] keys, int index1, int index2) {
        int temp = keys[index1];
        keys[index1] = keys[index2];
        keys[index2] = temp;
    }

    public static void sort(int[] keys) {
        quickSort(keys, 0, keys.length - 1);
    }
}