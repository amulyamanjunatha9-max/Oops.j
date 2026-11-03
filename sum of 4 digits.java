class Sum {
    public static void main(String[] args) {
        int n = 1234;
        int sum = n/1000 + n/100%10 + n/10%10 + n%10;
        System.out.println("Sum = " + sum);
    }
}