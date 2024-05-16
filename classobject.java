/**
 * Innerclassandobject
 */
class Innerclassandobject {
    int a;

    public int add(int m1, int m2) {
        int k = m1 + m2; // Use the method parameters m1 and m2
        return k;
    }
}

public class classobject {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 8;
        Innerclassandobject inner = new Innerclassandobject();
        int result = inner.add(num1, num2); // Pass num1 and num2 to the add method
        System.out.println(result); // Output the result
    }
}
