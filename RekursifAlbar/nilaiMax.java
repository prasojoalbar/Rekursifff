package rekursif.tugas;
public class nilaiMax {
    public static int cariMax(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        int x = cariMax(arr, n - 1);

        return Math.max(arr[n - 1], x);
    }

    public static void main(String[] args) {
        int[] arr = {10,54,33,27,86,82,55};
        int n = arr.length;

        int max = cariMax(arr, n);
        System.out.println("Nilai maksimum dalam array adalah: " + max);
    }
}