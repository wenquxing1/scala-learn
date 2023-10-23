package test01;

public class test_Recursion {
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(fact1(5));
    }
    public static int fact(int n){
        int re = 1;
        for(int i = 1; i <= n; i++){
            re *= i;
        }
        return re;
    }
    public static int fact1(int m){
        if(m == 0) return 1;
        return m * fact1(m - 1);
    }
}
