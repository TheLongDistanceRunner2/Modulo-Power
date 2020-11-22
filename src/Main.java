public class Main {
    public static void main(String args[]) {
        ModuloPower moduloPower1 = new ModuloPower(123, 456, 789);
        System.out.println("simple modulo: " + moduloPower1.powermod_simple(123, 456, 789) + " = " + 699);
        System.out.println("fast power modulo: " + moduloPower1.powermod_fast(123, 456, 789) + " = " + 699);
        System.out.println("======================================");
        System.out.println("simple modulo: " + moduloPower1.powermod_simple(256, 40, 100) + " = " + 76);
        System.out.println("fast power modulo: " + moduloPower1.powermod_fast(256, 40, 100) + " = " + 76);
        System.out.println("======================================");
        System.out.println("simple modulo: " + moduloPower1.powermod_simple(19, 1, 23) + " = " + 19);
        System.out.println("fast power modulo: " + moduloPower1.powermod_fast(19, 1, 23) + " = " + 19);
        System.out.println("======================================");
        System.out.println("simple modulo: " + moduloPower1.powermod_simple(4321, 5678, 9876) + " = " + 8941);
        System.out.println("fast power modulo: " + moduloPower1.powermod_fast(4321, 5678, 9876) + " = " + 8941);

        System.out.println("////////////////////////////////////////");
        System.out.println(moduloPower1.powermod_fast(3, 9, 10)); // 3 ^ 9 mod 10
        System.out.println(moduloPower1.powermod_fast(3, 51, 13)); // 3 ^ 51 mod 13
        System.out.println("////////////////////////////////////////");
        System.out.println(moduloPower1.powermod_fast(5, 3, 7));
    }
}
