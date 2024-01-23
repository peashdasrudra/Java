public class BitsToChange {
    public static void main(String[] args) {
        int A = 31;
        int B = 14;

        int xorResult = A ^ B;
        int bitsToChange = Integer.bitCount(xorResult);

        System.out.println("Number of bits to change: " + bitsToChange);
    }
}
