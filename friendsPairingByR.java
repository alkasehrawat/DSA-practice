public class friendsPairingByR {
    public static int friendsPairing(int n) {
        //base case
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        //if alone
        int alone = friendsPairing(n - 1);
        //if  pair up
        int pair = friendsPairing(n - 2) * (n - 1);
        return alone + pair;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(friendsPairing(n));
    }
}
