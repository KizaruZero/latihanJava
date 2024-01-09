import java.util.Arrays;

public class operasiArray {
    public static void main(String[] args) {
        int[] arrayData = {6, 7, 8, 9, 10};
        // Meurubah array menjadi string
        printArray(arrayData);
        System.out.println("Meng-Copy Array");
        int[] arrayData2 = new int[5];
        printArray(arrayData);
        printArray(arrayData2); // ini hasilnya 0 semua karena belum dikasih nilai

        // Copy array dengan looping
        for (int i = 0; i < arrayData.length; i++) {
            arrayData2[i] = arrayData[i];
        }
        printArray(arrayData);
        printArray(arrayData2);

        System.out.println("Meng-Copy array dengan copyOf");
        int[] arrayData3 = Arrays.copyOf(arrayData, 5);
        printArray(arrayData3);

    }

    private static void printArray(int[] dataArray) {
        System.out.println("Array = " + Arrays.toString(dataArray));
    }  // function untuk mengubah array menjadi string
}
