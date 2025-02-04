package Lista1.Q20;

public class Main {
    public static void main(String[] args) {
        int [] vet = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Normal    : ");
        for(int i = 0; i < vet.length; i++)
            System.out.print(vet[i] + " ");
        System.out.print("\nInvertido : ");
        int [] a = invertArray(vet);
        for(int i = 0; i < vet.length; i++)
            System.out.print(a[i] + " ");
    }

    public static int[] invertArray(int[] a) {
        int n = a.length;
        int [] temp = new int[n];
        for (int i = 0, j = n-1; i < n; i++, j--) {
            temp[i] = a[j];
        }
        return temp;
    }

    public static int[] invertArrayVeloz(int[] a) {
        for (int i = 0, j = a.length-1; i < j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        return a;
    }
}
