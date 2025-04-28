
package mergesort;

public class mergeSort {
    
    public static void main(String[] args) {
        int[] A = {10, 9, 8, 5, 4, 3};

        System.out.println("Array original:");
        for (int value : A) {
            System.out.print(value + " ");
        }
        System.out.println();

        int p = 0;
        int r = A.length - 1;
        int q = (r / 2);

        int nL = q - p + 1;
        int nR = r - q;

        int[] L = new int[nL];
        int[] R = new int[nR];

        for (int i = 0; i < nL; i++) {
            L[i] = A[p + i];
        }
        for (int j = 0; j < nR; j++) {
            R[j] = A[q + 1 + j];
        }

        int i = 0, j = 0, k = p;
        while (i < nL && j < nR) {
            if (L[i] <= R[j]) {
                A[k++] = L[i++];
            } else {
                A[k++] = R[j++];
            }
        }

        while (i < nL) {
            A[k++] = L[i++];
        }

        while (j < nR) {
            A[k++] = R[j++];
        }

        System.out.println("Array parcialmente ordenado:");
        for (int value : A) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
