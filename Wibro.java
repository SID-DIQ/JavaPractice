import java.util.Scanner;
 class Main {
    public static int findKey(int input1, int input2, int input3) {
        int thousands_digit = (input1 / 1000) % 10;
        int hundreds_digit = (input2 / 100) % 10;
        int largest_digit = 0;
        int temp = input3;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit > largest_digit) {
                largest_digit = digit;
            }
            temp /= 10;
        }
        int key = (thousands_digit * hundreds_digit) - largest_digit;
        return key;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input1: ");
        int input1 = scanner.nextInt();
        System.out.print("Enter input2: ");
        int input2 = scanner.nextInt();
        System.out.print("Enter input3: ");
        int input3 = scanner.nextInt();
        int key = findKey(input1, input2, input3);
        System.out.printf("Key: %d\n", key);
    }
}