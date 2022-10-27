import java.util.Random;

public class TestClass {
    @TimeRecord
    public void TestMethod() {
        int[] arr = new int[100];
        var r = new Random();
        for(int i = 0; i < 100; i++){
            arr[i] = r.nextInt(1000);
        }

        bubbleSort(arr);
    }

    void bubbleSort(int arr[]) {
        if (arr == null) return;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
}
