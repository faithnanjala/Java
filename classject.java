class Innerclassandobject {
    int a;

    public int add(int m1, int m2) {
        int k = m1 + m2;
        return k;
    }
}

public class classject {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 8;
        Innerclassandobject inner = new Innerclassandobject();
        int result = inner.add(num1, num2);
        System.out.println(result);
    }
}
