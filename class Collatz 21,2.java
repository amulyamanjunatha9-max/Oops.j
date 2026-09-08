class Collatz {
    public static void main(String[] args) {
        int n = 21;
        while (n != 1) {
            System.out.print(n + " ");
            n = (n % 2 == 0) ? n / 2 : 3 * n + 1;
        }
        System.out.println(1);
    }
}