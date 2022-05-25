public class SortingMethods {

    static int arr[] = { 3, 1, 4, 1, 5, 9, 2, 6 };
    static int n = arr.length;
    static SortingMethods bubble = new SortingMethods();

    static int arr2[] = { 2, 4, 7, 9, 3, 1, 5, 8 };
    static int l = arr2.length;
    static SortingMethods quickSort = new SortingMethods();

    public static void main(String[] args) throws Exception {

        //Bubble Sort Call Method
        System.out.println("Before sorting: ");
        SortingMethods.print(arr);
        SortingMethods.BubbleSort(arr);
        System.out.println("After sorting: ");
        SortingMethods.print(arr);

        //QuickSort Call Method
        System.out.println("Before sorting:");
        SortingMethods.print(arr2);
        SortingMethods.quickSort(arr2, 0, arr2.length - 1);
        System.out.println("After sorting: ");
        SortingMethods.print(arr2);

    }

    static void BubbleSort(int[] arr) {

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    static void quickSort(int[] arr, int lowPointer, int highPointer) {

        int pivot = arr[lowPointer];
        int l = lowPointer;
        int h = highPointer;
        int temp;

        while (l < h) {

            while (arr[l] <= pivot && l < h) 
                l++;
            

            while (arr[h] > pivot) 
                h--;

                if (l < h) {

                    temp = arr[l];
                    arr[l] = arr[h];
                    arr[h] = temp;

                }
            }

                arr[lowPointer] = arr[h];
                arr[h] = pivot;

                if (lowPointer < h - 1) {
                    quickSort(arr, lowPointer, h - 1);
                }

                if (h + 1 < highPointer) {
                    quickSort(arr, h + 1, highPointer);
                }
                
            }
            
    static void print(int arr[]) {

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
