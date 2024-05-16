public class logicaloperator {
    public static void main(String[] args) {
        // &&(and), ||(or), !(not)
        int a = 10;
        int b = 15;
        int x = 30;
        int y = 30;
        boolean result = x > y || a == b;
        System.out.println(!result);

    }
}
