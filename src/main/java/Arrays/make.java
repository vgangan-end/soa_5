package Arrays;

public class make {
    public static int[] make(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        return a;
    }
}

// Creaza un Array din lungimea n si populeaza cu elemente index+1