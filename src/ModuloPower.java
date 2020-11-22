import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ModuloPower {
    private long a;
    private long b;
    private long n;
    private List<Integer> binary = new LinkedList<>();
    private StringBuilder stringBuilder = new StringBuilder();

    public ModuloPower(long a, long b, long n) {
        this.a = a;
        this.b = b;
        this.n = n;
    }

    public long powermod_simple(long a, long b, long n) {
        long tmp = a % n;

        for (long i = 0; i < b - 1; i++) {
            tmp = (tmp * (a % n)) % n;
        }

        return tmp;
    }


    // to binary functions:
    public long powermod_fast(long a, long b, long n) {
        if (b == 0){
            return 1;
        }

        if (b == 1) {
            return a % n;
        }

        long t = powermod_fast(a, b / 2, n);
        t = (t * t) % n;

        // if exponent is even value
        if (b % 2 == 0) {
            return t;
        }

        // if exponent is odd value
        else {
            return ((a % n) * t) % n;
        }
    }

    void toBinary(int number) {
        // if number is 0 break and print:
        if(number == 0) {
            System.out.println(stringBuilder);
            return;
        }

        int tmp1 = number % 2;
        // add to stringbuilder:
        stringBuilder.insert(0, tmp1);
        int tmp2 = number / 2;

        // recursively call method:
        toBinary(tmp2);
    }
}
