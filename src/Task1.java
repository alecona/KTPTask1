import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Make your choice:\n1)remainder\n2)triArea\n3)animals\n4)profitableGamble\n5)operation\n6)ctoa\n7)addUpTo\n8)nextEdge\n9)sumOfCubes\n10)abcmath\n");
        System.out.print("Your choice: ");
        int p = in.nextInt();
        switch (p) {
            case (1):
                System.out.print("Answer: " + remainder(in.nextInt(), in.nextInt()));
                break;
            case (2):
                System.out.print("Answer: " + triArea(in.nextDouble(), in.nextDouble()));
                break;
            case (3):
                System.out.print("Answer: " + animals(in.nextInt(), in.nextInt(), in.nextInt()));
                break;
            case (4):
                System.out.print("Answer: " + profitableGamble(in.nextDouble(), in.nextDouble(), in.nextDouble()));
                break;
            case (5):
                System.out.print("Answer: " + operation(in.nextInt(), in.nextInt(), in.nextInt()));
                break;
            case (6):
                System.out.print("Answer: " + ctoa(in.next().charAt(0)));
                break;
            case (7):
                System.out.print("Answer: " + addUpTo(in.nextInt()));
                break;
            case (8):
                System.out.print("Answer: " + nextEdge(in.nextInt(), in.nextInt()));
                break;
            case (9):
                System.out.print("Array length: ");
                int l = in.nextInt();
                int[] arr = new int[l];
                for(int i = 0; i<arr.length; i++) {
                    arr[i] = in.nextInt();
                }
                System.out.print("Answer: " + sumOfCubes(arr));
                break;
            case (10):
                System.out.print("Answer: " + abcmath(in.nextInt(), in.nextInt(), in.nextInt()));
                break;
            default:
                System.out.print("Bad choice.");
                break;
        }
    }
    /** Вычисление осстатка от деления a на b **/
    public static int remainder(int a, int b){
        int res = 0;
        res = a % b;
        return res;
    }
    /** Вычисление площади треугольника по основанию и высоте **/
    public static double triArea(double a, double b){
        double res = 0;
        res = 0.5 * a * b;
        return res;
    }
    /** Вычисление общего количества ног у кур, коров и свиней **/
    public static int animals(int chickens, int cows , int pigs){
        int res = 0;
        res = chickens * 2 + cows * 4 + pigs * 4;
        return res;
    }
    /** Вычисление, выгодна ли игра **/
    public static boolean profitableGamble(double prob, double prize, double pay){
        return (prob * prize > pay);
    }
    /** Вычисление, что нужно сделать с a и b, чтобы получить N **/
    public static String operation(int N, int a, int b){
        if (a + b == N) return "added";
        if (a - b == N) return "subtracted";
        if (a * b == N) return "multiplied";
        if (a / b == N) return "divided";
        return "none";
    }
    /** Возврат значения ASCII для символа **/
    public static int ctoa(char a){
        return (int) a;
    }
    /** Возврат суммы всех чисел до числа, включая его **/
    public static int addUpTo(int a){
        int res = 0;
        for(int i = 0; i < a + 1; i++) res += i;
        return res;
    }
    /** Вычисление максимального значения третьего ребра треугольника **/
    public static int nextEdge(int a, int b) {
        int res = 0;
        res = a + b - 1;
        return res;
    }
    /** Вычисление суммы кубов всех элементов массива **/
    public static int sumOfCubes(int[] array) {
        int res = 0;
        for (int i : array) {
            res += i * i * i;
        }
        return res;
    }
    /** Проверка, равно ли число a, прибавленное к себе b раз, числу c **/
    public static boolean abcmath(int a, int b, int c){
        for (int i = 0; i < b; i++) {
            a += a;
        }
        return a % c == 0;
    }
}
