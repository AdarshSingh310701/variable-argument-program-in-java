public class UserInterface {
    public static int addition(int... a) {
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        System.out.println("Number of arguments is " + a.length);
        return sum;
    }

    public static void main(String[] args) {
        int sum1 = addition(10, 15); // Two arguments
        System.out.println("Total " + sum1);

        int sum2 = addition(20, 30, 10); // Three arguments
        System.out.println("Total " + sum2);

        int sum3 = addition(40, 30, 20, 10, 60, 60); // Six arguments
        System.out.println("Total " + sum3);
    }
}
